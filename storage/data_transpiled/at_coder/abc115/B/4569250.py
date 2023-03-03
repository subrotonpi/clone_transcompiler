def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 10000 )
    p = max ( n )
    ans = 0
    for i in range ( n ) :
        p = log ( p )
        max = max ( max , p )
        ans += p
    print ( ans )
