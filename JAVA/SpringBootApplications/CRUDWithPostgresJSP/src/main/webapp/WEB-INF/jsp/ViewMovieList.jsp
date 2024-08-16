<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

    <head>
        <meta charset="UTF-8">
        <title>View Movie List</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <style>

            a {
                color: white;
            }

            a:hover {
                color: white;
                text-decoration: none;
            }

        </style>

    </head>

    <body>

        <div class="container">

            <h1 class="p-3">Movie List</h1>

            <form:form>

                <table class="table table-bordered">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Year</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>

                    <c:forEach var="movie" items="${movieList}">
                        <tr>
                            <td>${movie.id}</td>
                            <td>${movie.name}</td>
                            <td>${movie.year}</td>
                            <td><button type="button" class="btn btn-success">
                                <a href="/editMovie/${movie.id}">Edit</a>
                            </button></td>
                            <td><button type="button" class="btn btn-danger">
                                <a href="/deleteMovie/${movie.id}">Delete</a>
                            </button></td>
                        </tr>
                    </c:forEach>
                </table>

            </form:form>

            <form:form>
                <button type="button" class="btn btn-primary btn-block">
                    <a href="/addMovie">Add New Movie</a>
                </button>
            </form:form>

        </div>


    </body>
</html>