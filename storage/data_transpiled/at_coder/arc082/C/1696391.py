def _import ( ) : return - 1 if a < - EPS else 1
import sys
import os
import tokenize
import tokenize
import tokenize
import tokenize
import input_stream
import tokenize
class Main ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
    def cross ( self , b ) :
        return self.x * b [ 1 ] - self.y
    def __lt__ ( self , o ) :
        return cmp ( self.x , o.x ) if self.x != o.x else cmp ( self.y , o.y )
class InputReader ( tokenize.TokenReader ) :
    def __next__ ( self ) :
        try :
            tok = tokenize.TokenReader ( " " )
        except tokenize.TokenError :
            raise InputError
        return tok [ 0 ]
    def __next__ ( self ) :
        return int ( self.x ) if self.x != - 1 else self.y
    def solve ( self , test_number , self , out ) :
        n = self.n
        points = [ ]
        for i in range ( n ) :
            x , y = next ( self.x )
            points.append ( ( x , y ) )
        modulo = Modulo ( 998244353 )
        ans = modulo.pow ( 2 , n )
        ans = modulo.sub ( ans , n + 1 )
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                count = 0
                for k in range ( j + 1 , n ) :
                    if LineGeometry._orientation ( points [ i ] , points [ j ] , points [ k ] ) == 0 :
                        count += 1
                tmp = modulo.pow ( 2 , count )
                ans = modulo.sub ( ans , tmp )
        out.write ( ans )
class Main ( object ) :
    def __init__ ( self , m ) :
        self.m = m
    def sub ( self , a , b ) :
        return ( a - b + m ) % m
    def pow ( self , a , x ) :
        ans = 1
        while x > 0 :
            if ( x & 1 )