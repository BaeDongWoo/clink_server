<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> e7dbb8331f17a22d8d9ddedf9011b5d6ffe46c6b
package com.josam.clink;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.josam.clink.challenge.ChallengeMapper;
import com.josam.clink.challenge.ChallengeService;
import com.josam.clink.challenge.ChartVO;
import com.josam.clink.challenge.HistoryVO;
import com.josam.clink.challenge.SuccessVO;
<<<<<<< HEAD
import com.josam.clink.user.UserVO;
=======
>>>>>>> e7dbb8331f17a22d8d9ddedf9011b5d6ffe46c6b
import com.josam.clink.user.User_MasterVO;

@SpringBootTest
@AutoConfigureMockMvc
public class AccountTest {
	
	@Test
	public void test() {
		System.out.println("sss");
	}
	
	@Autowired
	ChallengeMapper mapper;
	
	@Autowired
	ChallengeService cs = new ChallengeService();
	/*
	 * 초기 데이터 입력용도
	 * */
	@Test
	public void insertAllSuccess() {
		User_MasterVO uvo = new User_MasterVO();
		uvo.setUser_no("00000");

		List<SuccessVO> list = mapper.getAllHistoryForInsertSuccess(uvo);
		BigDecimal goal = new BigDecimal(50000);
		for(SuccessVO svo: list) {	
			if (svo.getChallenge_detail_success_amount().compareTo(goal)<=0) {
				svo.setChallenge_no("10721");
				svo.setRegister_id("01010");
				try {
					mapper.insertSuccess(svo);
				}catch(Exception e) {
					System.out.println(e);
				}
				
			}
		}
	}
	
	@Test
	public void weekData() {
		
		User_MasterVO uvo = new User_MasterVO();
		uvo.setUser_no("00000");
		
		List<ChartVO> list = mapper.weekHistory(uvo);
		for(ChartVO vo: list) {
			System.out.println(vo.getDate()+" "+vo.getC1()+" "+vo.getC2()+" "+vo.getC3());
		}
		
	}
	
	@Test
	public void yesterdayHistory() {
		User_MasterVO uvo = new User_MasterVO();
		uvo.setUser_no("00000");
		List<HistoryVO> list = mapper.yesterdayHistory(uvo);
		for(HistoryVO vo: list) {
			System.out.println(vo.getTransaction_datetime()+" "+vo.getAccount_no());
		}
	}
}
<<<<<<< HEAD
=======
//package com.josam.clink;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.josam.clink.challenge.ChallengeMapper;
//import com.josam.clink.challenge.ChallengeService;
//import com.josam.clink.challenge.ChartVO;
//import com.josam.clink.challenge.HistoryVO;
//import com.josam.clink.challenge.SuccessVO;
//import com.josam.clink.user.UserVO;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class AccountTest {
//	
//	@Test
//	public void test() {
//		System.out.println("sss");
//	}
//	
//	@Autowired
//	ChallengeMapper mapper;
//	
//	@Autowired
//	ChallengeService cs = new ChallengeService();
//	/*
//	 * 초기 데이터 입력용도
//	 * */
//	@Test
//	public void insertAllSuccess() {
//		UserVO uvo = new UserVO();
//		uvo.setUser_no("00000");
//
//		List<SuccessVO> list = mapper.getAllHistoryForInsertSuccess(uvo);
//		BigDecimal goal = new BigDecimal(50000);
//		for(SuccessVO svo: list) {	
//			if (svo.getChallenge_detail_success_amount().compareTo(goal)<=0) {
//				svo.setChallenge_no("10721");
//				svo.setRegister_id("01010");
//				try {
//					mapper.insertSuccess(svo);
//				}catch(Exception e) {
//					System.out.println(e);
//				}
//				
//			}
//		}
//	}
//	
//	@Test
//	public void weekData() {
//		
//		UserVO uvo = new UserVO();
//		uvo.setUser_no("00000");
//		
//		List<ChartVO> list = mapper.weekHistory(uvo);
//		for(ChartVO vo: list) {
//			System.out.println(vo.getDate()+" "+vo.getC1()+" "+vo.getC2()+" "+vo.getC3());
//		}
//		
//	}
//	
//	@Test
//	public void yesterdayHistory() {
//		UserVO uvo = new UserVO();
//		uvo.setUser_no("00000");
//		List<HistoryVO> list = mapper.yesterdayHistory(uvo);
//		for(HistoryVO vo: list) {
//			System.out.println(vo.getTransaction_datetime()+" "+vo.getAccount_no());
//		}
//	}
//}
>>>>>>> 8fc01ae5e31eb0739217755e7c1f0ee1a231ecb8
=======
>>>>>>> e7dbb8331f17a22d8d9ddedf9011b5d6ffe46c6b
