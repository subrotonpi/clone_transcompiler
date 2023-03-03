def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from itertools import chain
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    nums = chain ( range ( n ) , repeat ( n ) )
    ans = 0
    for i in range ( n ) :
        nums [ i ] = repeat ( i )
    nums.sort ( )
    for i in range ( 1 , k + 1 ) :
        ans += nums [ - i ]
    print ( ans )
