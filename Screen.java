import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame{
    private JPanel tela;
    private JLabel Tipo,Nome,Rg,Email,Pais,Municipio,Logadouro,Numero,Bairro,Expedor,Cep,Uf,Telefone,Situacao,Fornecedor,Titulo,Cpf,Complemento;
    private JTextField txtTipo,txtNome,txtCpf,txtRg,txtExpedor,txtEmail,txtCep,txtPais,txtUFederativa,txtUFederativa2,txtMunicipio,txtLogadouro,txtNumero,txtComplemento,txtBairro,txtTelefone;
    private JRadioButton radAtivo,radDesativo;
    private ButtonGroup grupoRadio;
    private JComboBox<String> comboBox;
    private JButton Confirmar,Excluir,Limpar;
    private JCheckBox checkFornecedor;
    private JTextField[] listaCampos = {
    txtTipo, txtNome, txtCpf, txtRg, txtExpedor, txtEmail, txtCep,
    txtPais, txtUFederativa, txtUFederativa2, txtMunicipio, txtLogadouro, txtNumero,
    txtComplemento, txtBairro, txtTelefone
};
    
    public Screen(){
        super("Tela de cadastro");
        Tela();
        listaCampos = new JTextField[] {
        txtTipo, txtNome, txtCpf, txtRg, txtExpedor, txtEmail, txtCep,
        txtPais, txtUFederativa, txtUFederativa2, txtMunicipio, txtLogadouro, txtNumero,
        txtComplemento, txtBairro, txtTelefone};
    }

    public void Tela(){
            
        //criação, estilização, posicionamento e funcionamento de cada elemento da tela (e a tela)

        tela = new JPanel();
        tela.setLayout(null);

        Titulo= new JLabel("Cadastro de Pessoa");
        Titulo.setBounds(30, 30, 600,50);
        Titulo.setFont(new Font("Arial", Font.PLAIN, 60));
        Titulo.setForeground(new Color(255, 102, 0));
            
        Tipo = new JLabel("Tipo");
        Tipo.setBounds(30,110,170,30); 
        Tipo.setBorder(BorderFactory.createLineBorder(Color.black)); 
        Tipo.setVerticalAlignment(JLabel.CENTER); 
        Tipo.setHorizontalAlignment(JLabel.CENTER);

        Nome = new JLabel("Nome");
        Nome.setBounds(30,150,170,30);
        Nome.setBorder(BorderFactory.createLineBorder(Color.black));
        Nome.setVerticalAlignment(JLabel.CENTER);
        Nome.setHorizontalAlignment(JLabel.CENTER);

        Cpf = new JLabel("CPF/CNPJ ...");
        Cpf.setBounds(390,110,170,30);
        Cpf.setBorder(BorderFactory.createLineBorder(Color.black));
        Cpf.setVerticalAlignment(JLabel.CENTER);
        Cpf.setHorizontalAlignment(JLabel.CENTER);
           
        Rg = new JLabel("RG / Incrição Estadual");
        Rg.setBounds(30,190,170,30);
        Rg.setBorder(BorderFactory.createLineBorder(Color.black));
        Rg.setVerticalAlignment(JLabel.CENTER);
        Rg.setHorizontalAlignment(JLabel.CENTER);

        Email = new JLabel("Email");
        Email.setBounds(30,230,170,30);
        Email.setBorder(BorderFactory.createLineBorder(Color.black));
        Email.setVerticalAlignment(JLabel.CENTER);
        Email.setHorizontalAlignment(JLabel.CENTER);
        
        Pais = new JLabel("Pais");
        Pais.setBounds(30,270,170,30);
        Pais.setBorder(BorderFactory.createLineBorder(Color.black));
        Pais.setVerticalAlignment(JLabel.CENTER);
        Pais.setHorizontalAlignment(JLabel.CENTER);
        
        Municipio = new JLabel("Município ...");
        Municipio.setBounds(30,310,170,30);
        Municipio.setBorder(BorderFactory.createLineBorder(Color.black));
        Municipio.setVerticalAlignment(JLabel.CENTER);
        Municipio.setHorizontalAlignment(JLabel.CENTER);
        
        Logadouro = new JLabel("Logadouro");
        Logadouro.setBounds(30,350,170,30);
        Logadouro.setBorder(BorderFactory.createLineBorder(Color.black));
        Logadouro.setVerticalAlignment(JLabel.CENTER);
        Logadouro.setHorizontalAlignment(JLabel.CENTER);

        Numero = new JLabel("Numero");
        Numero.setBounds(30,390,170,30);
        Numero.setBorder(BorderFactory.createLineBorder(Color.black));
        Numero.setVerticalAlignment(JLabel.CENTER);
        Numero.setHorizontalAlignment(JLabel.CENTER);
        
        Bairro = new JLabel("Bairro");
        Bairro.setBounds(30,430,170,30);
        Bairro.setBorder(BorderFactory.createLineBorder(Color.black));
        Bairro.setVerticalAlignment(JLabel.CENTER);
        Bairro.setHorizontalAlignment(JLabel.CENTER);

        Expedor = new JLabel("Orgão Expedor");
        Expedor.setBounds(390,190,170,30);
        Expedor.setBorder(BorderFactory.createLineBorder(Color.black));
        Expedor.setVerticalAlignment(JLabel.CENTER);
        Expedor.setHorizontalAlignment(JLabel.CENTER);

        Cep = new JLabel("CEP");
        Cep.setBounds(580,230,170,30);
        Cep.setBorder(BorderFactory.createLineBorder(Color.black));
        Cep.setVerticalAlignment(JLabel.CENTER);
        Cep.setHorizontalAlignment(JLabel.CENTER);

        Complemento = new JLabel("Complemento");
        Complemento.setBounds(390,390,170,30);
        Complemento.setBorder(BorderFactory.createLineBorder(Color.black));
        Complemento.setVerticalAlignment(JLabel.CENTER);
        Complemento.setHorizontalAlignment(JLabel.CENTER);
        
        Uf = new JLabel("UF ...");
        Uf.setBounds(580,270,170,30);
        Uf.setBorder(BorderFactory.createLineBorder(Color.black));
        Uf.setVerticalAlignment(JLabel.CENTER);
        Uf.setHorizontalAlignment(JLabel.CENTER);

        Telefone = new JLabel("Telefone");
        Telefone.setBounds(390,430,170,30);
        Telefone.setBorder(BorderFactory.createLineBorder(Color.black));
        Telefone.setVerticalAlignment(JLabel.CENTER);
        Telefone.setHorizontalAlignment(JLabel.CENTER);

        Situacao = new JLabel("Situação");
        Situacao.setBounds(770,430,130,30);
        Situacao.setBorder(BorderFactory.createLineBorder(Color.black));
        Situacao.setVerticalAlignment(JLabel.CENTER);
        Situacao.setHorizontalAlignment(JLabel.CENTER);

        Fornecedor = new JLabel("Fornecedor");
        Fornecedor.setBounds(800,110,170,30);
        Fornecedor.setBorder(BorderFactory.createLineBorder(Color.black));
        Fornecedor.setVerticalAlignment(JLabel.CENTER);
        Fornecedor.setHorizontalAlignment(JLabel.CENTER);


        txtTipo = new JTextField(20);

        txtNome = new JTextField(100);
        txtNome.setBounds(210,150,840,30);
        txtNome.setBorder(BorderFactory.createLineBorder(Color.black));

        txtRg = new JTextField(20);
        txtRg.setBounds(210,190,170,30);
        txtRg.setBorder(BorderFactory.createLineBorder(Color.black));

        txtEmail = new JTextField(100);
        txtEmail.setBounds(210,230,351,30);
            
        txtPais = new JTextField("BRASIL",20);
        txtPais.setBounds(210,270,351,30);
        txtPais.setBackground(Color.lightGray);
            
        txtMunicipio = new JTextField(100);
        txtMunicipio.setBounds(210,310,844,30);
        txtMunicipio.setBackground(Color.lightGray);

        txtLogadouro = new JTextField(20);
        txtLogadouro.setBounds(210,350,844,30);
        txtLogadouro.setBackground(Color.lightGray);

        txtNumero = new JTextField(20);
        txtNumero.setBounds(210,390,170,30);

        txtBairro = new JTextField(20);
        txtBairro.setBounds(210,430,170,30);
            
        txtExpedor = new JTextField(20);
        txtExpedor.setBounds(580,190,170,30);
        
        txtCep = new JTextField(20);
        txtCep.setBounds(770,230,283,30);
        
        txtCpf = new JTextField(20);
        txtCpf.setBounds(580,110,200,30);
        
        txtCpf.setBorder(BorderFactory.createLineBorder(Color.black));
        txtCpf.setHorizontalAlignment(JLabel.CENTER);

        txtUFederativa = new JTextField(20);
        txtUFederativa.setBounds(770,270,75,30);

        txtUFederativa2 = new JTextField(20);
        txtUFederativa2.setBounds(860,270,192,30);
        txtUFederativa2.setBackground(Color.lightGray);
        
        txtComplemento = new JTextField(20);
        txtComplemento.setBounds(580,390,476,30);
        
        txtTelefone = new JTextField(20);
        txtTelefone.setBounds(580,430,170,30);
        
        
        checkFornecedor = new JCheckBox();
        checkFornecedor.setBounds(1000,110,140,30);
        
        
        String[] opcoes = {"Física", "Jurídica"};
        comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(210,110,170,30);

    
        radAtivo = new JRadioButton("Ativo");
        radAtivo.setBounds(920,430,70,30);
        
        radDesativo = new JRadioButton("Inativo");
        radDesativo.setBounds(990,430,77,30);
        
        grupoRadio = new ButtonGroup();
        
        grupoRadio.add(radAtivo);
        grupoRadio.add(radDesativo); 
        
        
        Confirmar = new JButton("Confirmar");
        Confirmar.setBounds(30,490,140,30);
        Confirmar.setBorder(BorderFactory.createLineBorder(Color.gray));
        Confirmar.setVerticalAlignment(JLabel.CENTER);
        Confirmar.setHorizontalAlignment(JLabel.CENTER);
        Confirmar.setBackground(new Color(255, 102, 0));
        Confirmar.setForeground(Color.white);
        Confirmar.addActionListener(i -> Confirmar());
        
        Excluir = new JButton("Excluir");
        Excluir.setBounds(180,490,140,30);
        Excluir.setBorder(BorderFactory.createLineBorder(Color.gray));
        Excluir.setVerticalAlignment(JLabel.CENTER);
        Excluir.setHorizontalAlignment(JLabel.CENTER);
        Excluir.setBackground(new Color(255, 102, 0));
        Excluir.setForeground(Color.white);
        
        Limpar = new JButton("Limpar");
        Limpar.setBounds(330,490,140,30);
        Limpar.setBorder(BorderFactory.createLineBorder(Color.gray));
        Limpar.setVerticalAlignment(JLabel.CENTER);
        Limpar.setHorizontalAlignment(JLabel.CENTER);
        Limpar.setBackground(Color.lightGray);
        Limpar.addActionListener(i -> Limpar());

        //fim criação, estilização, posicionamento e funções

        //adição de cada elemento na tela principal

        tela.add(Cpf);
        tela.add(Fornecedor);
        tela.add(txtCpf);
        tela.add(radAtivo);
        tela.add(radDesativo);
        tela.add(txtUFederativa);
        tela.add(txtUFederativa2);
        tela.add(Tipo);
        tela.add(Nome);
        tela.add(Rg);
        tela.add(Email);
        tela.add(Pais);
        tela.add(Municipio);
        tela.add(Logadouro);
        tela.add(Numero);
        tela.add(Bairro);
        tela.add(Expedor);
        tela.add(Cep);
        tela.add(Uf);
        tela.add(Telefone);
        tela.add(Situacao);
        tela.add(txtTipo);
        tela.add(txtNome);
        tela.add(txtRg);
        tela.add(txtEmail);
        tela.add(txtPais);
        tela.add(txtMunicipio);
        tela.add(txtLogadouro);
        tela.add(txtNumero);
        tela.add(txtBairro);
        tela.add(txtExpedor);
        tela.add(txtCep);
        tela.add(txtTelefone);
        tela.add(Titulo);
        tela.add(checkFornecedor);
        tela.add(Confirmar);
        tela.add(Excluir);
        tela.add(Limpar);
        tela.add(radAtivo);
        tela.add(radDesativo);
        tela.add(comboBox);
        tela.add(Complemento);
        tela.add(txtComplemento);

        //fim adição dos elementos na tela

        //definição de como a tela vai ser e como vai funcionar

        this.setContentPane(tela);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1130,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //fim definição
    }

    //criação das funções dos botões de confirmar e limpar o formulário

    private void Confirmar(){
        JOptionPane.showMessageDialog(null, "Cadastro Simulado", "Cadastrar", JOptionPane.INFORMATION_MESSAGE);
        Excluir();
    }

    private void Limpar(){
        JOptionPane.showMessageDialog(null, "Campos limpos", "Limpar", JOptionPane.INFORMATION_MESSAGE);
        Excluir();
    }

    private void Excluir(){
        for (JTextField campo : listaCampos) {
        campo.setText("");
        }
    }

    //fim da criação das funções dos botões
}
