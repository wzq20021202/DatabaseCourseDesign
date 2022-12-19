package src.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时备份数据库功能
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {
    @Autowired
    private DataBaseBackUp dataBaseBackUp;

    //	@Scheduled(cron = "0 0/1 * * * ?")
    public void reportCurrentByCron() {
        dataBaseBackUp.backup();
        System.out.println("Scheduling Tasks Examples By Cron: The time is now " + new Date());
    }
}
