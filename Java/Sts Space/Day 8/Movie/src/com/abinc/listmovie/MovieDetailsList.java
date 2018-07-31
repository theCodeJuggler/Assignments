package com.abinc.listmovie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieDetailsList {

	List<MovieDetails> movieList = new ArrayList<>();
	
	//function to add movie
	public void addMovie(MovieDetails mvd)
	{
		movieList.add(mvd);
		System.out.println("After Adding :: ");
		movieList.stream().forEach((movieList) -> System.out.println(movieList));
	}
	
	//function to remove movie
	public void remMovie(MovieDetails mvd)
	{
		movieList.remove(mvd);
		System.out.println("After Removing :: ");
		movieList.stream().forEach((movieList) -> System.out.println(movieList));
	}
	
	//function to remove the whole list
	public void remAllMovie()
	{
		movieList.removeAll(movieList);
		System.out.println("After Removing All :: ");
		movieList.stream().forEach((movieList) -> System.out.println(movieList));
	}
	
	//function to find movie by name
	public MovieDetails findByMovieName(String mvd)
	{
		for (MovieDetails movie : movieList)
		{
			if (movie.getMovName().equals(mvd))
			{ 
				return movie;
			}
		}
		return null;
	}
	
	//function to find movie by genre
	public MovieDetails findByMovieGenre(String movieGenre) 
	{
		for (MovieDetails movie : movieList) 
		{
			if (movie.getGenre().equals(movieGenre))
			{ 
				// if Movie Genre Equal to passes movie Genre then return object of that movie
				return movie;
			}
		}
		
		return null;
	}
	
	//function to call the desired sort class
	public void sortin(String parameter)
	{
		
		if (parameter.equals("Movie Name"))
		{ 
			// if Passed parameter is equal to Movie_Name
			Collections.sort(movieList, new SortingByName());// Call sort method of Collections with arrayList and
			// object of Required class which implements
			// Comparator
			movieList.stream().forEach((movie) -> System.out.println(movie));
		}
		else if (parameter.equals("Lead Actor")) 
		{ 
			// if Passed parameter is equal to Lead Actor
			Collections.sort(movieList, new SortByLeadActor()); // Call sort method of Collections with arrayList and
			// object of Required class which implements
			// Comparator
			movieList.stream().forEach((movie) -> System.out.println(movie));
		}
		else if (parameter.equals("Lead Actress")) 
		{
			Collections.sort(movieList, new SortByLeadActress());
			movieList.stream().forEach((movie) -> System.out.println(movie));
		}
		else if (parameter.equals("Genre")) 
		{
			Collections.sort(movieList, new SortByGenre());
			movieList.stream().forEach((movie) -> System.out.println(movie));
		} 
		else
		{
			System.out.println("Invalid Parameter Entered");
		}
	}
}
