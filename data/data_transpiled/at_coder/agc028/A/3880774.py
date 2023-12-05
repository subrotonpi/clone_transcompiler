def main ( ) :
    import sys
    from sympy.core.compatibility import builtins
    with open ( 'README.txt' , 'r' ) as sc :
        N , M , S , T = sc.read ( ).split ( )
        L = lcm ( N , M )
        d = { }
        for i in range ( N ) :
            if ( L / N ) * i not in d :
                d [ ( L / N ) * i ] = S [ i ]
        for i in range ( M ) :
            if d.has_key ( ( L / M ) * i ) :
                if d [ ( L / M ) * i ] != T [ i ] :
                    print ( - 1 )
                    return
        print ( L )
    def gcd ( a , b ) :
        if b == 0 :
            return a
        return gcd ( b , a % b )
    def lcm ( a , b ) :
        return long ( a ) // gcd ( a , b ) * b
    return lcm ( L , M )
