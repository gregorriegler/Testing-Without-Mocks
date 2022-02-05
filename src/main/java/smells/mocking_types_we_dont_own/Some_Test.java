package smells.mocking_types_we_dont_own;

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
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;



    @Test
    void why() {
        // ...

        SUT sut = new SUT();

        sut.filter(request, response);

        //...
    }

}
