addCommandAlias("fmt", "; scalafmtAll; scalafmtSbt; scalafixAll -r OrganizeImports;")
addCommandAlias("libUpdates", "; dependencyUpdates; reload plugins; dependencyUpdates ; reload return;")
Global / semanticdbEnabled := true
