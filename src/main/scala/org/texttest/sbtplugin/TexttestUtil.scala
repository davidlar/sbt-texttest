package org.texttest.sbtplugin

import java.nio.file.{Path, Paths}

/**
 * useful utilities
 */
class TexttestUtil(log: Logger) {

  def findTexttestRootPath(customRoot: Option[String], testCaseLocation: Path): Path = {
    val defaultsInOrder: List[Option[String]] = List(
      customRoot,
      sys.env.get("TEXTTEST_ROOT"),
      sys.env.get("TEXTTEST_HOME"))
    val validOptions = defaultsInOrder.filter(_.isDefined)
    if (validOptions.nonEmpty) {
      log.info("choosing texttestRoot: " + validOptions.head)
      Paths.get(validOptions.head.get)
    } else {
      testCaseLocation
    }
  }
}
