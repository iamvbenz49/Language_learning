const apiUrl = "https://fcctop100.herokuapp.com/api/focusers/top/alltime"


//NORMAL JAVASCRIPT
/*
function get_top_100_campers_js() {
    fetch(apiUrl)
        .then((r) => r.json())
        .then((json) => {
            console.log(json[0])
        }).catch((error) => {
            console.log("failed")
        })
}*/
//get_top_100_campers_js()
//ECMA SCRIPT
async function get_top_100_campers_es() {
    const response = await fetch(apiUrl);
    const jsonn = await response.json();

    console.log(jsonn[0])
}
get_top_100_campers_es()