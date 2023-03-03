def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    n = sc.next ( )
    cnt = [ 0 ] * 5
    for ch in sc.next ( ) :
        if ch == 'M' :
            cnt [ 0 ] += 1
        if ch == 'A' :
            cnt [ 1 ] += 1
        if ch == 'R' :
            cnt [ 2 ] += 1
        if ch == 'C' :
            cnt [ 3 ] += 1
        if ch == 'H' :
            cnt [ 4 ] += 1
    sc.close ( )
    ans = 0
    for i in range ( len ( cnt ) ) :
        for j in range ( i + 1 , len ( cnt ) ) :
            for k in range ( j + 1 , len ( cnt ) ) :
                ans += cnt [ i ] * cnt [ j ] * cnt [ k ]
    print ( ans )
