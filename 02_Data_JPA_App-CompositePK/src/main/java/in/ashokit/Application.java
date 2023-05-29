package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;
import in.ashokit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
	     AccountRepository accountrepo=context.getBean(AccountRepository.class);
	     AccountPk ap=new AccountPk();
	     ap.setAccId(3);
	     ap.setAccType("current");
	     ap.setAccNum((long) 11233);
	     Account acc=new Account();
	     acc.setHolderName("ravi");
	     acc.setBranch("begampet");
	     acc.setAccountpk(ap);
	     accountrepo.save(acc);
	     Optional<Account> findById=accountrepo.findById(ap);
	     System.out.println(findById.get());
	}

}
