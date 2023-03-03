def main ( ) :
    import sys
    from itertools import count
    sc = sys.stdin
    n = sc.read ( )
    cnt = [ 0 ] * 5
    for ch in sc.read ( ) :
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
    c = 0
    for ch in cnt :
        if ch > 0 :
            c += 1
    if c < 3 :
        print ( 0 )
        return
    ans = 0
    for i in range ( len ( cnt ) ) :
        for j in range ( i + 1 , len ( cnt ) ) :
            for k in range ( j + 1 , len ( cnt ) ) :
                ans += cnt [ i ] * cnt [ j ] * cnt [ k ]
    print ( ans )
