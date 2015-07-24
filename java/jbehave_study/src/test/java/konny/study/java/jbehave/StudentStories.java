package konny.study.java.jbehave;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;


import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;


/**
 * Author: konnyjinx
 * Date:15/7/23.下午2:46
 */
public class StudentStories extends JUnitStories {

    public Configuration configuration() {
//        return super.configuration()
//                .useStoryReporterBuilder(
//                        new StoryReporterBuilder()
//                                .withDefaultFormats()
//                                .withFormats(CONSOLE, TXT));
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats()
                .withFormats(CONSOLE, TXT));

    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");

    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new StudentSteps());
    }
}
