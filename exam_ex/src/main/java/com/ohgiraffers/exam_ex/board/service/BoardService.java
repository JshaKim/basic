package com.ohgiraffers.exam_ex.board.service;

import com.ohgiraffers.exam_ex.board.entity.BoardEntity;
import com.ohgiraffers.exam_ex.board.model.BoardDTO;
import com.ohgiraffers.exam_ex.board.repogitory.BoardRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public int createBoard(BoardDTO boardDTO) {
        // 중복된 이름 검사
        List<BoardEntity> boardEntities = boardRepository.findAll();
        if (boardEntities.size() > 0) {
            for (BoardEntity boardEntity : boardEntities) {
                if(boardEntity.getPostUername().equals(boardDTO.getUsername())) {
                    return 0;
                }
                if(boardEntity.getPost_title().equals(boardDTO.getTitle())) {
                    return 0;
                }
            }
        }
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setPostUername(boardDTO.getUsername());
        boardEntity.setPost_title(boardDTO.getTitle());
        boardEntity.setPost_content(boardDTO.getContent());
        BoardEntity result = boardRepository.save(boardEntity);
        if (result != null) {
            return 1;
        } else {
            return 0;
        }
    }
}