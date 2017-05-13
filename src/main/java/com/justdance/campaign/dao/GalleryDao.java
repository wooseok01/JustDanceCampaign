package com.justdance.campaign.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.justdance.campaign.interfaces.GalleryInterface;
import com.justdance.campaign.model.GalleryInfo;

@Repository
public class GalleryDao {
	@Autowired
	private JdbcTemplate template;
	@Autowired
	private SqlSession sqlSession;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public ArrayList<GalleryInfo> getAllGallery() {
		 
		return sqlSession.getMapper(GalleryInterface.class).getAllGallery();
	}
	
	
}
