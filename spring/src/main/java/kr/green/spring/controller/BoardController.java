package kr.green.spring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.utils.UploadFileUtils;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	@Resource
	private String uploadPath;
	@Autowired
	PageMakerService pageMakerService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String boardListGet(Model model, Criteria cri) {
		cri.setPerPageNum(2);
		ArrayList<BoardVO> boardList = boardService.getBoardList(cri);
		int totalCount = boardService.getTotalCount(cri);
		
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
		
		model.addAttribute("pageMaker", pm);
		model.addAttribute("list", boardList);
		return "board/list";
	}
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String boardDisplayGet(Model model,Integer num) {
		//조회수 증가
		boardService.updateViews(num);
		BoardVO bVo = boardService.getBoard(num);
		
		model.addAttribute("board", bVo);
		return "board/display";
	}
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String boardModifyGet(Model model,Integer num, HttpServletRequest r) {
		if(!boardService.isWriter(num,r)) {
			return "redirect:/board/list";
		}
		BoardVO bVo = boardService.getBoard(num);
		
		model.addAttribute("board", bVo);
		return "board/modify";
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String boardModifyPost(Model model,BoardVO bVo, HttpServletRequest r,MultipartFile file2) throws IOException, Exception  {
		
		if(file2.getOriginalFilename().length() != 0) {
			String file = UploadFileUtils.uploadFile(
							uploadPath, 
							file2.getOriginalFilename(),
							file2.getBytes());;
			bVo.setFile(file);
		}
		//첨부파일에 추가한 파일이 없는 경우
		else {
			if(bVo.getFile().length() == 0) {
				bVo.setFile("");
			}else {
				BoardVO tmp = boardService.getBoard(bVo.getNum());
				bVo.setFile(tmp.getFile());	
			}
			
		}
		
		boardService.updateBoard(bVo,r);
		model.addAttribute("num", bVo.getNum());
		return "redirect:/board/display";
	}
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String boardRegisterGet() {
		return "board/register";
	}
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String boardRegisterPost(MultipartFile file2,BoardVO boardVo) throws IOException, Exception {

		if(file2.getOriginalFilename().length() != 0) {
			String file = UploadFileUtils.uploadFile(
							uploadPath, 
							file2.getOriginalFilename(),
							file2.getBytes());;
			boardVo.setFile(file);
		}
		boardService.registerBoard(boardVo);
		
		return "redirect:/board/list";
	}
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String boardDeleteGet(Integer num,HttpServletRequest r) {
		if(boardService.isWriter(num,r)) {
			boardService.deleteBoard(num);
		}
		return "redirect:/board/list";
	}
	
	@RequestMapping("/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
	@RequestMapping(value= {"/test/home","/test/home.do"})
    public ModelAndView openTilesView(ModelAndView mv,Criteria cri) throws Exception{
        mv.setViewName("/test/home");
        cri.setPerPageNum(2);
		ArrayList<BoardVO> boardList = boardService.getBoardList(cri);
		int totalCount = boardService.getTotalCount(cri);
		
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
		
        mv.addObject("pageMaker", pm);
        mv.addObject("list", boardList);
        return mv;
    }
}
