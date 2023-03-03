def import _readline
import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        sc = sys.stdin
        s = sc.read ( )
        k = sc.count ( )
        dp = [ [ 0 ] * ( k + 1 ) for i in range ( 0 , k ) ]
        for i in range ( 0 , k ) :
            for r in s :
                for l in range ( r , - 1 , - 1 ) :
                    if l == r :
                        dp [ l ] [ r ] [ i ] = 1
                        continue
                    if r == l + 1 :
                        dp [ l ] [ r ] [ i ] = 2 if s [ l ] == s [ r ] or i > 0 else 1
                        continue
                    if s [ l ] == s [ r ] :
                        dp [ l ] [ r ] [ i ] = dp [ l + 1 ] [ r - 1 ] [ i ] + 2
                    else :
                        dp [ l ] [ r ] [ i ] = max ( dp [ l + 1 ] [ r ] [ i ] , dp [ l ] [ r - 1 ] [ i ] )
                    if i > 0 :
                        dp [ l ] [ r ] [ i ] = max ( dp [ l ] [ r ] [ i ] , dp [ l + 1 ] [ r - 1 ] [ i - 1 ] + 2 )
        print ( dp [ 0 ] [ - 1 ] [ k ] )
