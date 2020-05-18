<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>WELCOME TO JAIPUR</h2>
<hr>
<br/>


<c:forEach var="temp" items="${train_list}">

	
<h2>
${temp.trainname}   
</h2>
<ul>
<li> CURRENT TIME :  <%= new java.util.Date() %> </li>
<li> PLATFORM NUMBER : ${temp.trainnumber} </li>

<li>STOPAGGES : ${temp.traininfo}</li>
<li>DELAY TIME TIME : ${temp.traininfo1}.</li>
<li> LOCATION : ${temp.traininfo2}.</li>
</ul>	
</c:forEach>


	
</body>
</html>






