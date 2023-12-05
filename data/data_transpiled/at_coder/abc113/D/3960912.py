def _ ( ) : return 1
import sys
import time
import random
import math
mod = 1000000000 + 7
def main ( ) :
    with open ( '/proc/sys/stdin' ) as sc :
        H , W , K = [ int ( x ) for x in sc.readlines ( ) ]
        rest = legal_distribution ( )
        ans = help ( H , W , K )
        print ( ans )
    def help ( H , W , K ) :
        if W == 1 : return 1
        dp = [ [ 1 , 0 ] * ( H + 2 ) for x in range ( H + 2 ) ]
        for row in range ( 2 , H + 1 ) :
            dp [ row ] [ 0 ] = ( dp [ row - 1 ] [ 0 ] * get_rest ( W - 2 ) % mod + dp [ row - 1 ] [ 1 ] * get_rest ( W - 3 ) % mod ) % mod
            for col in range ( 1 , W - 1 ) :
                dp [ row ] [ col ] = dp [ row - 1 ] [ col ] * get_rest ( col - 1 ) % mod * get_rest ( W - col - 2 ) % mod
                dp [ row ] [ col ] = ( dp [ row ] [ col ] + dp [ row - 1 ] [ col - 1 ] * get_rest ( col - 2 ) % mod * get_rest ( W - col - 2 ) % mod ) % mod
                dp [ row ] [ col ] = ( dp [ row ] [ col ] + dp [ row - 1 ] [ col + 1 ] * get_rest ( col - 1 ) % mod * get_rest ( W - col - 3 ) % mod ) % mod
            dp [ row ] [ W - 1 ] = ( dp [ row - 1 ] [ W - 1 ] * get_rest ( W - 2 ) % mod + dp [ row - 1 ] [ W - 2 ] * get_rest ( W - 3 ) % mod ) % mod
        return dp [ H + 1 ] [ K - 1 ]
    def legal_distribution ( x ) :
        if x <= 0 : return 1
        return rest [ x ]
