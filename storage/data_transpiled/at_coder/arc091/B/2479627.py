def main ( sc ) :
    import math
    from math import ceil
    n = math ( sc.n )
    k = math ( sc.k )
    sum = 0
    for b in range ( 1 , n + 1 ) :
        if b <= k :
            continue
        sum += ( b - k ) * ( n / b ) + max ( n % b - max ( k - 1 , 0 ) , 0 )
    print ( sum )
