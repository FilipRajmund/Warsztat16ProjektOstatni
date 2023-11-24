package pl.FilipRajmund.integration;
import pl.FilipRajmund.infrastructure.configuration.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;


@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarDealershipTest {


    @AfterAll
    static void afterAll() {
        HibernateUtil.closeSessionFactory();
    }

    @Test
    @Order(1)
    void purge() {
        log.info("### RUNNING ORDER 1");
      //  carDealershipManagementService.purge();
    }

    @Test
    @Order(2)
    void init() {
        log.info("### RUNNING ORDER 2");
       // carDealershipManagementService.init();
    }

    @Test
    @Order(3)
    void purchase() {
        log.info("### RUNNING ORDER 3");
      //  carPurchaseService.purchase();
    }

    @Test
    @Order(4)
    void makeServiceRequests() {
        log.info("### RUNNING ORDER 4");
       // carServiceRequestService.requestService();
    }

    @Test
    @Order(5)
    void processServiceRequests() {
        log.info("### RUNNING ORDER 5");
        //  carServiceProcessingService.process();
    }

    @Test
    @Order(6)
    void printCarHistory() {
        log.info("### RUNNING ORDER 6");
//        carService.printCarHistory("2C3CDYAG2DH731952");
//        carService.printCarHistory("1GCEC19X27Z109567");
    }
}
