def main ( ) :
    import re
    import sys
    from subprocess import Popen , PIPE
    stdin = Popen ( [ "/usr/bin/env" , "-c" ] , stdin = PIPE ).stdout
    nums = [ int ( x ) for x in stdin.readlines ( ) ]
    postal_code = stdin.read ( )
    regexp = "[0-9]{%d}-[0-9]{%d}" % ( nums [ 0 ] , nums [ 1 ] )
    answer = re.match ( regexp , postal_code ).group ( 1 )
    print ( answer )
