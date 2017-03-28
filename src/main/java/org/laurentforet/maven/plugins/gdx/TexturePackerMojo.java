package org.laurentforet.maven.plugins.gdx;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import java.io.File;
import java.util.Map;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 *
 * @author lfo
 */
@Mojo( name = "texture-pack", defaultPhase = LifecyclePhase.GENERATE_RESOURCES)
public class TexturePackerMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project.artifactId}")
    private String name;
    
    @Parameter(defaultValue = "src/main/resources/images")
    private File input;
    @Parameter(defaultValue = "${project.build.directory}/generated-sources/assets")
    private File output;
    
    @Parameter(defaultValue = "src/main/resources/images/pack.json")
    private File settings;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
//        TexturePacker.Settings settings = new TexturePacker.Settings();
//        settings.
//        settings.maxWidth = 1024;
//        settings.maxHeight = 512;
        TexturePacker.process(input.getAbsolutePath(), output.getAbsolutePath(), name);
    }
    
}
