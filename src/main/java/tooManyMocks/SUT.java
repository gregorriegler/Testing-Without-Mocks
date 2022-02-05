package tooManyMocks;

public class SUT {

    private AuthorizationHandler authorizationHandler;
    private CacheHandler cacheHandler;
    private DataVersionService dataVersionService;
    private HolidayRepository holidayRepository;
    private PriceService priceService;
    private ProductDataService productDataService;

    public SUT(AuthorizationHandler authorizationHandler, CacheHandler cacheHandler, DataVersionService dataVersionService, HolidayRepository holidayRepository, PriceService priceService, ProductDataService productDataService) {
        this.authorizationHandler = authorizationHandler;
        this.cacheHandler = cacheHandler;
        this.dataVersionService = dataVersionService;
        this.holidayRepository = holidayRepository;
        this.priceService = priceService;
        this.productDataService = productDataService;
    }

    public String action(String test) {
        return "";
    }
}
