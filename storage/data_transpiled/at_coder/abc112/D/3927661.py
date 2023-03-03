def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos
    N = ceil ( sin ( 'N' ) )
    M = ceil ( sin ( 'M' ) )
    if M % N == 0 :
        print ( M / N )
        return
    end = M / N
    ans = 0
    for i in range ( 1 , end + 1 ) :
        if ( M - i * ( N - 1 ) ) % i == 0 :
            ans = i
        if i * N > M :
            break
    print ( ans )
