def main ( ) :
    import sys
    from math import sin , cos
    sc = sys.stdin
    n = int ( sc.readline ( ) )
    m = int ( sc.readline ( ) )
    ans = 0
    if n == 1 and m == 1 :
        ans = 1
    elif n == 1 and m > 1 :
        ans = m - 2
    elif m == 1 and n > 1 :
        ans = n - 2
    elif n > 1 :
        ans = ( n - 2 ) * ( m - 2 )
    print ( ans )
