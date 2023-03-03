def main ( ) :
    import sys
    from sympy.core.compatibility import gcd
    with open ( 'README.txt' , 'r' ) as f :
        a = f.read ( )
        b = f.read ( )
        for i in range ( 1 , a ) :
            h = f.read ( )
            b = ( b // gcd ( b , h ) ) * h
        print ( b )
    def gcd ( q , p ) :
        if p == 0 :
            return q
        else :
            return gcd ( p , q % p )
    return gcd ( a , b )
