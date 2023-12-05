def main ( ) :
    import sys
    from string import ascii_lowercase
    from string import digits
    n = len ( ascii_lowercase )
    s = [ ascii_lowercase [ i ] for i in range ( n ) ]
    cnt1 = cnt2 = 0
    for i in range ( n ) :
        for j in range ( n ) :
            if s [ i ] [ j ] == 'R' :
                cnt1 += 1
            elif s [ i ] [ j ] == 'B' :
                cnt2 += 1
    if cnt1 > cnt2 :
        print ( 'TAKAHASHI' )
    elif cnt1 < cnt2 :
        print ( 'AOKI' )
    else :
        print ( 'DRAW' )
