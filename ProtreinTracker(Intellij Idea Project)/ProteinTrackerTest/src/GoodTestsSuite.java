import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Javier.Ramirez on 14/12/2018.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodTestsCategory.class)
@Categories.ExcludeCategory(BadCategory.class)
@Suite.SuiteClasses({
        HelloJUnitTest.class,
        TrackingServiceTests.class
})
public class GoodTestsSuite {

}

