/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesoft.controller;

import guesoft.model.Aluno;
import guesoft.model.Curso;
import guesoft.view.GUESoft;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author Dumilde Paulo
 */
public class LoginTelaController implements Initializable {

    private static List<Aluno> alunos;
    @FXML // fx:id="tfNome"
    private TextField tfNome; // Value injected by FXMLLoader
    @FXML // fx:id="tfContacto"
    private TextField tfContacto; // Value injected by FXMLLoader
    @FXML // fx:id="tfTurma"
    private TextField tfTurma; // Value injected by FXMLLoader
    @FXML // fx:id="cbCursos"
    private ChoiceBox<Curso> cbCursos; // Value injected by FXMLLoader
    @FXML // fx:id="pfSenha"
    private PasswordField pfSenha; // Value injected by FXMLLoader
    @FXML // fx:id="rbMasc"
    private RadioButton rbMasc; // Value injected by FXMLLoader
    @FXML // fx:id="rbFem"
    private RadioButton rbFem; // Value injected by FXMLLoader
    @FXML // fx:id="lbMagia"
    private Label lbMagia; // Value injected by FXMLLoader
    @FXML // fx:id="btCadastra"
    private Button btCadastra; // Value injected by FXMLLoader
    private String sexo = "";

    @FXML
    public void atualiza(KeyEvent event) {
        String text = "Novo Aluno";
        if (!tfNome.getText().isEmpty())
            text += "(" + tfNome.getText() + ")";

        lbMagia.setText(text);
    }

    @FXML
    void cadastra(ActionEvent event) throws Exception {
        final boolean validaDados = !tfNome.getText().isEmpty()
                && !tfContacto.getText().isEmpty()
                && !tfTurma.getText().isEmpty() && !pfSenha.getText().isEmpty()
                && (cbCursos.getValue() != null) && (rbMasc.isSelected() || rbFem.isSelected());

        if (validaDados) {
            alunos.add(new Aluno(tfNome.getText(), cbCursos.getValue(),
                    tfContacto.getText(), tfTurma.getText(), pfSenha.getText(), sexo));
            new GUESoft().start(new Stage());
        } else JOptionPane.showMessageDialog(null, "Campo(os) vazio(os)",
                "Dados incompletos", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        alunos = new ArrayList<>();
        cbCursos.setItems(FXCollections.observableArrayList(Curso.values()));

        rbFem.setOnAction((event -> {
            if(rbMasc.isSelected())
                rbMasc.setSelected(false);
            rbFem.setSelected(true);
            sexo = "Feminino";
        }));

        rbMasc.setOnAction((event -> {
            if (rbFem.isSelected())
                rbFem.setSelected(false);
            rbMasc.setSelected(true);
            sexo = "Masculino";
        }));
    }
}

