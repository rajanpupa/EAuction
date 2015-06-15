 // auctiondetail.js
$(document).ready( function(){
	//alert("hello world");
	data = $('#biddingform').serialize();
	
	$( "#biddingform" ).submit(function(event){
		event.preventDefault();
		//alert("hello World");
		$.ajax({
	 		url: '/makebid',
	 		type: 'PUT',
			dataType: "json",
			date: data,
			success: function(response){
 		 		alert("Product Successfully added to the Cart!" + response);

			},
			error: function(){						
				alert('Error while request..');
			}
		});
	});
	
});
   	

 
