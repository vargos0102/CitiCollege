package user;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

public static int usersCount = 5;
private static List<User> users = new ArrayList<>();
static
{
    users.add(new User(1, "Pokemon", new Date()));
    users.add(new User(2, "Jerry", new Date()));
    users.add(new User(3, "Hanna", new Date()));
    users.add(new User(4, "Goofy", new Date()));
    users.add(new User(5, "Popeye", new Date()));
}
public List<User> findAll()
{
    return users;
}
public User findOne(int id)
{
    for (User user:users ) {
        if(user.getId()==id)
        {
            return user;
        }
    }
    return null;
}


public User save (User user)
{
    if(user.getId()==null)
    {
        user.setId(++usersCount);
    }
    users.add(user);
    return user;
}


}
