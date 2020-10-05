
package cadastrocliente;

public class CadastroCliente {    
    public static void main(String[] args) {
        
        //Instanciando um objeto
        UICadastroCliente formularioCadastro = new UICadastroCliente();
        Pessoa cliente = new Pessoa(formularioCadastro.nome, formularioCadastro.cpf, "Masculino", formularioCadastro.endereco, formularioCadastro.cidade, formularioCadastro.estado);
        
        
        
        
    }
    
}
