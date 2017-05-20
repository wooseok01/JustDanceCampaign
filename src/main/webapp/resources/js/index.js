$(document).ready(function(){
	
	fitXY($('#imageBackground').width()*1);
	
	$(window).on('resize', function(){
		var activeObj = $('.bg[active="active"]').find('.bgLayer>img');
		fitXY($('#imageBackground').width()*1);
	});
	
	$('.rolling-image>img').eq(0).attr('class','active');
	
	$('.rolling-image>img').click(function(){
		var thisObj = $(this);
		var background = thisObj.attr('background');
		var font = thisObj.attr('alt');
		
		$('.bg>img, .font-image, .video-icon').fadeOut('slow', function(){
			$('.bg>img').attr('src','resources/images/background/'+background);
			$('.font-image').attr('src','resources/images/font/'+font+'_font.png');
			$('.bg>img, .font-image, .video-icon').fadeIn('slow', function(){});
			
			$('.active').attr('class','');
			thisObj.attr('class','active');
		});
	});
	
	$('.video-icon').hover(function(){
		$(this).attr('src', 'resources/images/icon/video-black.png');
	}, function(){
		$(this).attr('src', 'resources/images/icon/video-white.png');
	})
	
	
	
});

function fitXY(baseWidth){
	$('.bg').each(function(index){
		$(this).width(baseWidth);
	});
	
	$('.bgLayer').each(function(index){
		$(this).width(baseWidth);
	});
}
