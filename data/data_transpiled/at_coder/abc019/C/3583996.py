def main ( args ) :
    import sys
    from collections import defaultdict
    from random import randint
    from collections import defaultdict
    from collections import defaultdict
    N = int ( randint ( 1 , N ) )
    a = [ randint ( 1 , N ) for _ in range ( N ) ]
    ans = 0
    d = defaultdict ( int )
    for i in range ( N ) :
        while a [ i ] % 2 == 0 :
            a [ i ] /= 2
        d [ a [ i ] ] += 1
    print ( len ( d ) )
