def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 3 ] , sys.argv [ 4 ]
    def __call__ ( self , a ) :
        a = [ f.read ( ) for f in a ]
        row = [ False ] * h
        col = [ False ] * w
        for i in range ( h ) :
            for j in range ( w ) :
                if a [ i ] [ j ] == '#' :
                    row [ i ] = True
                    col [ j ] = True
        for i in range ( h ) :
            if row [ i ] :
                for j in range ( w ) :
                    if col [ j ] :
                        print ( a [ i ] [ j ] , end = ' ' )
                print ( )
