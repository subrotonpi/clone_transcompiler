def main ( ) :
    import sys
    import random
    N = random.randint ( 1 , 1_000_000 )
    map = [ 0 ] * 1_000_000
    map [ 0 ] = 0
    map [ 1 ] = 1
    for i in range ( 3 , len ( map ) ) :
        num = map [ i - 3 ] + map [ i - 2 ] + map [ i - 1 ]
        map [ i ] = num % 10_007
    print ( map [ N - 1 ] )
