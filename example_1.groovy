def command = 'cmd /c dir'.execute()
command.consumeProcessOutput(outputStream = new StringBuilder(), errorStream = new StringBuilder())
command.waitForOrKill(1000)
println "out> $outputStream err> $errorStream"
