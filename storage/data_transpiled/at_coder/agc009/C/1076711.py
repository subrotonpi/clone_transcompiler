def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from os.path import join
    from os import urandom
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    MOD = 1000000007
    N = int ( sys.argv [ 1 ] )
    A = join ( sys.argv [ 1 : ] )
    B = join ( sys.argv [ 1 : ] )
    if A > B :
        temp = A
        A = B
        B = temp
    S = [ - ( B + 1 ) for i in range ( N + 1 ) ]
    for i in range ( 2 , N + 1 ) :
        S [ i ] = join ( sys.argv [ 1 : i ] )
    for i in range ( 2 , N + 1 ) :
        if S [ i ] - S [ i - 2 ] < A :
            print ( 0 )
            sys.exit ( 1 )
    dp = [ 1 ]
    idx_zero = idx_b = 0
    sum = 0
    for i in range ( 1 , N + 1 ) :
        while S [ i ] - S [ idx_b ] >= B :
            sum = ( sum + dp [ idx_b ] ) % MOD
            idx_b += 1
        dp.append ( sum )
        if S [ i ] - S [ i - 1 ] < A :
            while idx_zero < i - 1 :
                if idx_zero < idx_b :
                    sum = ( sum - dp [ idx_zero ] + MOD ) % MOD
                dp [ idx_zero ] = 0
                idx_zero += 1
    ans = 0
    for i in range ( N + 1 ) :
        ans = ( ans + dp [ i ] ) % MOD
    print ( ans )
    sys.exit ( 1 )
