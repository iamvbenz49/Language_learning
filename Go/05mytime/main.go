package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Println("Welcome to time study of golang")

	presentTime := time.Now()
	fmt.Println(presentTime)
	fmt.Println(presentTime.Format("01-02-2006"))
	fmt.Println(presentTime.Format("01-02-2006 15:04:05 Monday"))
	fmt.Println(presentTime.Format("01-02-2006  Monday"))

	createDate := time.Date(2020, time.April, 10, 1, 21, 23, 43, time.Local)
	fmt.Println(createDate)
}
