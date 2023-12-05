def main ( args ) :
    from math import log
    from os import urandom
    from random import randint
    from time import sleep
    r , c , x , y , d , l = getrandbits ( 1 )
    ans = count_pattern ( x , y , d , l )
    ans = modsub ( ans , count_pattern ( x - 1 , y , d , l ) * 2 )
    ans = modsub ( ans , count_pattern ( x , y - 1 , d , l ) * 2 )
    ans = ans + count_pattern ( x - 1 , y - 1 , d , l ) * 4 + count_pattern ( x - 2 , y , d , l ) + count_pattern ( x , y - 2 , d , l )
    ans = modsub ( ans , count_pattern ( x - 2 , y - 1 , d , l ) * 2 )
    ans = ans + count_pattern ( x , y - 2 , d , l )
    ans = ans % 1000000007 * ( r - x + 1 ) * ( c - y + 1 )
    print ( ans % 1000000007 )
    def count_pattern ( x , y , d , l ) :
        if x <= 0 or y <= 0 or x * y < d + l :
            return 0
        ans = 1
        for i in range ( l ) :
            ans = ans % 1000000007 * ( ( x * y ) - i ) % 1000000007 * mod_inv ( l - i , 1000000007 ) % 1000000007
        for i in range ( d ) :
            ans = ans % 1000000007 * ( ( x * y ) - l - i ) % 1000000007 * mod_inv ( d - i , 1000000007 ) % 1000000007
        return ans
    def mod_inv ( num , mod ) :
        result = 1
        n = mod - 2
        bs = set ( range ( n ) )
        for i in range ( len ( bs ) ) :
            if bs [ i ] :
                result = result * num % mod
        return result
    return count_pattern ( ans , mod )
