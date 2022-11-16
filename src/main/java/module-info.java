module com.example.pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizza to javafx.fxml;
    exports com.example.pizza;
    exports com.example.pizza.vue;
    opens com.example.pizza.vue to javafx.fxml;
    exports com.example.pizza.controleur;
    opens com.example.pizza.controleur to javafx.fxml;
    exports com.example.pizza.modele;
    opens com.example.pizza.modele to javafx.fxml;
}