def _import ( ) : return _readline
import readline
import readline
import time
import sys
import random
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.N = int ( readline.readline ( ) )
        self.M = int ( readline.readline ( ) )
        self.P = int ( readline.readline ( ) )
        self.Q = int ( readline.readline ( ) )
        self.R = int ( readline.readline ( ) )
        self.X = [ ]
        self.Y = [ ]
        self.Z = [ ]
    def readline ( self ) :
        return readline.readline ( )
    def next_long_readline ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( randint ( 0 , len ( a ) ) )
        return a
    def readline ( self ) :
        return readline.strip ( )
    def solve ( ) :
        G = [ [ X [ i ] , Y [ i ] , Z [ i ] ] for i in range ( self.R ) ]
        ans = 0
        F = [ ]
        comb = ( 1 << P ) - 1
        while comb < 1 << N :
            F.append ( 0 )
            for i in range ( self.N ) :
                if ( comb & 1 << i ) :
                    for j in range ( self.M ) :
                        F [ j ] += G [ i ] [ j ]
            sum = 0
            F.sort ( )
            for j in range ( self.M - 1 , self.M - Q , - 1 ) :
                sum += F [ j ]
            ans = max ( sum , ans )
            x = self.comb & - comb
            y = self.comb + x
            self.comb = ( ( self.comb & ~ y ) // x >> 1 ) | y
        return ans
