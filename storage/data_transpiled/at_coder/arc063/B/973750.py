def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    T = randint ( 1 , T )
    A = solve ( N , T )
    max_diff = min ( A )
    for i in range ( N ) :
        if min ( A ) > min ( A ) :
            min ( A )
            max_diff = max ( A - min ( A ) , max_diff )
    ans = 0
    min ( A )
    for i in range ( N ) :
        min ( A )
        if max_diff == A [ i ] - min ( A ) :
            ans += 1
    print ( ans )
