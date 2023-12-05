def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import farray
    from numpy.linalg import norm
    from numpy.random import random
    N = random.randint ( 1 , N )
    X = random.randint ( 1 , N )
    position_arr = [ ]
    cumulative_sum = [ norm ( x ) + position_arr for x in range ( N + 1 ) ]
    sum = X * N + 5 * cumulative_sum [ N ]
    for i in range ( 1 , N ) :
        cost = X * i + 5 * ( cumulative_sum [ N ] - cumulative_sum [ N - i ] )
        for j , k in enumerate ( range ( 5 , N - i , - 2 , - i ) ) :
            if cost > sum :
                break
            cost += j * ( cumulative_sum [ k ] - cumulative_sum [ max ( k - i , 0 ) ] )
        sum = min ( sum , cost )
    print ( sum + X * N )
