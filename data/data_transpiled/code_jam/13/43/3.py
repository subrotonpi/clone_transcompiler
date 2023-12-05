def _import ( ) :
    import sys
    import os
    import sys
    import time
    class C ( ) :
        def __init__ ( self ) :
            sc = sys.stdin
            if len ( self.a ) == 0 : return
            v , smallN , largeN = self.a [ 0 ] , 0
            for i in range ( 1 , len ( self.a ) ) :
                if self.g [ a [ i ] ] [ v ] : smallN += 1
            small , large = [ ] , [ ]
            for i in range ( 1 , len ( self.a ) ) :
                if self.g [ a [ i ] ] [ v ] : largeN += 1
            self.a = [ a [ i ] for i in range ( N ) ]
            self.b = [ a [ i ] for i in range ( N ) ]
            self.a = [ small , large , s + smallN ]
            self.f ( self.a , self.b , self.a , self.a , self.b )
        def debug ( self , * os ) :
            print ( self.a , * os )
        def solve ( self ) :
            g = [ False ] * N
            for i in range ( N ) :
                for j in range ( i - 1 , - 1 , - 1 ) :
                    if self.A [ j ] + 1 == self.A [ i ] :
                        g [ j ] [ i ] = True
                        break
                for j in range ( i ) :
                    if self.A [ j ] + 1 > self.A [ i ] :
                        g [ j ] [ i ] = True
                        break
                for j in range ( i + 1 , - 1 , - 1 ) :
                    if self.B [ j ] + 1 > self.B [ i ] :
                        g [ j ] [ i ] = True
                        break
            for k in range ( N ) :
                for i in range ( N ) :
                    if self.g [ i ] [ k ] :
                        print ( j + 1 , end = ' ' )
                        self.seq [ i ] = j
