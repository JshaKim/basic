package com.ohgiraffers.exam_ex.board.controller;

import com.ohgiraffers.exam_ex.board.model.BoardDTO;
import com.ohgiraffers.exam_ex.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired // 의존성 주입
    private BoardService boardService; // UserService를 userService에 주입한다.

    @GetMapping("/post")
    public void post() {
        // resouce/templates/board/post.html
    }

    @PostMapping("/post") // "/post" url로 들어오는 post 요청을 postText 메서드가 처리하겠음.
    public ModelAndView postText(@ModelAttribute BoardDTO boardDTO, ModelAndView mv) { // 반환 타입이 String인 postText 메서드를 정의하고, BoardDTO를 바인딩하여 유효성 검사를 수행하라.

        // null 값 여부 확인
        if (boardDTO == null) { // 만약 DTO에 입력된 값이 없는 경우
            // /resouces/templates/입력된 데이터가 없습니다..html
            mv.addObject("message", "값이 입력되지 않았습니다.");
            mv.setViewName("board/test");
            return mv; // 메세지를 반환

        } else {
            int resulte = boardService.createBoard(boardDTO);

            if (resulte > 0) {
                mv.addObject("message","입력 성공");
            } else {
                mv.addObject("message","입력 실패");
            }
            mv.setViewName("board/test");
        }
        return mv;
    }
}


//         // DTO에 담긴 내용들을 출력
//        ; // userService 객체의 createBoard 메서드를 호출하여 boardDTO에 포함된 정보를 바탕으로 새로운 게시판을 생성하라
//        return "post";
