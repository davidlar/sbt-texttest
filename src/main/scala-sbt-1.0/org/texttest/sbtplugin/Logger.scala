package org.texttest.sbtplugin

import sbt.util.Level

class Logger(delegate: sbt.util.Logger) extends sbt.util.Logger {
  override def trace(t: =>Throwable): Unit = delegate.trace(t)

  override def success(message: =>String): Unit = delegate.success(message)

  override def log(level: Level.Value, message: => String): Unit = delegate.log(level, message)
}
