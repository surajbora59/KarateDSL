package examples.feature;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("ApiTest").tags("@debug").relativeTo(getClass());
    }    

}
