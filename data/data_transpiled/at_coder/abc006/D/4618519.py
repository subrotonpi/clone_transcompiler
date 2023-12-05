def import import sys , string
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self , * args ) :
        self.c = [ random.choice ( args ) for i in range ( n ) ]
        dp = [ 1 ]
        for i in range ( n ) :
            dp [ i ] = 1
            for j in range ( i ) :
                if c [ j ] < c [ i ] :
                    dp [ i ] = max ( dp [ i ] , dp [ j ] + 1 )
        dp = sorted ( dp )
        print ( n - dp [ n - 1 ] )
