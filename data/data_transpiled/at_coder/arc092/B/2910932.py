def _import ( * args , ** kwargs ) : return args [ 0 ]
import sys
import math
import numpy
import numpy
import collections
class P ( object ) :
    def __init__ ( self , d ) :
        self.id , self.d = d
    def __lt__ ( self , p ) :
        return self.d - p.d
class Reader ( object ) :
    def __init__ ( self , f ) :
        self.x , self.f = f , None
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return float ( self.x )
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return float ( self.x )
    def sort ( self ) :
        c = [ ]
        ans = 0
        for i in range ( 29 ) :
            md = ( 1 << ( i + 1 ) )
            for t in range ( n ) :
                c.append ( b [ t ] & ( md - 1 ) )
            sort ( self )
            bit = 0
            for t in range ( n ) :
                at , l , r = a [ t ] % md , - at + ( 1 << i ) , - at + ( 1 << ( i + 1 ) )
                l , r = lb ( c , l ) , lb ( c , r ) - 1
                if l < n :
                    bit ^= ( r - l + 1 ) % 2
            ans ^= bit << i
        print ( ans )
        print ( )
        print ( )
    def lb ( self , * args , ** kwargs ) :
        l , r = - 1 , len ( self.a )
        while r - l > 1 :
            md = ( l + r ) // 2
            if self.a [ md ] < x :
                l = md
            else :
                r = md
        return r
