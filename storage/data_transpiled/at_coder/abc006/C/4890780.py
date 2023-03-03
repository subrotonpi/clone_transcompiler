def main ( _ ) :
    import sys
    from itertools import repeat
    n , m = repeat ( n )
    a2 , a3 , a4 = 0 , 0 , 0
    if m % 2 == 1 :
        a3 += 1
        m -= 3
        n -= 1
    if m % 4 == 2 :
        a2 += 1
        m -= 2
        n -= 1
    if 2 * n > m or m > 4 * n :
        print ( '-1 -1 -1' )
    else :
        a2 += ( 4 * n - m ) / 2
        a4 += ( m - ( 4 * n - m ) ) / 4
        print ( a2 , a3 , a4 )
