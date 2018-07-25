package com.scp.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class TestWeakHashMap {
	
	public static void main(String[] args) {
		
		Integer i1 = 10;
		Integer i2 =10;
		

		Integer i3 = 150;
		Integer i4 =150;
		
		System.out.println(i1==i2); //true
		System.out.println(i3==i4); //false
		
		
		int i=1020;
		int j=01020;
		//int c =09026; // 0 -7 
		
		//if int no started with 0 -- thn there should not be 8 and 9 as there is no represnttion for 8/9 in an octal 
		
		Emp5 e1 = new Emp5("A1",1); //e1 e3 
		Emp5 e2 = new Emp5("A2",1); //e2 e4
		Emp5 e3 = new Emp5("A1",1);
		Emp5 e4 = new Emp5("A2",1);
		
		//2

		//2
		
		
		HashMap<Emp5,String> hashmap = new HashMap<>();
		hashmap.put(e1,"Emp51");
		
		WeakHashMap<Emp5,String> weakHash = new WeakHashMap<>();
		weakHash.put(e2,"Emp52");
		//weakHash.put(null, "Emp50");
		
		System.gc();
		
		System.out.println("before");
		System.out.println(hashmap.size());//1
		System.out.println(weakHash.size());//2/1
		
		e1=null;
		e2=null;
		
		System.gc(); //
		
		System.out.println("after");
		System.out.println(hashmap.size());//1
		System.out.println(weakHash.size());//0
		
		
		//size //hashcodeequals key
		Emp5 e11 = new Emp5("A1",1); //e1 e3 
		Emp5 e21 = new Emp5("A2",1); //e2 e4
		Emp5 e31 = new Emp5("A1",1);
		Emp5 e41 = new Emp5("A2",1);

		

		HashMap<Emp5,String> hMap = new HashMap<>();//16  0.75  doubles hashcode
		hMap.put(e11,"Emp51"); //check hashcode and equals -- name
		hMap.put(e21,"Emp52");
		hMap.put(e31,"Emp53");
		hMap.put(e41,"Emp54"); //2
		hMap.put(e11,"Emp55");
		System.out.println("Hashmap Size -- "+hMap.size());//2 --e1 Emp55  e2 Emp54		
		System.out.println(hMap);

		System.out.println("-------------------");
		IdentityHashMap<Emp5, String> iHashmap = new IdentityHashMap<>();//21  2/3  doubles System.identityHashCode(x);
		iHashmap.put(e11,"Emp51"); //check ref equality
		iHashmap.put(e21,"Emp52");
		iHashmap.put(e31,"Emp53");
		iHashmap.put(e41,"Emp54"); //2
		iHashmap.put(e11,"Emp55");
		System.out.println("Ihashmap Size -- "+iHashmap.size());//2 --e1 Emp55  e2 Emp54		
		System.out.println(iHashmap);

		
		/**
		 * Weakhashmap
		 * 		-- if key becomes weak/null that entry will be removed by 
		 * 			whashmap from hashtable -- that happens after garbage collection
		 * 			-- that we cannot handle programmatically
		 * 		-- browser caching
		 * 		-- 16 
		 * 		--.75
		 * 		--
		 * 
		 * IdentityHashmap
		 * 		-- 21 -- capacity
		 * 		-- 2/3 load factor
		 * 		-- always does -- ref equality never performs content equality
		 * 			even after you override it into your domain class
		 * 		-- always uses System.identityHashCode(x);  even after you override it into hashcode
		 * 			your domain class
		 * 
		 *
		 * 
		 * while(){
		 * 	sysout()
		 * }
		 * 
		 * while()
		 * {
		 * sysout()
		 * }
		 *
		 *
		 * for(int i=0;i<1000;i++){
		 * }
		 * 
		 * for(int i=1000;i<0;i--){ //fast
		 * }
		 * 
		 */
		
	}

}

class Emp5
{
	String name;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Emp5(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Emp5 [name=" + name + ", id=" + id + "]";
	}
	
}