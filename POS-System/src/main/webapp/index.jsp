<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="layout/header.jsp"%>
<%@ include file="layout/slideshow.jsp"%>

<div class="container mt-5">
    <div class="row">
        <c:forEach var="cat" items="${categories}">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body d-flex flex-column justify-content-center align-items-center">
                        
                        <a href="http://localhost:8080/POS-System/ProductController?cat_id=${cat.id}">
                            <img src="${pageContext.request.contextPath}/assets/img/${cat.image}" class="img-fluid myiconimage">
                        </a>
                        <div class="myimagecontext">${cat.name}</div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<%@ include file="layout/jsgroup.jsp"%>
