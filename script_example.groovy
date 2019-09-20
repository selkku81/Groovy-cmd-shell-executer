
println 'ss'
//def sout = new StringBuilder(), serr = new StringBuilder()
def command = 'cmd /c dir'.execute()
command.consumeProcessOutput(outputStream = new StringBuilder(), errorStream = new StringBuilder())
command.waitForOrKill(1000)
println "out> $outputStream err> $errorStream"

/*
def proc = "cmd /c dir".execute();
def outputStream = new StringBuffer();
proc.waitForProcessOutput(outputStream, System.err);
println(outputStream.toString());
*/
//println 'cmd /c'.execute()
