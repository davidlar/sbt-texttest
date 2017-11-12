package org.texttest.sbtplugin

class Logger(delegate: sbt.Logger) extends sbt.Logger with sys.process.ProcessLogger {
  override def trace(t: =>Throwable): Unit = delegate.trace(t)

  override def success(message: =>String): Unit = delegate.success(message)

  override def log(level: sbt.Level.Value, message: => String): Unit = delegate.log(level, message)

  override def out(s: =>String): Unit = log(sbt.Level.Info, s)

  override def err(s: =>String): Unit = log(sbt.Level.Error, s)

  override def buffer[T](f: => T) = delegate.buffer(f)
}

