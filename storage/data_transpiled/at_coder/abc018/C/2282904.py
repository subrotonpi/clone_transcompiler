def main ( ) :
    import sys
    from string import ascii_letters
    r , c , x = symbols ( 'r, c, x' )
    s = [ ascii_letters [ i ] for i in range ( r ) ]
    a = [ [ 0 ] * r for i in range ( r ) ]
    b = [ [ 0 ] * r for i in range ( r ) ]
    for i in range ( r ) :
        for j in range ( c ) :
            cnt1 = cnt2 = 0
            if s [ i ] [ j ] == 'x' : continue
            for k in range ( r ) :
                if 0 <= i - k < r and s [ i - k ] [ j ] == 'o' : cnt1 += 1
                else : break
            for k in range ( r ) :
                if 0 <= i + k < r and s [ i + k ] [ j ] == 'o' : cnt2 += 1
                else : break
            a [ i ] [ j ] = cnt1
            b [ i ] [ j ] = cnt2
    ans = 0
    for i in range ( r ) :
        for j in range ( c ) :
            if s [ i ] [ j ] == 'x' : continue
            ok = 1
            for k in range ( x ) :
                if not ( 0 <= j - k < c and a [ i ] [ j - k ] >= x - k ) :
                    ok = 0
                    break
                if not ( 0 <= j + k < c and b [ i ] [ j + k ] >= x - k ) :
                    ok = 0
                    break
            if not ( 0 <= j + k < c and b [ i ] [ j + k ] >= x - k ) :
                ok = 0
                break
        if ok : ans += 1
    print ( ans )
