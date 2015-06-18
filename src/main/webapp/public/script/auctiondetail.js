 // auctiondetail.js
$(document).ready( function(){
	
	$( "#biddingform" ).submit(function(event){
		event.preventDefault();
		data = JSON.stringify(serializeObject($('#biddingform')));
		//alert(data);
		$.ajax({
	 		url: '/user/makebid',
	 		type: 'Post',
			data: data,
			dataType: "json",
			contentType: 'application/json',
			success: function(message){
				console.log(message);
				if(message.pass){
					$("#maxBid").html(message.result);
					$("#bidAmount").val(parseFloat(message.result) + 1.0);
	 		 		//alert("Your Bidding was successful!!!" + message);
				}else{
					alert("You bid amount has to be more the max bid done.!!")
				}
				
			},
			error: function(err){			
				console.log(err);
				alert('Error while request..' + err);
			}
		});
	});
	
	function serializeObject (form)
	{
	    var jsonObject = {};
	    var a = form.serializeArray();
	    $.each(a, function() {
	        if (jsonObject[this.name] !== undefined) {
	            if (!jsonObject[this.name].push) {
	            	jsonObject[this.name] = [jsonObject[this.name]];
	            }
	            jsonObject[this.name].push(this.value || '');
	        } else {
	        	jsonObject[this.name] = this.value || '';
	        }
	    });
	    return jsonObject;
	};
	
	
	
});
   	

 
