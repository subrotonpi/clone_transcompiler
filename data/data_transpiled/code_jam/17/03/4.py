def solve ( N , K ) :
    import os
    from math import sqrt
    from os.path import join
    if K == 1 :
        arr = [ N / 2 , ( N - 1 ) / 2 ]
        return arr
    if K % 2 == 0 :
        return solve ( N / 2 , K / 2 )
    return solve ( ( N - 1 ) / 2 , K / 2 )
