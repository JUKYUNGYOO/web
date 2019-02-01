package com.example.webmaster.repository;


import com.example.webmaster.domain.Board;
import com.example.webmaster.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}