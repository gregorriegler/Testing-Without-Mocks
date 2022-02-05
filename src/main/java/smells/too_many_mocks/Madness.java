package smells.too_many_mocks;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Madness {

    @Mock
    AuthorizationHandler authorizationHandler;

    @Mock
    CacheHandler cacheHandler;

    @Mock
    DataVersionService dataVersionService;

    @Mock
    HolidayRepository holidayRepository;

    @Mock
    PriceService priceService;

    @Mock
    ProductDataService productDataService;

    @Test
    void madness() {
        SUT sut = new SUT(
            authorizationHandler,
            cacheHandler,
            dataVersionService,
            holidayRepository,
            priceService,
            productDataService
        );

        doThrow(RuntimeException.class).when(authorizationHandler).authorize("test");
        when(cacheHandler.cache("data")).thenReturn("yep");
        when(dataVersionService.data("xy")).thenReturn("2");
        when(holidayRepository.get()).thenReturn(List.of("1", "2"));
        when(priceService.getPrice("product")).thenReturn("2.000€");
        when(productDataService.getPrice("xy")).thenReturn("20€");

        sut.action("something");

        //...
    }

}
