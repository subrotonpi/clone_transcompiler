def _import ( ) :
    from math import sqrt
    from math import sin , cos , sqrt
    from os import urandom
    from random import randint
    from os import urandom
    n = urandom ( 1 )
    s = int ( sqrt ( n ) ) + 1
    ans = 100
    for i in range ( 1 , s + 1 ) :
        if n % i == 0 :
            ans = min ( _F ( i , n // i ) , ans )
    urandom ( 1 )
    def F ( A , B ) :
        return max ( _F ( A , B ) , _F ( B , A ) )
    def get ( n ) :
        c = 1
        while n / 10 > 0 :
            c += 1
            n //= 10
        return c
    return _F ( )
