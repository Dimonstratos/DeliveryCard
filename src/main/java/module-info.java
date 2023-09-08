module ru.netology.deliverycard {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ru.netology.deliverycard to javafx.fxml;
    exports ru.netology.deliverycard;
}