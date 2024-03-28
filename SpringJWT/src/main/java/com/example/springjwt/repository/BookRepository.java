package com.example.springjwt.repository;

import com.example.springjwt.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {

    Optional<BookEntity> findByTitle(String title);
//    Boolean existsByTitle(String title);
//    Boolean existsByAuthor(String author);
//    Boolean existsByGenre(String genre);
//    Boolean existsByLocationInfo(String locationInfo);
//    Boolean existsByRentalState(Boolean rentalState);

}