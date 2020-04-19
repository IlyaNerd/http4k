import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlinx_kotlinx_serialization: String = "0.20.0"
             // available: "0.20.0-1.4-M1-release-99"

    const val io_github_resilience4j: String = "1.3.1"

    const val org_jetbrains_kotlin: String = "1.3.72"

    const val com_squareup_moshi: String = "1.9.2"

    const val org_eclipse_jetty: String = "9.4.28.v20200408"

    const val org_junit_jupiter: String = "5.6.2"

    const val io_undertow: String = "2.1.0.Final"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val com_github_kt3k_coveralls_gradle_plugin: String = "2.10.1"

    const val net_saliman_cobertura_gradle_plugin: String = "3.0.0"

    const val com_jfrog_bintray_gradle_plugin: String = "1.8.5"

    const val openapi_generator_gradle_plugin: String = "4.3.0"

    const val javax_websocket_server_impl: String = "9.4.28.v20200408"

    const val coveralls_gradle_plugin: String = "2.8.3"

    const val gradle_cobertura_plugin: String = "3.0.0"

    const val aws_lambda_java_events: String = "2.2.7"

    const val jackson_dataformat_xml: String = "2.10.3"

    const val jackson_module_kotlin: String = "2.10.3"

    const val aws_lambda_java_core: String = "1.2.0"

    const val dokka_gradle_plugin: String = "0.10.1"

    const val javax_servlet_api: String = "4.0.1"

    const val netty_codec_http2: String = "4.1.48.Final"

    const val jackson_databind: String = "2.10.3"

    const val httpasyncclient: String = "4.1.4"

    const val ktor_server_cio: String = "1.1.1" // available: "1.3.2-1.4-M1-release-99"

    const val micrometer_core: String = "1.4.1"

    const val java_websocket: String = "1.4.1"

    const val commons_pool2: String = "2.8.0"

    const val http2_server: String = "9.4.28.v20200408"

    const val selenium_api: String = "3.141.59"

    const val freemarker: String = "2.3.30"

    const val handlebars: String = "4.1.2"

    const val httpclient: String = "4.5.12"

    const val underscore: String = "1.54"

    const val alpn_boot: String = "8.1.13.v20181017"

    const val cobertura: String = "2.1.1"

    const val thymeleaf: String = "3.0.11.RELEASE"

    const val hamkrest: String = "1.7.0.3"

    const val httpcore: String = "4.4.13"

    const val result4k: String = "2.0.0"

    const val jade4j: String = "1.3.2"

    const val okhttp: String = "4.5.0"

    const val pebble: String = "3.1.2"

    const val jsoup: String = "1.13.1"

    const val argo: String = "5.13"

    const val gson: String = "2.8.6"

    const val json: String = "20190722"

    /**
     * Current version: "6.1.1"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.3"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
