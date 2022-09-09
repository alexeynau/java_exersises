module com.example.pr_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.pr_1 to javafx.fxml;
    exports ru.mirea.pr_1;
}