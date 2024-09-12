package com.ohgiraffers.exam_ex.board.repogitory;

import com.ohgiraffers.exam_ex.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
}
