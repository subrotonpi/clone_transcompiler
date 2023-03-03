def main ( ) :
    import sys
    from string import ascii_letters
    r , c , k = symbols ( 'r c k' )
    s = [ ]
    for i in range ( r ) :
        data = ascii_letters.pop ( i )
        s.append ( data )
    s = [ ]
    for j in range ( c ) :
        cnt = 0
        for i in range ( r ) :
            if s [ i ] [ j ] == 'o' :
                cnt += 1
                up [ i ].append ( cnt )
            else :
                cnt = 0
    down = [ ]
    for j in range ( c ) :
        cnt = 0
        for i in range ( r - 1 , - 1 , - 1 ) :
            if s [ i ] [ j ] == 'o' :
                cnt += 1
                down [ i ].append ( cnt )
            else :
                cnt = 0
    ans = 0
    for i in range ( r ) :
        for j in range ( c ) :
            left = 0
            for a in range ( j , - 1 , - 1 ) :
                if s [ i ] [ a ] == 'x' :
                    break
                if up [ i ] [ a ] < k - left :
                    break
                if down [ i ] [ a ] < k - left :
                    break
                left += 1
                if left == k :
                    break
            right = 0
            for a in range ( j , c ) :
                if s [ i ] [ a ] == 'x' :
                    break
                if up [ i ] [ a ] < k - right :
                    break
                if down [ i ] [ a ] < k - right :
                    break
                right += 1
                if right == k :
                    break
    print ( ans )
