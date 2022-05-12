package com.chainsys.unittest;

import com.chainsys.classandmethods.Movie;

public class Testmovie {
	public static void movietest() {
		Movie firstmovie=new Movie("valimai");
		firstmovie.setDirector("H vinoth");
	firstmovie.setHero("ajith");
	firstmovie.setPrice(200);
	firstmovie.setCertificate('u');
System.out.println(firstmovie.getName());
System.out.println(firstmovie.getDirector());
System.out.println(firstmovie.getHero());
System.out.println(firstmovie.getPrice());
System.out.println(firstmovie.getCertificate());



	}

}
