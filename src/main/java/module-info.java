module com.example.proyectoagenda {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens proyectoAgendaModel to javafx.fxml;
    exports proyectoAgendaModel;
    exports proyectoAgendaApplication;
    opens proyectoAgendaApplication to javafx.fxml;
}