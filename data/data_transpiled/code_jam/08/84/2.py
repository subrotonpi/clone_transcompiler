def _import ( ) :
    from os import urandom
    import random
    from os import fdopen
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    MOD = 30031
    def main ( ) :
        f = open ( join ( expanduser , 'd.in' ) , 'w' )
        out = open ( join ( expanduser , 'd.out' ) , 'w' )
        n = len ( a )
        for i in range ( n ) :
            for k in range ( len ( a ) ) :
                c [ i ] += a [ i ] * b [ j ] [ k ]
                c [ i ] %= MOD
    def solve ( ) :
        n , k , p = a [ 0 ] , a [ 1 ] , a [ 2 ]
        u = [ 1 ] * p
        w = [ 1 ] * p
        c = 0
        for m in range ( ( 1 , p ) ) :
            q = 0
            for i in range ( p ) :
                if m & ( 1 << i ) :
                    q += 1
                if q == k :
                    u [ m ] = c
                    w [ c ] = m
                    c += 1
        a = [ ]
        for i in range ( c ) :
            q = w [ i ]
            if q & 1 :
                qq = ( q >> 1 ) + ( 1 << ( p - 1 ) )
                a.append ( u [ qq ] )
            else :
                for j in range ( p ) :
                    if q & ( 1 << j ) :
                        qq = ( q >> 1 ) - ( 1 << ( j - 1 ) ) + ( 1 << ( p - 1 ) )
                        a.append ( u [ qq ] )
        pow = ( n - k )
        b = [ ]
        for i in range ( c ) :
            b.append ( i )
        return b
    return solve
