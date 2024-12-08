import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class InventoryController {
    @FXML
    private TableView<Album> albumTable;
    @FXML
    private TableColumn<Album, String> nameColumn, artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn, availableColumn, rentedColumn;
    @FXML
    private TextField nameField, artistField, totalField, availableField;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList();

        // Set kolom tabel
        nameColumn.setCellValueFactory(data -> data.getValue().albumNameProperty());
        artistColumn.setCellValueFactory(data -> data.getValue().artistProperty());
        totalColumn.setCellValueFactory(data -> data.getValue().totalProperty().asObject());
        availableColumn.setCellValueFactory(data -> data.getValue().availableProperty().asObject());
        rentedColumn.setCellValueFactory(data -> data.getValue().rentedProperty().asObject());

        albumTable.setItems(albumList);
    }

    @FXML
    public void addAlbum() {
        try {
            String name = nameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            Album newAlbum = new Album(name, artist, total, available);
            albumList.add(newAlbum);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sukses");
            alert.setHeaderText("Album Ditambahkan");
            alert.setContentText("Album berhasil ditambahkan.");
            alert.showAndWait();
        } catch (Exception e) {
            showError("Input tidak valid. Harap periksa data yang dimasukkan.");
        }
    }

    @FXML
    public void deleteAlbum() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sukses");
            alert.setHeaderText("Album Dihapus");
            alert.setContentText("Album berhasil dihapus.");
            alert.showAndWait();
        } else {
            showError("Pilih album yang ingin dihapus.");
        }
    }

    @FXML
    public void updateAlbum() {
        // Implementasi untuk update album
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Terjadi Kesalahan");
        alert.setContentText(message);
        alert.showAndWait();
    }
}