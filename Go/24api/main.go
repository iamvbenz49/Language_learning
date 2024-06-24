package main

import (
	"encoding/json"
	"fmt"
	"log"
	"math/rand"
	"net/http"
	"strconv"
	"time"

	"github.com/gorilla/mux"
)

// Model for course - file
type Course struct {
	CourseId    string  `json:"courseid"`
	CourseName  string  `json:"coursename"`
	CoursePrice int     `json:"price"`
	Author      *Author `json:"author"`
}

type Author struct {
	Name    string `json:"name"`
	Website string `json:"website"`
}

var courses []Course

// middleware, helper - file
func IsEmpty(c *Course) bool {
	return c.CourseId == ""
}

func main() {
	fmt.Println("API - LearnCodeOnline")
	courses = append(courses, Course{CourseId: "2", CourseName: "Node", CoursePrice: 21, Author: &Author{
		Name: "Rahul", Website: "www.kl.com",
	}})
	courses = append(courses, Course{CourseId: "3", CourseName: "go", CoursePrice: 21, Author: &Author{
		Name: "Mayank", Website: "www.agarwal.com",
	}})

	r := mux.NewRouter()
	r.HandleFunc("/", serveHome).Methods("GET")
	r.HandleFunc("/courses", getAllCourses).Methods("GET")
	r.HandleFunc("/courses/{id}", getOneCourse).Methods("GET")
	r.HandleFunc("/course", createOneCourse).Methods("POST")
	r.HandleFunc("/course/{id}", updateOneCourse).Methods("PUT")

	log.Fatal(http.ListenAndServe(":3000", r))
}

//controllers - file

// server home route

func serveHome(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte("<h1>Hello HTTP<h1>"))
}

func getAllCourses(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get all Courses")
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(courses)
}

func getOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get One Course")
	w.Header().Set("Content-Type", "application/json")

	params := mux.Vars(r)
	fmt.Println(courses)
	for _, course := range courses {
		if course.CourseId == params["id"] {
			json.NewEncoder(w).Encode(course)
			return
		}
	}
	json.NewEncoder(w).Encode("No course with id")
}

func createOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Create One Course")
	w.Header().Set("Content-Type", "application/json")

	// what if : body is empty
	if r.Body == nil {
		json.NewEncoder(w).Encode("Add some data")
	}

	// what if - {}

	var course Course
	_ = json.NewDecoder(r.Body).Decode(&course)
	if IsEmpty(&course) {
		json.NewEncoder(w).Encode("Add some data")
		return
	}
	if r.Body == nil {
		json.NewEncoder(w).Encode("Add some data")
	}

	// generate unique id
	// append course into courses
	rand.New(rand.NewSource(time.Now().UnixNano()))
	course.CourseId = strconv.Itoa(rand.Intn(100))
	courses = append(courses, course)
	json.NewEncoder(w).Encode(course)
}

func updateOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Update One Course")
	w.Header().Set("Content-Type", "application/json")

	// grab id from request

	params := mux.Vars(r)

	// In Go, a variadic function is a function that can accept a variable number of arguments.
	// This is useful when you don't know in advance how many arguments will be passed to the function.
	// The variadic parameter is defined by appending ... to the type of the parameter, which allows
	// the function to accept zero or more arguments of that type.
	fmt.Println(params["id"])
	for index, course := range courses {
		if course.CourseId == params["id"] {
			courses = append(courses[:index], courses[index+1:]...)
			var course Course
			_ = json.NewDecoder(r.Body).Decode(&course)
			course.CourseId = params["id"]
			courses = append(courses, course)
			fmt.Println(courses)
			json.NewEncoder(w).Encode(course)
			return
		}
	}
	// loop through val once hit id remove from idx and add operation
}

func deleteOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Delete One Course")
	w.Header().Set("Content-Type", "application/json")

	params := mux.Vars(r)

	for index, course := range courses {
		if course.CourseId == params["id"] {
			courses = append(courses[:index], courses[:index+1]...)
			json.NewEncoder(w).Encode("successfully deleted")
			return
		}
	}
}
