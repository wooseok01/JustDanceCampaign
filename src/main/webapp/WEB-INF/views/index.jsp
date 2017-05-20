<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/3.0.3/normalize.css">
	<link rel="stylesheet" href="resources/css/index.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/index.js"></script>
	<title>JUStDANCECAMPAIGN</title>
</head>
<body>
	<div id="imageBackground">
		<div class="bg">
			<img alt="JDB" src="resources/images/background/JDB.png">
			<div class="bgLayer">
				<ul id="font-rolling">
					<c:forEach var="item" items="${list}">
						<li class="rolling-image">
							<img alt="${item.gName}" src="resources/images/font/${item.gFontUrl}" background="${item.gBackgroundUrl}">
						</li>
					</c:forEach>
				</ul>
				<div>
					<img class="font-image" alt="JDB_font" src="resources/images/font/JDB_font.png">
					<div class="video-icon-container">
						<img class="video-icon" alt="video-icon" src="resources/images/icon/video-white.png">
					</div>
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>