def test_C ( ) :
    import sys
    import random
    import string
    import math
    from math import ceil
    SET = [ 4 , 5 , 3 , 2 , 1 ]
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as f :
            cases = int ( f.read ( ) )
            r , n , m , k , count = [ int ( c ) for c in range ( 1 , cases + 1 ) ]
            res = [ ]
            print ( "Case #%d: " % c )
            for i in range ( r ) :
                lcm_ = 1
                for j in range ( k ) :
                    lcm_ = lcm ( lcm_ , random.randint ( 1 , n ) )
                count = 0
                for j in SET :
                    while count < n and ( lcm_ % j ) == 0 :
                        lcm_ /= j
                        res.append ( j )
                        count += 1
                if res [ 0 ] == 4 and res [ n - 1 ] == 1 :
                    res [ 0 ] = 2
                    res [ n - 1 ] = 2
                for j in res :
                    print ( j == 1 and 2 or j , end = ' ' )
                print ( )
    def gcd ( a , b ) :
        if not b :
            return a
        return gcd ( b , a % b )
    def lcm ( a , b ) :
        return a // gcd ( a , b ) * b
    return C ( )
