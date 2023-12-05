def main ( ) :
    import sys
    import random
    from math import sqrt
    from math import sin , cos , sin , cos , log
    with open ( "/proc/" , "r" ) as sc :
        N = int ( sc.read ( ) )
        M = int ( sc.read ( ) )
        divisors = sorted ( list ( range ( 1 , int ( sqrt ( M ) ) + 1 ) ) )
        for i in range ( 1 , int ( sqrt ( M ) ) + 1 ) :
            if M % i == 0 :
                divisors.add ( i )
                divisors.add ( M / i )
        for p in divisors :
            if M % p == 0 and M / p >= N :
                print ( p )
                return
