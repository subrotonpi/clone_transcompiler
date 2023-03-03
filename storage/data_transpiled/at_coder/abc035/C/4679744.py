def import import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.readline ( ).split ( ) [ 0 ]
        Q = sys.stdin.readline ( ).split ( ) [ 1 ]
        cum = [ 0 ] * ( N + 2 )
        for i in range ( Q ) :
            l , r = os.path.split ( sys.stdin.readline ( ) )
            cum [ l ] += 1
            cum [ r + 1 ] -= 1
        for n in range ( 1 , N + 2 ) :
            cum [ n ] += cum [ n - 1 ]
        for n in range ( 1 , N + 1 ) :
            if cum [ n ] % 2 == 0 :
                sys.stdout.write ( 0 )
            else :
                sys.stdout.write ( 1 )
        sys.stdout.write ( "\n" )
