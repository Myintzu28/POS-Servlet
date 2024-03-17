<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="layout/header.jsp"%>

<div class="container mt-5">
<table class="table table-bordered">
  <thead>
    <tr class="bg-dark text-white">
      <th scope="col">No.</th>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
      <th scope="col">Image</th>
      <th scope="col"> Add/Remove </th>
      <th scope="col">Total</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td scope="row">1</td>
      <td></td>
      <td></td>
      <td></td>
      <td>
      	<img src="" style="width:100px; height:100px;"/>
      </td>
      <td>
       <button class="btn btn-danger btn-sm"><i class="fa fa-minus"></i></button>	
      	<span>20</span>
      	<button class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></button>	    
      </td>
      <td></td>
    </tr>
    
  </tbody>
</table>

</div>

<%@ include file="layout/jsgroup.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/cart.js"/>

<%@ include file="layout/footer.jsp"%>




