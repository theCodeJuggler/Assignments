package com.abinc.listmovie;

import java.util.Comparator;

class SortingByName implements Comparator<MovieDetails>
{
	// Used for sorting in ascending order of Movie_Name
	public int compare(MovieDetails mvO, MovieDetails mvT) // Overriding Compare method
	{
		return mvO.getMovName().compareTo(mvT.getMovName());
	}
}
class SortByLeadActor implements Comparator<MovieDetails>
{
	// Used for sorting in ascending order of Lead_Actor
	public int compare(MovieDetails mvO, MovieDetails mvT)
	{
		return mvO.getLeadActor().compareTo(mvT.getLeadActor());
	}
}
class SortByLeadActress implements Comparator<MovieDetails>
{
	// Used for sorting in ascending order of Lead_Actress
	public int compare(MovieDetails mvO, MovieDetails mvT)
	{
		return mvO.getLeadActress().compareTo(mvT.getLeadActress());
	}
}
class SortByGenre implements Comparator<MovieDetails>
{
	// Used for sorting in ascending order of Genre
	public int compare(MovieDetails mvO, MovieDetails mvT)
	{
		return mvO.getGenre().compareTo(mvT.getGenre());
	}
}
