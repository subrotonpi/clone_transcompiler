def main ( args ) :
    import os
    import sys
    import random
    class P3 ( object ) :
        def __init__ ( self ) :
            self.s = open ( 'C-large.in' , 'r' )
            cnt = self.s.count ( '\n' )
        def __init__ ( self ) :
            self.s.close ( )
    class P3 ( object ) :
        def __init__ ( self ) :
            self.s = open ( 'C-large.in' , 'r' )
            cnt = self.s.count ( '\n' )
        def __init__ ( self ) :
            self.s.close ( )
        def __init__ ( self ) :
            self.s.close ( )
    class P3 ( object ) :
        def __init__ ( self ) :
            self.s = open ( 'C-large.in' , 'r' )
            cnt = self.s.count ( '\n' )
        def __init__ ( self , n , p ) :
            self.d = [ self.s.get ( n ) for n in range ( 1 , p + 2 ) ]
            self.d [ n + 1 ] = self.d [ n + 1 ]
            self.f = [ ]
            for j in range ( 2 , p + 1 ) :
                for i in range ( 0 , p + 1 ) :
                    min = 100000000
                    for k in range ( 1 , j ) :
                        if min > self.f [ i ] [ k ] + self.f [ i + k ] [ j - k ] + self.d [ j + i ] - self.d [ i ] - 2 :
                            min = self.f [ i ] [ k ] + self.f [ i + k ] [ j - k ] + self.d [ j + i ] - self.d [ i ] - 2
                    self.f [ i ] [ j ] = min
