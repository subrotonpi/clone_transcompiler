def main ( ) :
    import sys
    from itertools import repeat
    a , b , c , d = repeat ( a , b , c , d )
    ans = 100
    e = [ a ] * d
    for i in range ( 1 , d ) :
        e [ i ] = repeat ( i , a )
    count = 0
    for i in range ( 0 , d ) :
        count = 0
        if e [ i ] == b :
            count += 1
        if e [ i ] == c :
            count += 1
        for j in range ( 0 , d ) :
            if e [ i ] == e [ j ] :
                count += 1
        if count >= 2 :
            ans = 0
    if ans == 0 :
        print ( 'NO' )
    else :
        print ( 'YES' )
