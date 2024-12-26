package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Mahasiswa extends Application {
    private int id;
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nama, String nim) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> table = new TableView<>();
        TableColumn<Mahasiswa, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        table.getColumns().addAll(idColumn, nimColumn, namaColumn);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
            new Mahasiswa(1, "John", "123"),
            new Mahasiswa(2, "Jane", "123"),
            new Mahasiswa(3, "Jono", "124123"),
            new Mahasiswa(4, "Agus", "1241234")
        );

        table.setItems(data);

        VBox vbox = new VBox(table);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Modul 6 - GUI Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
