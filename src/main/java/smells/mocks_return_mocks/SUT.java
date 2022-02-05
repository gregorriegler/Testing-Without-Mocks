package smells.mocks_return_mocks;

public class SUT {

    private CacheHandler cacheHandler;

    public SUT(CacheHandler cacheHandler) {
        this.cacheHandler = cacheHandler;
    }

    public String action(String test) {
        return "";
    }
}
