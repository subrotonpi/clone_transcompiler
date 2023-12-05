def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    n , l , t = sys.maxint , sys.maxint , sys.maxint
    temp , cnt , d = 0 , 0 , 0
    a = chain ( [ n ] , repeat ( n ) )
    for i in range ( n ) :
        a.append ( i )
        d = sys.maxint
        if d == 1 :
            temp = a [ i ] + t
            a.append ( temp % l )
            cnt += temp // l
        else :
            temp = a [ i ] - t
            a.append ( temp % l )
            cnt += temp // l
            if a [ i ] < 0 :
                a [ i ] += l
                cnt -= 1
    a.sort ( )
    cnt %= n
    if cnt < 0 :
        cnt += n
    cnt %= n
    for i in range ( cnt , cnt + n ) :
        j = i % n
        print ( a [ j ] )
    sys.exit ( 0 )
