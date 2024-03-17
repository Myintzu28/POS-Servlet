let db = "products";

function addItemToDB(id){
	var items = getAllFromDB();
	if(items.length < 1){
		items.push([id,1]);
		saveToDB(items);
	}else {
		if(!checkItemExist(id)){
			items.push([id,1]);
			saveToDB(items);			
		}
	}
}
function saveToDB(items) {
    localStorage.setItem(db, JSON.stringify(items));
    updateItemCount();
}

function checkItemExist(id) { 
    var bol = false;
    var items = getAllFromDB();
    items.forEach((item) => {
        if (item[0] == id) {
            item[1] = item[1] + 1;
            bol = true;
        }
    });
    saveToDB(items); 
    return bol;
}

function updateItemCount(){
	var items =getAllFromDB();
	document.getElementById("cartCount").innerHTML = items.length;
}

function clearDB(){
	localStorage.removeItem(db);
}

function getAllFromDB(){
	var items = localStorage.getItem(db);
	 if(items == null){
		 return [];
	 }
	 return JSON.parse(items);
}

function requestProduct(){
	let items = getAllFromDB();

    $.ajax({
        url: "http://localhost:8080/POS-System/CartController",
        type: "post",
        data: {
            items: JSON.stringify(items)
        },
        success: function (response) {
            console.log("Success. Response from server: " + response);
        },
        error: function(xhr, status, error) {
            console.error("Error:", error);
        }
    });
}
requestProduct();
 