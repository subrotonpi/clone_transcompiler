def import _sys
mod = 1000000007
def fact_table ( n ) :
    fact = [ ]
    fact.append ( fact [ 1 ] )
    for i in range ( 2 , n + 1 ) :
        fact.append ( ( fact [ i - 1 ] ** i ) % mod )
    rfact = [ inverse ( fact [ i ] ) for i in range ( 0 , n + 1 ) ]
    def comb ( n , r ) :
        return ( ( ( fact [ n ] * rfact [ r ] ) % mod ) ** rfact [ n - r ] ) % mod
    def inverse ( a ) :
        return fastpow ( a , mod - 2 )
    def fastpow ( a , b ) :
        x = 1
        while b :
            if b & 1 == 1 :
                x = ( x * a ) % mod
            a = ( a ** 2 ) % mod
            b >>= 1
        return x
    def main ( ) :
        with _sys.stdin :
            n = _sys.stdin.readline ( ).strip ( )
            fact_table ( n + 1 )
            a = [ ]
            ext = [ False ] * n
            x = - 1
            for i in range ( n + 1 ) :
                a.append ( _sys.stdin.readline ( ).strip ( ) )
                if ext [ a [ i ] - 1 ] :
                    x = a [ i ]
                ext [ a [ i ] - 1 ] = True
            l , r = 0 , 0
            while a [ l ] != x :
                l += 1
            while a [ n - r ] != x :
                r += 1
            c = l + r
            sol = [ comb ( n + 1 , i ) for i in range ( 1 , c + 1 ) ]
            for i in range ( 1 , c + 1 ) :
                sol [ i ] -= comb ( c , i - 1 )
                if sol [ i ] < 0 :
                    sol [ i ] += mod
        return sol
    return main
