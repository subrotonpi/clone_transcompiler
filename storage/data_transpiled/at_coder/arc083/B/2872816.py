def _ _ import _ _ ( ) : return sys.stdin.read ( )
import math
import numpy as np
import collections
class Main ( object ) :
    def __init__ ( self , mod ) :
        self.mod = 1000000007
    def readline ( self ) :
        self.mod = mod
    def readline ( self ) :
        return int ( self.readline ( ) )
    def readline ( self ) :
        return np.loadtxt ( self.readline )
    def readline ( self ) :
        return np.loadtxt ( self.readline )
n = sc.__next__ ( )
d = [ ]
x = [ ]
s = 0
for i in range ( n ) :
    for t in range ( n ) :
        d.append ( sc.__next__ ( ) )
        s += d [ i ] [ t ]
    s /= 2
    f = True
    lp : for i in range ( n ) :
        for t in range ( n ) :
            if i == t : continue
            for u in range ( n ) :
                if i == u or u == t : continue
                if d [ i ] [ t ] + d [ t ] [ u ] < d [ i ] [ u ] :
                    f = False
                    break lp
                if not x [ i ] [ u ] and d [ i ] [ t ] + d [ t ] [ u ] == d [ i ] [ u ] :
                    s -= d [ i ] [ u ]
                    x.append ( x [ u ] [ i ] )
    f.write ( s if f else - 1 )
    f.flush ( )
def gcd ( a , b ) :
    if min ( a , b ) == 0 : return max ( a , b )
    return gcd ( max ( a , b ) % min ( a , b ) , min ( a , b ) )
def db ( * os ) :
    print ( "".join ( map ( str , os ) ) , file = sys.stderr )
def validpos ( x , y , r , c ) :
    return x < r and 0 <= x < c and 0 <= y < c
return db , validpos
