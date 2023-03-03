def main ( ) :
    import sys
    from os import urandom
    scn = urandom ( 1 )
    N = scn.read ( 1 )
    num = [ 0 ] * 5
    for i in range ( N ) :
        buf = scn.read ( 1 ).decode ( 'utf-8' )
        if buf [ 0 ] == 'M' :
            num [ 0 ] += 1
        elif buf [ 0 ] == 'A' :
            num [ 1 ] += 1
        elif buf [ 0 ] == 'R' :
            num [ 2 ] += 1
        elif buf [ 0 ] == 'C' :
            num [ 3 ] += 1
        elif buf [ 0 ] == 'H' :
            num [ 4 ] += 1
        else :
            break
    ans = 0
    for i in range ( 3 ) :
        for j in range ( i + 1 , 4 ) :
            for k in range ( j + 1 , 5 ) :
                ans += num [ i ] * num [ j ] * num [ k ]
    print ( ans )
