module groupname.basicjavamvc {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens groupname.basicjavamvc to javafx.fxml;
    exports groupname.basicjavamvc;
}