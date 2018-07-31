package com.abinc.listmovie;

import java.io.*;

public class Test {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//creating the movie objects
		MovieDetails mvdOne = new MovieDetails("Saving Private Ryan","Tom Hanks","Tommy Hanky","War");
		MovieDetails mvdTwo = new MovieDetails("Fury","Brad Pitt","Brady","War");
		MovieDetails mvdThree = new MovieDetails("Rush Hour","Zackie Chan","Chin Lee","Comedy_Action");
		MovieDetails mvdFour = new MovieDetails("The A-Team","Nelson","Jessica Alba","Action");
		
		MovieDetailsList mvdl = new MovieDetailsList();
		
		//adding movies to the list
		mvdl.addMovie(mvdOne);
		mvdl.addMovie(mvdTwo);
		mvdl.addMovie(mvdThree);
		mvdl.addMovie(mvdFour);
		
		//remove one file
		mvdl.remMovie(mvdThree);
		
		//searching by genre and name
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Find By Genre :: "+mvdl.findByMovieGenre("War"));
		System.out.println("Find By Name :: "+mvdl.findByMovieName("Fury"));
		
		//sorting by taking Parameter Input
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("\nEnter The Parameter of Sort :: 1.Movie Name 2.Lead Actor 3.Lead Actress 4.Genre");
		String parameter = in.readLine();
		System.out.println("After Sorting");
		mvdl.sortin(parameter);
		
		//removing the whole list
		mvdl.remAllMovie();
	}

}
