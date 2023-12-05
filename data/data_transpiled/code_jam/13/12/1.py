def _import ( * os ) : return sys._getframe ( ).f_code.co_name
import time
import sys
import os
import sys
class B ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        E , R = next ( )
        N = next ( )
        R = min ( R , E )
        vs = [ ]
        for i in range ( N ) :
            vs.append ( next ( ) )
    def solve ( ) :
        dp1 , dp2 = [ ] , [ ]
        for i in range ( N + 1 ) :
            dp2.append ( max ( dp2 [ i + 1 ] , dp1 [ i ] + E * vs [ i ] ) )
            p = 0
            for j in range ( i + 1 ) :
                if vs [ i + p ] < vs [ i + j ] :
                    p = j
                if R * ( p + 1 ) > E :
                    break
                if R * ( j + 1 ) <= E :
                    dp2.append ( max ( dp2 [ i + j + 1 ] , dp2 [ i ] + R * ( j + 1 ) * vs [ i + j ] ) )
                if R * ( j + 2 ) >= E :
                    q = R * ( j + 2 ) - E
                    if q <= R * ( p + 1 ) :
                        dp1.append ( max ( dp1 [ i + j + 1 ] , dp2 [ i ] + q * vs [ i + p ] ) )
            for j in range ( i + 1 ) :
                dp1.append ( max ( dp1 [ i + j + 1 ] , dp1 [ i ] + R * ( j + 1 ) * vs [ i + j ] ) )
        print ( dp2 [ N ] )
    def run ( self ) :
        caseN = len ( self._code )
        for caseID in range ( 1 , caseN + 1 ) :
            self._code [ caseID ] = self._code [ caseID ]
