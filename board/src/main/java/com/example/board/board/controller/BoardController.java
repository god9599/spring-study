package com.example.board.board.controller;

import com.example.board.board.dto.BoardDto;
import com.example.board.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/openBoardList.do")
    public ModelAndView openBoardList() throws Exception {
        log.debug("openBoardList");
        ModelAndView mv = new ModelAndView("/board/boardList");
        List<BoardDto> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }

    @GetMapping("/board/openBoardWrite.do")
    public String openBoardWrite() throws Exception {
        return "/board/boardWrite";
    }

    @PostMapping("/board/insertBoard.do")
    public String insertBoard(BoardDto boardDto) throws Exception {
        boardService.insertBoard(boardDto);
        return "redirect:/board/openBoardList.do";
    }

    @GetMapping("board/openBoardDetail.do")
    public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardDetail");

        BoardDto boardDto = boardService.selectBoardDetail(boardIdx);
        mv.addObject("board", boardDto);

        return mv;
    }

    @RequestMapping("board/updateBoard.do")
    public String updateBoard(BoardDto boardDto) throws Exception {
        boardService.updateBoard(boardDto);
        return "redirect:/board/openBoardList.do";
    }

    @RequestMapping("board/deleteBoard.do")
    public String deleteBoard(int boardIdx) throws Exception {
        boardService.deleteBoard(boardIdx);
        return "redirect:/board/openBoardList.do";
    }
}
