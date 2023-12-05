def _ ( ) : return 0
import sys
import os
import getopt
MOD = long ( 1e9 + 7 )
def ok ( p , w ) :
    if p & 1 == 1 : return 0
    if ( ( p >> ( w ) ) & 1 == 1 ) : return 0
    for b in range ( 0 , w ) :
        if ( ( p >> b ) & 3 == 3 ) :
            return 0
    return 1
def run ( ) :
    sc = getopt.getopt ( sys.argv [ 1 : ] , "" )
    H , W , K = sc.getopt ( )
    dp = [ [ 1 ] * ( H + 1 ) , [ 1 ] * ( W + 2 ) , [ 1 ] * ( K + 2 ) ]
    dp = [ [ 1 ] * ( H + 1 ) , [ 1 ] * ( W + 2 ) , [ 1 ] * ( K + 2 ) ]
    for h in range ( 1 , H + 1 ) :
        for i in range ( ( 1 , W + 1 ) ) :
            if ok ( i , W ) :
                for j in range ( 1 , W + 1 ) :
                    if ( ( i >> ( j - 1 ) ) & 1 == 1 ) : dp [ h ] [ j - 1 ] = ( dp [ h ] [ j - 1 ] + dp [ h - 1 ] [ j ] ) % MOD
                    if ( ( i >> j ) & 1 == 1 ) : dp [ h ] [ j + 1 ] = ( dp [ h ] [ j + 1 ] + dp [ h - 1 ] [ j ] ) % MOD
                    if ( ( i >> ( j - 1 ) ) & 3 == 0 ) : dp [ h ] [ j ] = ( dp [ h ] [ j ] + dp [ h - 1 ] [ j ] ) % MOD
    print ( dp [ H ] [ K ] )
def debug ( * os ) :
    print ( "".join ( map ( str , os ) ) , file = sys.stderr )
