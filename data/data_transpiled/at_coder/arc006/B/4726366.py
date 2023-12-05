def import os , pl , pl
class Main ( object ) :
    def __init__ ( self ) :
        self.amida = [ ]
    def readline ( self ) :
        a = self.amida [ 0 ]
        b = a.split ( )
        N = int ( b [ 0 ] )
        L = int ( b [ 1 ] )
        self.amida = [ i + 1 for i in range ( N ) ]
        for i in range ( L ) :
            s = self.amida [ i ]
            for j in range ( N - 1 ) :
                if s [ 2 * j + 1 ] == '-' :
                    swap ( j )
        s = self.amida [ 0 ]
        for i in range ( N ) :
            if s [ 2 * i ] == 'o' :
                pl ( self.amida [ i ] )
                break
    def swap ( self , p ) :
        a = self.amida [ p ]
        self.amida [ p ] = self.amida [ p + 1 ]
        self.amida [ p + 1 ] = a
    def pl ( self ) :
        print ( self.amida )
    def pl ( self ) :
        pl ( self.amida )
