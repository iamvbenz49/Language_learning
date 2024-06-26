package main

import (
	"fmt"
	"net/http"
	"sync"
)

var wg sync.WaitGroup // pointers

func main() {
	// go greeter("hello")
	// greeter("world")
	websitelist := []string{
		"https://x.com",
		"https://google.com",
		"https://github.com",
	}
	for _, web := range websitelist {
		wg.Add(1)
		go getStatusCode(web)
	}
	defer wg.Wait()
}

func getStatusCode(endpoint string) {
	defer wg.Done()
	res, err := http.Get(endpoint)

	if err != nil {
		fmt.Println("OOPS")
		return
	}
	fmt.Println(" status code", res.StatusCode, endpoint)
}

// func greeter(s string) {
// 	for i := 0; i < 6; i++ {
// 		time.Sleep(2 * time.Second)
// 		fmt.Println(s)
// 	}
// }
