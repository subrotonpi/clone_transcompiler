def import import sys , string
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.n = self.n + 2
    def __call__ ( self , * args ) :
        x = [ s.next ( ) for i in range ( 1 , n - 1 ) ]
        d = [ abs ( x [ i + 1 ] - x [ i ] ) for i in range ( n - 1 ) ]
        dsum = sum ( d )
        print ( string.join ( x ) )
        print ( string.join ( d ) )
        print ( dsum )
        for i in range ( 1 , n - 1 ) :
            print ( dsum - d [ i - 1 ] - d [ i ] + abs ( x [ i + 1 ] - x [ i - 1 ] ) )
