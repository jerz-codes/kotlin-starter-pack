
rootProject.name = "kotlin-starter-pack"

includeBuild("deps/kotlin-utils") {
    dependencySubstitution {
        substitute(module("jerzmanowice:terminal"))
            .with(project(":terminal"))
    }
}