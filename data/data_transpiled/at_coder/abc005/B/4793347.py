def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import sin , cos , cos , log
    from math import log
    n = randint ( 1 , 101 )
    ans = radians ( n )
    for i in range ( n ) :
        m = radians ( i )
        ans = min ( ans , m )
    print ( ans )
