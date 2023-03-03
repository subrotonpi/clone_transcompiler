def _import ( ) :
    import random
    import os
    import sys
    class Bai3 ( object ) :
        def gcd ( self , a , b ) :
            while a != 0 and b != 0 :
                if a > b : a %= b
                else : b %= a
            return a + b
        def main ( self ) :
            sc = sys.stdin
            f = open ( 'Clarge.out' , 'w' )
            isprime = [ True ] * 1000010
            isprime [ 0 ] = isprime [ 1 ] = False
            nprime = 0
            for i in range ( 2 , len ( isprime ) ) :
                if isprime [ i ] :
                    nprime += 1
                    for j in range ( i + i , len ( isprime ) , i ) :
                        isprime [ j ] = False
            primelist = [ i ] * nprime
            nprime = 0
            for i in range ( 2 , len ( isprime ) ) :
                if isprime [ i ] :
                    primelist [ nprime ] = i
            ntest = sc.randint ( 1 , nprime )
            for test in range ( 1 , ntest + 1 ) :
                n = random.randint ( 1 , nprime )
                res = 0
                if n > 1 :
                    res = 1
                    for i in range ( nprime ) :
                        p = primelist [ i ]
                        if p * p > n :
                            break
                        t = p
                        while t * p <= n :
                            t *= p
                            res += 1
                f.write ( 'Case #%d: ' % test )
                f.write ( res )
                f.write ( '\n' )
            f.close ( )
            sc.close ( )
    return Bai3
