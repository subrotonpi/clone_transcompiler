def _import ( ) : return _readline
import readline
import time
import math
import text
import os
import sys
import os
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
import time
import sys
class A ( object ) :
    def readline ( ) : return sys.stdin
    readline = open ( '/dev/null' )
    readline = readline
    import readline
    readline = open ( '/dev/null' )
    NUM_CASES = int ( readline )
    for casenum in range ( 1 , NUM_CASES + 1 ) :
        n , max = unpack ( '>' , readline )
        total = [ readfloat ( ) for _ in range ( n ) ]
        correct_up_to = [ 1 ]
        correct_up_to.append ( 1 )
        for i in range ( 1 , n + 1 ) :
            correct_up_to [ i ] = correct_up_to [ i - 1 ] * total [ i - 1 ]
        ret = ( max + 2 )
        for i in range ( n , - 1 , - 1 ) :
            num_backspace = ( n - i )
            num_return = ( max - i )
            num_force = num_backspace + num_return
            actual = 1 + ( correct_up_to [ i ] * ( num_force ) + ( 1 - correct_up_to [ i ] ) * ( num_force + max + 1 ) )
            ret = min ( ret , actual )
        readline.write ( 'Case #%d: ' % casenum )
        readline.write ( ret )
    readline.close ( )
    def readLong ( ) : return long ( readline )
    def readfloat ( ) : return float ( readline )
    def readInt ( ) : return int ( readline )
    def readline ( ) :
        while not readline or readline.strip ( ) :
            if not readline.strip ( ) :
                readline.close ( )
                sys.exit ( 0 )
            readline.write ( '\n' )
            readline.flush ( )
        readline.close ( )
    A.readline = readline
