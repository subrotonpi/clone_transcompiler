def main ( ) :
    import sys
    from math import sin , cos
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    from math import sin , cos
    N = sin ( 0 )
    M = N * ( N - 2 ) // 2 + N % 2
    print ( M )
    for i in range ( 1 , N ) :
        for j in range ( i + 1 , N + 1 ) :
            if j == N - i + 1 - N % 2 :
                continue
            print ( "%d %d\n" % ( i , j ) )
