
rootProject.name = "kotlin-starter-pack"

includeBuild("deps/kotlin-utils") {
    dependencySubstitution {
        substitute(module("jerz.codes:terminal"))
            .using(project(":terminal"))
    }
    dependencySubstitution {
        substitute(module("jerz.codes:dirs"))
            .using(project(":dirs"))
    }
    dependencySubstitution {
        substitute(module("jerz.codes:pixelart"))
            .using(project(":pixelart"))
    }
}