def main ( ) :
    import sys
    from math import ceil
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = log ( 'N' )
    K = log ( 'K' )
    log ( 'N' )
    ans = 0
    if K == 0 :
        ans = N * N
    else :
        for b in range ( N , 0 , - 1 ) :
            ans += max ( 0 , ( b - K ) * ( N // b ) )
            ans += max ( 0 , N % b - K + 1 )
    print ( ans )
