def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    n = randint ( 1 , 10000 )
    a = chain ( [ randint ( 1 , 10000 ) for _ in range ( n ) ] , repeat ( n ) )
    b = chain ( [ randint ( 1 , 10000 ) for _ in range ( n ) ] , repeat ( n ) )
    a.sort ( )
    b.sort ( )
    cnt = [ 0 ] * 1000002
    for i in range ( n ) :
        cnt [ a [ i ] ] += 1
        cnt [ b [ i ] + 1 ] -= 1
    for i in range ( 1 , 1000000 ) :
        cnt [ i ] = cnt [ i - 1 ] + cnt [ i ]
    ans = 0
    for i in range ( 0 , 1000000 ) :
        ans = max ( ans , cnt [ i ] )
    print ( ans )
