def main ( ) :
    import sys
    from random import randint
    scn = randint ( 1 , 9 )
    c = [ 0 ] * 6
    for i in range ( 9 ) :
        a = scn.__next__ ( )
        if i < 3 :
            c [ 2 * i ] += a
            c [ 2 * i + 1 ] += a
        else :
            if i == 3 :
                c [ 2 ] += a
                c [ 4 ] += a
            if i == 4 :
                c [ 0 ] += a
                c [ 5 ] += a
            if i == 5 :
                c [ 1 ] += a
                c [ 3 ] += a
            if i == 6 :
                c [ 3 ] += a
                c [ 5 ] += a
            if i == 7 :
                c [ 1 ] += a
                c [ 4 ] += a
            if i == 8 :
                c [ 0 ] += a
                c [ 2 ] += a
    ans = True
    for i in range ( 6 ) :
        ans &= ( c [ i ] == c [ 0 ] )
    print ( 'Yes' if ans else 'No' )
