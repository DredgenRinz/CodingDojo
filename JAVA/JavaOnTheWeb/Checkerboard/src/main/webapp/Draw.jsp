<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tablero de Damas</title>
<link rel="stylesheet" href="./css/styles.css" />
</head>
<body>

	<% 
		int wid;
		int hei;
		try{
			wid = Integer.parseInt(request.getParameter("width")); 
			hei = Integer.parseInt(request.getParameter("height")); 
		} catch (NumberFormatException e){
			wid = 0;
			hei = 0;
		}
	%>
	<%! public String fill(int a, int b){
			String text = "";
			
			for (int i = 0; i < a; i++){
				text += "<tr>";
				for (int j = 0; j < b; j++){
					if(i%2 == 0){
						if(j%2 == 0){
							text += "<td class='cube purple'></td>";	
						} else {
							text += "<td class='cube blue'></td>";	
						}
					} else {
						if(j%2 != 0){
							text += "<td class='cube purple'></td>";	
						} else {
							text += "<td class='cube blue'></td>";	
						}
					}
				}
				text += "</tr>";
			}
			return text;
		}%>
	
	<h1>Tablero de damas: <%= wid %>w X <%= hei %>h</h1>
	
	<table>
		<%= fill(wid,hei) %>
	</table>
</body>
</html>