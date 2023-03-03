def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = sc.randint ( 1 , 10000 )
    a = [ sc.randint ( 1 , 10000 ) for i in range ( n + 1 ) ]
    a.sort ( )
    for i in range ( 1 , n + 1 ) :
        a [ i ] -= a [ 0 ]
    m = a [ 1 ]
    for i in range ( 1 , n + 1 ) :
        m = gcd ( m , a [ i ] )
    print ( m )
    def gcd ( m , n ) :
        if m < n :
            return gcd ( n , m )
        if n == 0 :
            return m
        return gcd ( n , m % n )
    return gcd ( m , n )
