package group.example.group.DAO;

import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public GroupiesDAO GDAO(){
        return new GroupiesDAO();
    }
}
