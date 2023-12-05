def main ( ) :
    import sys
    def main ( ) :
        with open ( sys.argv [ 1 ] ) as f :
            import random
            N = random.randint ( 1 , N )
            T = [ random.randint ( 1 , N ) for _ in range ( N ) ]
            lcm = T [ 0 ]
            for i in range ( 1 , N ) :
                T [ i ] = random.randint ( 1 , N )
                lcm = lcm ( lcm , T [ i ] )
            print ( lcm )
    def lcm ( l1 , l2 ) :
        if l1 < l2 :
            return lcm ( l2 , l1 )
        gcd = gcd ( l1 , l2 )
        return ( l1 // gcd ) * ( l2 // gcd ) * gcd
    def gcd ( l1 , l2 ) :
        if l1 < l2 :
            return gcd ( l2 , l1 )
        elif l2 == 0 :
            return l1
        else :
            r = l1 % l2
            return gcd ( l2 , r )
    return main ( )
