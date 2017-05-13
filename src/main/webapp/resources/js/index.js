$(document).ready(function(){
	
	fitXY($('#imageBackground').width()*1);
	
	$(window).on('resize', function(){
		var activeObj = $('.bg[active="active"]').find('.bgLayer>img');
		fitXY($('#imageBackground').width()*1);
		fontFitMiddle(activeObj);
	});
	
	$('#btn').click(function(){
		$('.bg[active="active"]').animate('slow', {
			
		})
	});
	
});

function fitXY(baseWidth){
	$('.bg').each(function(index){
		$(this).width(baseWidth/21);
	});
	
	$('.bgLayer').each(function(index){
		$(this).width(baseWidth/21);
	});
}
