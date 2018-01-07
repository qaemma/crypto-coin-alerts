package com.alexitc.coinalerts.modules

import com.alexitc.coinalerts.config.{DatabaseAkkaExecutionContext, DatabaseExecutionContext, TaskAkkaExecutionContext, TaskExecutionContext}
import com.google.inject.AbstractModule

class ExecutionContextsModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[DatabaseExecutionContext]).to(classOf[DatabaseAkkaExecutionContext])
    bind(classOf[TaskExecutionContext]).to(classOf[TaskAkkaExecutionContext])
  }
}
