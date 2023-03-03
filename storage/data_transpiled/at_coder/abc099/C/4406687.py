def import import sys , string , count , p , ** kwargs ) :
    from itertools import repeat
    from random import randint
    from sys import maxsize
    from itertools import chain
    from itertools import chain
    from itertools import chain
    n = next ( iter ( sys.stdin.readline ( ) ) )
    ans = sys.maxint
    for i in chain ( chain ( [ 0 ] , repeat ( n , 6 ) ) , repeat ( [ 0 ] , p ) ) :
        six = i
        nine = n - six - ( n - six ) % 9
        if six + nine <= n :
            ans = min ( ans , count ( six , 6 ) + count ( nine , 9 ) + n - six - nine )
    print ( ans )
    def count ( n , p ) :
        c = 0
        while n :
            c += n % p
            n //= p
        return c
    return chain ( repeat ( [ 1 ] , p ) , repeat ( [ 2 ] , p ) )
