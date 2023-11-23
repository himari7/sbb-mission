package com.example.projext2311.answer;

import com.example.projext2311.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Question, Integer> {
}
