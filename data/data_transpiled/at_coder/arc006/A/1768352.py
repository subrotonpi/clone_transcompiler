def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    from itertools import chain
    e = chain ( [ stdin.read ( ) ] , repeat ( 6 ) )
    l = chain ( [ stdin.read ( ) ] , repeat ( 6 ) )
    ans = 7
    for i in range ( 6 ) :
        for j in range ( 6 ) :
            if e [ i ] == l [ j ] :
                ans -= 1
                e [ i ] = - 1
                break
    if 5 <= ans <= 7 :
        print ( 0 )
    elif ans == 4 :
        print ( 5 )
    elif ans == 3 :
        print ( 4 )
    elif ans == 2 :
        ok = 0
        for i in range ( 6 ) :
            if l [ i ] == b :
                ok = 1
        if ok :
            print ( 2 )
        else :
            print ( 3 )
    else :
        print ( 1 )
