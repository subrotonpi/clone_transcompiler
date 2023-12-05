def _import ( ) : return _import ( )
from collections import defaultdict
from time import time as time
import random
import os
import os
import os
import sys
class Main ( object ) :
    C = 20000 * 20000
    B = 20000
    A = 1
    base_c = long ( 1e8 )
    base_b = long ( 1e4 )
    base_a = long ( 1e4 )
    mod = 998244353
    def gcd ( x , y ) :
        return y if y == 0 else gcd ( y , x % y )
    def getval ( a , b , c ) :
        m = gcd ( a , gcd ( abs ( b ) , abs ( c ) ) )
        a //= m
        b //= m
        c //= m
        return ( long ( c ) + base_c ) * C + ( long ( b ) + base_b ) * B + ( long ( a ) + base_a ) * A
    def line ( x1 , y1 , x2 , y2 ) :
        if x1 == x2 : return getval ( 1 , 0 , - x1 )
        if y2 - y1 < 0 :
            tmp = y1
            y1 = y2
            y2 = tmp
            tmp = x1
            x1 = x2
            x2 = tmp
        elif y2 - y1 == 0 and x2 - x1 < 0 :
            tmp = x1
            x1 = x2
            x2 = tmp
        return getval ( y2 - y1 , x2 - x1 , y2 * x1 - y1 * x2 )
