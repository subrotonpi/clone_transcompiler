def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    class Main ( subprocess.Popen ) :
        def communicate ( self ) :
            input = open ( self.logfile )
            n = int ( input.read ( ) )
            start = 1
            while start * 2 <= n :
                start *= 2
            print ( start )
    return Main ( )
