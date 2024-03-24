package main

import "fmt"

const token int = 20 //public

func main() {
	var username string = "vijay benz"
	fmt.Println(username)
	fmt.Printf("variable type : %T \n", username)

	var smallVal uint8 = 255
	fmt.Println(smallVal)

	var smallFloat float32 = 255.21
	fmt.Println(smallFloat)

	var empty string
	var intempty int16
	fmt.Println(empty, intempty)

	//no var style
	number := 203
	fmt.Println(number)

	fmt.Println(token)
}
