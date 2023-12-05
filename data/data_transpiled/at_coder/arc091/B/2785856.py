def main ( args ) :
    import sys
    from math import factorial
    from math import log
    from math import log
    from math import log
    from math import factorial
    n = factorial ( args [ 0 ] )
    k = factorial ( args [ 1 ] )
    count = 0
    for b in range ( k + 1 , n + 1 ) :
        count += ( b - k ) * ( n // b )
        if n % b >= k and k == 0 :
            count += n % b - k
        elif n % b >= k :
            count += n % b - k + 1
    print ( count )
