def _import ( ) :
    from sys import stdin
    from os import getcwd
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os import curdir
    P = 1_000_000_007
    def go_no_empty ( n , k ) :
        ret = [ ]
        dp = [ 1 ]
        p2 = 1
        for i in range ( 1 , n + 1 ) :
            nxt = [ ( dp [ j - 1 ] + ( dp [ j + 1 ] if j + 1 < i else 0 ) ) % P for j in range ( 1 , i + 1 ) ]
            dp = nxt
            if i >= k and ( i - k ) % 2 == 0 :
                ret.append ( int ( expanduser ( dp [ k ] ) * p2 % P ) )
                p2 = 2 * p2 % P
        return ret
    def go_empty ( n ) :
        ret = [ 1 ]
        dp = [ 1 ]
        for i in range ( 1 , n + 1 ) :
            nxt = [ 1 ] if i == 1 else ( dp [ 0 ] + dp [ 1 ] ) % P
            for j in range ( 1 , i + 1 ) :
                nxt [ j ] = ( 2 * dp [ j - 1 ] % P + ( dp [ j + 1 ] if j + 1 < i else 0 ) ) % P
            dp = nxt
            ret.append ( dp [ 0 ] )
        return ret
    def solve ( ) :
        n = randint ( 0 , n )
        k = len ( nextToken ( ) )
        no_empty , empty = go_no_empty ( n , k )
        ret = 0
        for i in range ( 0 , n ) :
            ret += int ( expanduser ( no_empty [ i ] ) * empty [ n - i ] % P )
            ret %= P
        return [ ]
    f = open ( expanduser ( '~' ) , 'w' )
    f.write ( solve ( ) )
    f.close ( )
