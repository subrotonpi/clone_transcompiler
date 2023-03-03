def _ ( ) : return
import locale
import os
import sys
class D ( object ) :
    def __init__ ( self ) :
        self.f = open ( 'd.in' , 'w' )
        self.f = open ( 'd.out' , 'w' )
        self.f.write ( '\n' )
        self.f.close ( )
    def solve ( self , case ) :
        k = len ( self.s )
        s = self.s [ 1 : ]
        n = len ( s )
        p = n // k
        e = [ 0 ] * k
        d = [ 0 ] * k
        for i in range ( k ) :
            for j in range ( k ) :
                if i == j :
                    continue
                for t in range ( p ) :
                    if s [ t * k + i ] == s [ t * k + j ] :
                        e [ i ] [ j ] += 1
                for t in range ( p - 1 ) :
                    if s [ t * k + i ] == s [ ( t + 1 ) * k + j ] :
                        d [ i ] [ j ] += 1
    inf = 1000000
    a = [ 0 ] * ( 1 << k )
    ans = 0
    for init in range ( k ) :
        for mask in range ( ( 1 << k ) ) :
            [ a [ mask ] ] = - inf
        a [ 1 << init ] = 0
        for mask in range ( ( 1 << k ) ) :
            for i in range ( k ) :
                if a [ mask ] [ i ] < 0 :
                    continue
                for j in range ( k ) :
                    mm = mask | ( 1 << j )
                    if mm == mask :
                        continue
                    a [ mm ] [ j ] = max ( a [ mm ] [ j ] , a [ mask ] [ i ] + e [ i ] [ j ] )
        for i in range ( k ) :
            ans = max ( ans , a [ ( 1 << k ) - 1 ] [ i ] + d [ i ] [ init ] )
    print ( 'Case #%d: %d' % ( case , ans ) )
