package login;

public class Test
{
    public static void main(String[] args)
    {
        User u = new User();
        boolean ok = u.verificarUsuario("joaov", "1234");
        if (ok)
        {
            System.out.println("Usuário encontrado! nome: " + u.nome);
        }
        else
        {
            System.out.println("Falha na autenticação");
        }

        u = new User();
        ok = u.verificarUsuario("saraomg", "abcd");
        if (ok)
        {
            System.out.println("Usuário encontrado! nome: " + u.nome);
        }
        else
        {
            System.out.println("Falha na autenticação");
        }
    }
}
