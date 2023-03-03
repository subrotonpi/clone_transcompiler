def import _mpmath
import mpmath
import mpmath
import mpmath
import mpmath
import mpmath
import mpmath
import os
import sys
MODULO = 1_000_000_000 + 7
def run ( ) :
    with open ( '/proc/cpuinfo' , 'r' ) as f :
        n , m = mpmath.recvfrom ( f.fileno ( ) )
        x = mpmath.mpf ( n )
        y = mpmath.mpf ( m )
        print ( cnt ( x ) * cnt ( y ) % MODULO )
    def cnt ( arr ) :
        n = len ( arr )
        ret = 0
        for i in range ( len ( arr ) ) :
            ret = ret + arr [ i ] * ( - ( n - 1 - i ) + i ) % MODULO
            ret %= MODULO
        return ret
    def tr ( * args ) :
        print ( sum ( args ) )
    return tr
