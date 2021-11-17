module javabookfx {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens kr.co.infopub to javafx.graphics, javafx.fxml;
}
