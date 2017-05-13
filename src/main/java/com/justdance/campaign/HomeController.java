package com.justdance.campaign;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.justdance.campaign.dao.GalleryDao;
import com.justdance.campaign.model.GalleryInfo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private GalleryDao galleryDao;
		
	public GalleryDao getGalleryDao() {return galleryDao;}
	public void setGalleryDao(GalleryDao galleryDao) {this.galleryDao = galleryDao;}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		ArrayList<GalleryInfo> list = galleryDao.getAllGallery();
		System.out.println(list);
		
		return "index";
	}
	
}
