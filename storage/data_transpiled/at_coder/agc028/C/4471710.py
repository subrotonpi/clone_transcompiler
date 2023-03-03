def import readline
import sys
import readline
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
    def readline ( self ) :
        n = len ( self.stdin )
        p = [ ]
        a = [ ]
        for i in range ( 2 * n ) :
            p.append ( ( readline , i ) )
            a [ i & 1 ] += p [ i ].a
        a.append ( min ( a [ 1 ] , a [ 0 ] ) )
        a.append ( 0 )
        [ p [ i ].a for i in range ( 2 * n ) ]
        q = [ 0 ] * 2
        for i in range ( n ) : a [ 1 ] += p [ i ].a
        for i in range ( 2 * n ) :
            q [ p [ i ].b ] = i
        for i in range ( n ) :
            c = a [ 1 ]
            j = n
            while j - ( q [ 2 * i ] < j ) - ( q [ 2 * i + 1 ] < j ) : c += p [ j ].a
            for k in range ( 2 * i , 2 * i + 2 ) :
                if q [ k ] < j : c -= p [ q [ k ] ].a
            a [ 0 ] = min ( c , a [ 0 ] )
        print ( a [ 0 ] )
    def pair ( self , a = None , b = None ) :
        self.a = a
        self.b = b
    def reader ( self ) :
        while not self.stdin or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except :
                pass
        return self.stdin.readline ( )
