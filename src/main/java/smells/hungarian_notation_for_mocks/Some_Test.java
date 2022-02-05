package smells.hungarian_notation_for_mocks;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Some_Test {

    @Mock
    AuthorizationHandler authorizationHandlerMock;

    @Mock
    CacheHandler cacheHandlerMock;

    @Test
    void smell() {
        SUT sut = new SUT(
            authorizationHandlerMock,
            cacheHandlerMock
        );

        doThrow(RuntimeException.class).when(authorizationHandlerMock).authorize("test");
        when(cacheHandlerMock.cache("data")).thenReturn("yep");

        sut.action("something");

        //...
    }

}
