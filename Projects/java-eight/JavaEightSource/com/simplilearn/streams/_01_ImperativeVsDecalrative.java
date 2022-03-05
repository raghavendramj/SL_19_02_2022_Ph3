package com.simplilearn.streams;

import java.util.Arrays;
import java.util.List;

public class _01_ImperativeVsDecalrative {

	static class Movie {
		private String title;
		private int likes;

		public Movie(String title, int likes) {
			this.title = title;
			this.likes = likes;
		}

		public int getLikes() {
			return likes;
		}

		public void setLikes(int likes) {
			this.likes = likes;
		}
	}

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("A", 10),
				new Movie("B", 15), 
				new Movie("C", 20));
		
		
		 //Imperative programming -> How -> algo to check the movies > 10 likes
		int moreThanTenLikes = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10)
                moreThanTenLikes++;
        }
        System.out.println("Imperative programming - moreThanTenLikes -> "+ moreThanTenLikes);
        
        //Declarative programming - What
        long countOfMoviesGt10 = movies.stream().filter((movie) -> movie.getLikes() > 10).count();
        System.out.println("Declarative programming - moreThanTenLikes -> "+ countOfMoviesGt10);
        
	}
}
