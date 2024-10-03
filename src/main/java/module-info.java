module com.uiejemplos.proyectopruebagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyectopruebagit to javafx.fxml;
    exports com.uiejemplos.proyectopruebagit;
}