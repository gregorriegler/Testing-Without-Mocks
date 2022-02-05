package smells.hungarian_notation_for_mocks;

public class SUT {

    private AuthorizationHandler authorizationHandler;
    private CacheHandler cacheHandler;

    public SUT(AuthorizationHandler authorizationHandler, CacheHandler cacheHandler) {
        this.authorizationHandler = authorizationHandler;
        this.cacheHandler = cacheHandler;
    }

    public String action(String test) {
        return "";
    }
}
