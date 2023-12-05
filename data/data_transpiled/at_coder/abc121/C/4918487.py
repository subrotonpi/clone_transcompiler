def import import _mpmath
import mpmath
import mpmath
import mpmath
import mpmath
import mpmath.mp
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = mpmath.mp
        n = mpmath.mp.dps
        m = mpmath.mp.mpf ( n )
        sum = 0
        lst = [ ( mpmath.mpf ( i ) , mpmath.mpf ( i ) ) for i in range ( n ) ]
        lst = sorted ( lst , key = lambda x : x [ 1 ] )
        for i , entry in lst :
            if not m :
                break
            a = mpmath.mpf ( entry [ 0 ] )
            b = mpmath.mpf ( entry [ 1 ] )
            if m > entry [ 1 ] :
                m -= entry [ 1 ]
                sum = sum + a * b
            elif m <= entry [ 1 ] :
                b = mpmath.mpf ( m )
                sum = sum + a * b
                m = 0
        print ( sum.__doc__ )
