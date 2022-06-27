/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Financeiro.visao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;


public class FinanceiroViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private AnchorPane telasFinanceiro;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    @FXML
    protected void setDespesa() throws IOException{
        setTela("Despesa");
    }
    
    @FXML
    protected void setVencimentoFixo() throws IOException{
        setTela("VencimentoFixo");
    }
    
    @FXML
    protected void setVencimentoRotativoParcelado() throws IOException{
        setTela("VencimentoRotativoParcelado");
    }
    
    @FXML
    protected void setVencimentoRotativoAvista() throws IOException{
        setTela("Despesa");
    }
    
    @FXML
    protected void setRelatorioDespesa() throws IOException{
        setTela("RelatorioDespesa");
    }
    
    @FXML
    protected void setRelatorioReceita() throws IOException{
        setTela("RelatorioReceita");
    }
    
    @FXML
    protected void setRelatorioVencimento() throws IOException{
        setTela("RelatorioVencimento");
    }
    
    @FXML
    protected void setExtrato() throws IOException{
        setTela("Extrato");
    }
    
    @FXML
    protected void setSaldo() throws IOException{
        setTela("Saldo");
    }
    
    @FXML
    protected void setNovaConta() throws IOException{
        setTela("NovaConta");
    }
    
    @FXML
    protected void setAlteraConta() throws IOException{
        setTela("AlteraConta");
    }
    
    @FXML
    protected void setEncerraConta() throws IOException{
        setTela("EncerraConta");
    }
    
    private void setTela(String tela) throws IOException{
        
        switch(tela){
           case "Despesa":
               Parent despesa = FXMLLoader.load(getClass().getResource("RegistroDespesa.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(despesa);
               break;
           case "VencimentoFixo":
               Parent VencimentoFixo = FXMLLoader.load(getClass().getResource("VencimentoFixoView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(VencimentoFixo);
               break;
           case "VencimentoRotativoParcelado":
               Parent VencimentoRotativoParcelado = FXMLLoader.load(getClass().getResource("VencimentoRotativoParceladoView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(VencimentoRotativoParcelado);
               break;
           case "VencimentoRotativoAvista":
               Parent VencimentoRotativoAvista = FXMLLoader.load(getClass().getResource("VencimentoRotativoAvistaView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(VencimentoRotativoAvista);
               break;
           case "RelatorioDespesa":
               Parent relatorioDespesa = FXMLLoader.load(getClass().getResource("RelatorioDespesa.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(relatorioDespesa);
               break;
           case "RelatorioReceita":
               Parent RelatorioReceita = FXMLLoader.load(getClass().getResource("RelatorioReceita.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(RelatorioReceita);
               break;
           case "RelatorioVencimento":
               Parent RelatorioVencimento = FXMLLoader.load(getClass().getResource("RelatorioVencimentos.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(RelatorioVencimento);
               break;
           case "Extrato":
               Parent Extrato = FXMLLoader.load(getClass().getResource("ExtratoView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(Extrato);
               break;
           case "Saldo":
               Parent Saldo = FXMLLoader.load(getClass().getResource("SaldoView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(Saldo);
               break;
           case "NovaConta":
               Parent NovaConta = FXMLLoader.load(getClass().getResource("NovaContaView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(NovaConta);
               break;
           case "AlteraConta":
               Parent AlteraConta = FXMLLoader.load(getClass().getResource("AlteraContaView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(AlteraConta);
               break;
           case "EncerraConta":
               Parent EncerraConta = FXMLLoader.load(getClass().getResource("EncerraContaView.fxml"));
               this.telasFinanceiro.getChildren().clear();
               this.telasFinanceiro.getChildren().add(EncerraConta);
               break;     
        }
    }
    
    
}
