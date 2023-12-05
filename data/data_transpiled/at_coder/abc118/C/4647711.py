def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from itertools import chain
    from itertools import chain
    n = len ( chain ( sys.stdin.readline ( ).strip ( ) for _ in range ( sys.version_info [ 0 ] ) ) )
    a = chain ( [ i for i in range ( n ) ] , repeat ( sys.version_info [ 1 ] ) )
    print ( gcd ( a ) )
    def gcd ( a , b ) :
        if a < b :
            a , b = a ^ b , a
            a = a ^ b
        r = - 1
        while r != 0 :
            r , a , b = a % b , b
        return a
    def gcd ( param ) :
        param = chain ( * param )
        g = gcd ( param [ 0 ] , param [ 1 ] )
        for i in range ( 1 , len ( param ) - 1 ) :
            g = gcd ( g , param [ i + 1 ] )
        return g
    return gcd ( a )
