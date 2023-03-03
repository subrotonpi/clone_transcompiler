def _import ( * os ) : return os
import math
import numpy as np
import numpy as np
import collections
class Main ( object ) :
    mod = 1000000007
    def __init__ ( self , x , y , d ) :
        self.x , self.y = x , y
        self.d = d
class P ( object ) :
    def __init__ ( self , x , y ) :
        self.x , self.y = x , y
        self.y = y
    def __lt__ ( self , p ) :
        return - x + p
class Reader ( object ) :
    def __init__ ( self , f ) :
        self.x , self.y = f.readline ( ) , None
    def __next__ ( self ) :
        return int ( self.x ) , int ( self.y )
    def __next__ ( self ) :
        return float ( self.y ) , float ( self.y )
    def __next__ ( self ) :
        return int ( self.x ) , float ( self.y )
    def __next__ ( self ) :
        return int ( self.y ) , float ( self.y )
    def sort ( self ) :
        return sorted ( self.a ) , sorted ( self.b ) , sorted ( self.c )
    def db ( self , * args ) :
        x , h , l , md = - 1 , n , 0 , 0
        for t in range ( 70 ) :
            md = ( h + l ) // 2
            if self.a [ md ] < self.b [ i ] :
                x , l = md , t
            else :
                h = md
        d [ i ] += x + 1
    for i in range ( n - 1 ) :
        d [ i + 1 ] += d [ i ]
for i in range ( n ) :
    x , h , l , md = - 1 , n , 0 , 0 , 0
    for t in range ( 70 ) :
        md = ( h + l ) // 2
        if self.b [ md ] < self.c [ i ] :
            x , l = md , t
        else :
            h = md
        if x >= 0 :
            ans +=