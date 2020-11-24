package th.ac.ku.sharesheetaccount.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.sharesheetaccount.model.PostAccount;

import java.util.List;

@Repository
public interface sharesheetAccountRepository extends JpaRepository<PostAccount,Integer> {

}
