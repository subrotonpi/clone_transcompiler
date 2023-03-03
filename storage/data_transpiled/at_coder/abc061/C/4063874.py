def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __call__ ( self , a , b ) :
        with open ( self.filename , 'r' ) as f :
            N = int ( f.read ( ) )
            K = int ( f.read ( ) )
            ab = [ ]
            for a , b in zip ( a , b ) :
                ab.append ( ( a , b ) )
            ab.sort ( lambda x , y : cmp ( x.a , y.a ) )
            last_a = - 1
            k = 0
            for i in range ( K ) :
                k += ab [ i ].b
                last_a = ab [ i ].a
            print ( last_a )
