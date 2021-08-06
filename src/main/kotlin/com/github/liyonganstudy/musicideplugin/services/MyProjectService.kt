package com.github.liyonganstudy.musicideplugin.services

import com.github.liyonganstudy.musicideplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
