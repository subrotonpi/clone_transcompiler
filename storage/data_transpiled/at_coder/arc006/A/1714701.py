def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    e = chain ( [ ] , repeat ( 6 ) )
    l = chain ( [ ] , repeat ( 6 ) )
    b = chain ( [ ] , repeat ( 6 ) )
    for i in chain ( range ( 6 ) , repeat ( 6 ) ) :
        l.append ( repeat ( 6 ) )
    cnt = 0
    ans = 0
    bonus = False
    for i in range ( 6 ) :
        for j in range ( 6 ) :
            if e [ j ] == l [ i ] :
                cnt += 1
                break
            if j == 5 and l [ i ] == b :
                bonus = True
    cnt += ( cnt // 6 )
    if cnt == 5 and bonus :
        cnt += 1
    print ( ( 8 - cnt ) if ( cnt >= 3 ) else ( 0 , ) )
