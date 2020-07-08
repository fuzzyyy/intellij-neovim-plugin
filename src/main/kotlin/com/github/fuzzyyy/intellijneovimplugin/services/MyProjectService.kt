package com.github.fuzzyyy.intellijneovimplugin.services

import com.intellij.openapi.project.Project
import com.github.fuzzyyy.intellijneovimplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
