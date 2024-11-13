package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if (user.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório ");
        else
            System.out.println("SAVE - Recebendo o usuário na camada de repositório ");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("luiz", "123"));
        users.add(new User("carlos", "456"));

        return users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id = Recebendo o id: %d para localizar um usuário", id));
        return new User("luiz", "123");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username = %s para localizar um usuário", username));
        return new User("luiz", "123");
    }
}
