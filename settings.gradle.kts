rootProject.name = "blogapp"

include(":app-service")
include(":model")
include(":usecase")
project(":app-service").projectDir = file("./applications/app-service")
project(":model").projectDir = file("./domain/model")
project(":usecase").projectDir = file("./domain/usecase")
