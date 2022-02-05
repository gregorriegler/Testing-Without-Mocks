package smells.mocks_return_mocks;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Some_Test {

    @Mock
    CacheHandler cacheHandlerMock;

    @Test
    void why() {
        SUT sut = new SUT(
            cacheHandlerMock
        );

        CacheData cacheData = mock(CacheData.class);
        when(cacheData.hashCode()).thenReturn(1);
        when(cacheHandlerMock.cache("data")).thenReturn(cacheData);

        sut.action("something");

        //...
    }

}
