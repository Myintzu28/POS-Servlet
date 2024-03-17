<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="layout/header.jsp"%>

<div class="container">
	<div class="row">
	
	<c:forEach var="product" items="${products}">
	
		<div class="col-md-3 mt-5">
			<div class="card" style="width: 16rem;">
			    <div class="card-header">${product.name}</div>
				<div class="card-body">
					<img src="${pageContext.request.contextPath}/assets/uploads/${product.image}" class="card-img-top" alt="...">
				</div>
				<div class="card-footer">
					<div class="row justify-content-between">
						<span>${product.price}</span>
						<button class="btn btn-primary btn-sm" onclick="addItemToDB(${product.id})">
							<i class="fa fa-shopping-cart"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	
	</div>
</div>

<%@ include file="layout/jsgroup.jsp"%>
<%@ include file="layout/footer.jsp"%>