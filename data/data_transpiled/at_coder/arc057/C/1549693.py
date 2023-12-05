def import _mpmath
import mpmath
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._mpmath = mpmath
        print ( self.solve ( raw_input ( ) ) )
    def solve ( self , a ) :
        m = mpmath.mpf ( a )
        m1 = m * m
        m2 = ( m + 1 ) * ( m + 1 )
        ans = m * m
        for i in range ( 10000000 ) :
            str_pow10 = '1'
            for t in range ( 2 ** i ) :
                str_pow10 = str_pow10 + '0'
            pow10 = _mpmath.mpf ( str_pow10 )
            v1 = m1 / pow10
            v2 = m2 / pow10
            if not m1 % pow10 == 0 :
                v1 = v1 + 1
            if not m2 % pow10 == 0 :
                v2 = v2 + 1
            if v2 - v1 <= 0 :
                break
            ans = str ( v1 )
            if i % 10 == 0 :
                sys.gc ( )
        return ans
    def tr ( * args ) :
        print ( " ".join ( map ( str , args ) ) )
