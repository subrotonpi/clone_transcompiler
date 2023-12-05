def main ( ) :
    from math import ceil
    from math import sin , cos , sqrt , pow
    def disit ( a , d ) :
        count = 0
        while a != 0 :
            a = a / d
            count += 1
        return count
    def print ( s ) :
        print ( s )
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
        if x == y :
            return x
        par [ x ] = y
    def lcm ( a , b ) :
        return a * ( b / gcd ( a , b ) )
    def gcd ( a , b ) :
        ta = max ( a , b )
        tb = min ( a , b )
        while ( ta % tb ) :
            ta , tb = tb , tmp
        return tb
    def modcomb ( n , k , mod ) :
        if k == 1 :
            return n
        ans = 1
        for i in range ( n , n - k + 1 , - 1 ) :
            ans = ( ans * i ) % mod
        for i in range ( k , 0 , - 1 ) :
            ans = ( ans * modpow ( i , mod - 2 , mod ) ) % mod
        return ans
    return disit ( n , mod )
