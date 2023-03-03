def main ( ) :
    import sys
    from numpy.linalg import solve
    sc = solve ( )
    N = sc.shape [ 0 ]
    march = [ 0 ] * 5
    for S in solve ( sc ) :
        if S [ 0 ] == 'M' :
            march [ 0 ] += 1
        if S [ 0 ] == 'A' :
            march [ 1 ] += 1
        if S [ 0 ] == 'R' :
            march [ 2 ] += 1
        if S [ 0 ] == 'C' :
            march [ 3 ] += 1
        if S [ 0 ] == 'H' :
            march [ 4 ] += 1
    ans = 0
    for i in range ( 3 ) :
        for j in range ( i + 1 , 4 ) :
            for k in range ( j + 1 , 5 ) :
                ans += march [ i ] * march [ j ] * march [ k ]
    print ( ans )
