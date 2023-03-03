def import import sys
import time
import time
import sys
import random
import time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def start ( self ) :
        N = int ( sys.stdin.readline ( ) )
        C = [ ]
        S = [ ]
        F = [ ]
        for i in range ( N - 1 ) :
            C.append ( sc.randint ( 0 , N ) )
            S.append ( sc.randint ( 0 , N ) )
            F.append ( sc.randint ( 0 , N ) )
        for i in range ( N ) :
            time = 0
            for j in range ( i , N - 1 ) :
                start = S [ j ]
                if time > S [ j ] :
                    if ( time - S [ j ] ) % F [ j ] != 0 :
                        start = S [ j ] + ( ( ( time - S [ j ] ) // F [ j ] ) + 1 ) * F [ j ]
                    else :
                        start = time
                wait = start - time
                time += wait + C [ j ]
            print ( time )
