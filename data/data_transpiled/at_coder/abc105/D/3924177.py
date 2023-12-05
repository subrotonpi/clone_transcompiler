def main ( ) :
    import sys
    from collections import defaultdict
    from random import randint
    from random import randint
    from time import sleep
    from random import randint
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    N = randint ( 1 , 10000 )
    M = randint ( 1 , 10000 )
    A = [ randint ( 1 , 10000 ) for _ in range ( 1 , N + 1 ) ]
    B = [ 0 ]
    for i in range ( 1 , N + 1 ) :
        B [ i ] = B [ i - 1 ] + A [ i ]
    d = defaultdict ( int )
    for i in range ( 0 , N ) :
        key = B [ i ] % M
        if key in d :
            d [ key ] = d [ key ] + 1
        else :
            d [ key ] = 1
    ans = 0
    for value in d.values ( ) :
        if 1 < value :
            ans += value * ( value - 1 ) / 2
    print ( ans )
