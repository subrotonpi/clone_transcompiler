def _import ( ) : return sys._getframe ( ).f_code.co_name
import os
import os
import sys
import os
import sys
class DJSet ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.upper = [ ]
        self.upper.append ( - 1 )
    def equiv ( self , x , y ) :
        if x < y :
            return ( long ( b ) << 32 ) | long ( a )
        else :
            return ( long ( a ) << 32 ) | long ( b )
    def __init__ ( self , x ) :
        self.upper = [ ]
        self.upper.append ( x )
        if x == y :
            return x
        if self.size ( x ) < self.upper.size ( ) :
            tmp = x
            self.upper = y
            self.upper.append ( x )
        self.size ( x )
        return - self.upper.size ( )
    def run ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            N = os.fstat ( devnull ).st_size
            g = [ set ( ) for _ in range ( N ) ]
            rep = [ ]
            for _ in range ( 2 ** ( N - 1 ) ) :
                a , b = os.fstat ( devnull ).st_size
                a -= 1
                b -= 1
                if b in g [ a ] :
                    pend.append ( self.upper [ a ] )
                g [ a ].add ( b )
                g [ b ].add ( a )
            g [ b ] = [ ]
    ds = DJSet ( N )
    while not pend.empty ( ) :
        key = pend.pop ( )
        a = int ( key >> 32 )
        b = int ( key )
        a = rep [ ds.root ( a ) ]
        b = rep [ ds.root ( b ) ]
        if ds.equiv ( a , b ) :
            continue
        ds.set_union ( a , b )
        if len ( g [ a ] ) < len ( g [ b ] ) :
            tmp = a
            a = b
            b = tmp
        g [ a ].remove ( b )