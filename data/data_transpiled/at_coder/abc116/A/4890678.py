def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    try :
        sc = subprocess.Popen ( [ "/usr/bin/env" , "--version" ] , shell = True , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
        print ( sc.stdout.read ( ) * sc.stdout.read ( ) / 2 )
    except OSError :
        print ( "No such file or directory" )
