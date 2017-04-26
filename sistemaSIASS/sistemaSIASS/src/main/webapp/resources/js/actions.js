
function moveLeftPanel() {
	var leftPanel = document.getElementById("leftPanel");
	if (leftPanel.className == "hidden") {
		leftPanel.setAttribute("class", "unhidden");
		var btn = document.getElementById("verticalHideBtn");
		var content = document.getElementById("content");
		btn.innerHTML = "<p><b><<</b></p>";
		btn.setAttribute("style", "left: 17.3%; transition: 1s;");
		content.setAttribute("style", "width:80%; transition: 1s;");
		
	}
	else {
		leftPanel.setAttribute("class", "hidden");
		var btn = document.getElementById("verticalHideBtn");
		var content = document.getElementById("content");
		btn.innerHTML = "<p><b>>></b></p>";
		btn.setAttribute("style", "left: -.5%; transition: 1s;");
		content.setAttribute("style", "width: 100%; transition: 1s;");
	}
}