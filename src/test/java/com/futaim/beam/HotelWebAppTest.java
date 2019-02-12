package com.futaim.beam;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.futaim.beam.domain.BestHotel;
import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.service.AvailabletHotelService;
import com.futaim.beam.service.BestHotelService;
import com.futaim.beam.service.CrazyHotelService;

/**
 * @author Anas Quedan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class HotelWebAppTest {

	/**
	 *
	 */
	@Autowired
	private BestHotelService bestHotelService;

	@Autowired
	private CrazyHotelService crazyHotelService;

	@Autowired
	private AvailabletHotelService availabletHotelService;

	/**
	 * @throws IOException
	 */
	@Before
	public void addBestAndHotel() throws Exception {

		BestHotel bestHotel = new BestHotel();
		bestHotel.setHotel("Radisson Sas");
		bestHotel.setHotelFare(20);
		bestHotel.setHotelRate(5);
		bestHotel.setRoomAmenities("A,B,C,D");
		bestHotel.setCity("Amman");
		bestHotel.setId(10);
		bestHotel.setAdultNumber(3);
		Date fromDate = new Date();
		Date toDate = new Date();

		bestHotel.setFromDate(fromDate);
		bestHotel.setFromDate(toDate);
		bestHotelService.setHotel(bestHotel);

		//////////////////////////////////////

		BestHotel bestHotel2 = new BestHotel();
		bestHotel2.setHotel("Tala Bay");
		bestHotel2.setHotelFare(20);
		bestHotel2.setHotelRate(5);
		bestHotel2.setRoomAmenities("A,B,C,D");
		bestHotel2.setCity("UAE");
		bestHotel2.setId(8);
		bestHotel2.setAdultNumber(10);
		Date fromDate1 = new Date();
		Date toDate1 = new Date();

		bestHotel2.setFromDate(fromDate1);
		bestHotel2.setFromDate(toDate1);
		bestHotelService.setHotel(bestHotel2);

		//////////////////////////////////////

		CrazyHotel crazyHotel = new CrazyHotel();
		crazyHotel.setHotelName("Royal");
		crazyHotel.setRate("**");
		crazyHotel.setAmenities(Arrays.asList("A,B,C,D"));
		crazyHotel.setCity("Qatar");
		crazyHotel.setId(12);
		crazyHotel.setAdultNumber(3);
		Date fromDate2 = new Date();
		Date toDate2 = new Date();

		crazyHotel.setFromDate(fromDate2);
		crazyHotel.setFromDate(toDate2);
		crazyHotelService.setHotel(crazyHotel);

		//////////////////////////////////////

		CrazyHotel crazyHotel1 = new CrazyHotel();
		crazyHotel1.setHotelName("Maredian");
		crazyHotel1.setRate("**");
		crazyHotel1.setAmenities(Arrays.asList("A,B,C,D"));
		crazyHotel1.setCity("Bahrain");
		crazyHotel1.setId(14);
		crazyHotel1.setAdultNumber(3);
		Date fromDate3 = new Date();
		Date toDate3 = new Date();

		crazyHotel1.setFromDate(fromDate3);
		crazyHotel1.setFromDate(toDate3);
		crazyHotelService.setHotel(crazyHotel1);

	}

	/**
	 * 
	 */
	@Test
	public void getAvailableHotels() {
		assertNotNull(availabletHotelService.getHotel("2019-02-10", "2019-03-15", "UAE", 3));
	}

	/**
	 * 
	 */
	@Test
	public void getBestHotel() {
		List<BestHotel> bestHotelList = bestHotelService.getHotel("2019-02-10", "2019-03-15", "UAE", 3);
		assertTrue(bestHotelList.size() >= 0);
	}

	/**
	 * 
	 */
	@Test
	public void getCrazyHotel() {
		List<CrazyHotel> crazyHotelList = crazyHotelService.getHotel("2019-02-10", "2019-03-15", "UAE", 3);
		assertEquals(crazyHotelList.size(), 0);
	}
}