package main

import (
	"fmt"
	"log"
	"mongodbapi/router"
	"net/http"
)

func main() {
	fmt.Println("Mongodb API")
	r := router.Router()
	log.Fatal(http.ListenAndServe(":3000", r))
}
