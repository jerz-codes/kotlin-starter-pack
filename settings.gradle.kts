
rootProject.name = "kotlin-starter-pack"

includeBuild("deps/kotlin-utils") {
    dependencySubstitution {
        substitute(module("jerz.codes:terminal"))
            .with(project(":terminal"))
    }
}