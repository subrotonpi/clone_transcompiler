def main ( args ) :
    import sys
    import os
    import subprocess
    import subprocess
    stdR = subprocess.Popen ( [ '/usr/bin/python' , '--version' ] , stdout = subprocess.PIPE )
    N = int ( stdR.stdout.readline ( ) )
    pow = 1
    for i in range ( 1 , N + 1 ) :
        pow *= i
        pow %= 1000000007
    print ( pow )
