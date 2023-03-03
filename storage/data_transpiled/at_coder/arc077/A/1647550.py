def main ( ) :
    from math import ceil
    from itertools import deque
    def modpow ( a , mod ) :
        if b == 0 : return 1
        if b % 2 == 0 :
            d = modpow ( a , mod / 2 , mod )
            return ( d * d ) % mod
        else :
            return ( a * modpow ( a , mod ) ) % mod
    def disit ( a , d ) :
        count = 0
        while a :
            a = a // d
            count += 1
        return count
    if n % 2 == 1 :
        iter = q.descend ( )
    else :
        iter = iter ( q )
    i = 1
    for x in iter :
        if i == n :
            print ( x , end = ' ' )
        else :
            print ( x , end = ' ' )
            print ( ' ' )
        i += 1
    def print ( s ) :
        print ( s , end = ' ' )
    def init ( par , N ) :
        for i in range ( N ) :
            par [ i ] = i
    def root ( x , par ) :
        if par [ x ] == x :
            return x
        else :
            return ( par [ x ] , root ( par [ x ] , par ) )
    def same ( x , y , par ) :
        return root ( x , par ) == root ( y , par )
    def unite ( x , y , par ) :
        x , y = root ( x , par )
        if x == y : return x
        par [ x ] = y
    def lcm ( a , b ) :
        return a * ( b / gcd ( a , b ) )
    def gcd ( a , b ) :
        ta = max ( a , b )
        tb = min ( a , b )
        while ( ta % tb ) :
            ta = tb
            tb = tmp
        return tb
    def modcomb ( n , k ) :
        return n
    return modcomb ( n , mod )
