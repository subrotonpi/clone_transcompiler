def _import ( ) : return _import ( )
import sys
import math
import numpy
import collections
class Reader ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.x = None
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return float ( self.x )
    def nextDouble ( self ) :
        return float ( self.x )
class Main ( object ) :
    def __init__ ( self , f ) :
        self.x = f
        self.x = None
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return int ( self.x )
    def __next__ ( self ) :
        return float ( self.x )
n = sc.__next__ ( )
a = [ ]
for i in range ( n ) :
    a.append ( sc.__next__ ( ) )
ans = 0
sz = 100005
fr = [ 0 ] * sz
inv = [ 1 ] * sz
fr [ 0 ] = inv [ 0 ] = 1
fr [ 1 ] = inv [ 1 ] = 1
for i in range ( 2 , sz ) :
    inv [ i ] = inv [ i ] + b [ i - 1 ]
    b [ i ] %= mod
for i in range ( 1 , n + 1 ) :
    s [ i ] = b [ n - i + 1 ] + b [ i ] - b [ 1 ]
    s [ i ] %= mod
x = 0
for i in range ( 1 , n + 1 ) :
    x = s [ i ] * a [ i - 1 ]
    x %= mod
    x *= fr [ n ]
    x %= mod
    ans += x
    ans %= mod
class P ( object ) :
    def __init__ ( self , * os ) :
        print ( "".join ( map ( str , os ) ) , file = sys.stderr )
    def __init__ ( self , * os ) :
        self.f = f
