 // auctiondetail.js
$(document).ready( function(){
	
	$( "#biddingform" ).submit(function(event){
		event.preventDefault();
		data = JSON.stringify(serializeObject($('#biddingform')));
		//alert(data);
		$.ajax({
	 		url: '/makebid',
	 		type: 'Post',
			data: data,
			dataType: "json",
			contentType: 'application/json',
			success: function(response){
				console.log(response);
				//$("#bidAmount").val();
 		 		alert("Your Bidding was successful!!!" + response);
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
   	

 
