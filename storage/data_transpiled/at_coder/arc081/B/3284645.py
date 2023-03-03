def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    n = sc.next ( )
    s1 = sc.next ( )
    s2 = sc.next ( )
    d = [ ]
    for i in range ( n ) :
        if s1 [ i ] == s2 [ i ] :
            d.append ( 1 )
        else :
            d.append ( 2 )
            i += 1
    sc.close ( )
    mod = 1000000007
    if d [ 0 ] == 1 :
        ans = 3
    else :
        ans = 6
    for i in range ( 1 , len ( d ) ) :
        if d [ i ] == 1 :
            if d [ i - 1 ] == 1 :
                ans *= 2
            else :
                ans *= 1
        else :
            if d [ i - 1 ] == 1 :
                ans *= 2
            else :
                ans *= 3
        if ans > mod :
            ans %= mod
    print ( ans )
