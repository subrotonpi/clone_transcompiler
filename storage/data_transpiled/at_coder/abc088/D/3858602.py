def main ( ) :
    import sys
    import random
    import time
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            h , w = sc.readline ( ).split ( )
            masu = [ ]
            for line in sc.readlines ( ) :
                masu.append ( line )
    cnt = [ [ 0 , 0 ] for i in range ( h + 2 ) ]
    siro = 0
    for i in range ( h ) :
        for j in range ( w ) :
            if masu [ i ] [ j ] == '#' :
                cnt [ i + 1 ] [ j + 1 ] = - 1
            else :
                cnt [ i + 1 ] [ j + 1 ] = 0
                siro += 1
    for i in range ( w + 2 ) :
        cnt [ 0 ] [ i ] = - 1
        cnt [ h + 1 ] [ i ] = - 1
    for i in range ( h + 2 ) :
        cnt [ i ] [ 0 ] = - 1
        cnt [ i ] [ w + 1 ] = - 1
    cnt [ 1 ] [ 1 ] = 1
    dx = [ 0 , 1 , 0 , - 1 ]
    dy = [ 1 , 0 , - 1 , 0 ]
    pos = point ( 1 , 1 )
    queue = [ pos ]
    while not queue.empty ( ) :
        nowpos = queue.pop ( )
        for i in range ( 4 ) :
            nx = nowpos [ 0 ] + dx [ i ]
            ny = nowpos [ 1 ] + dy [ i ]
            if cnt [ ny ] [ nx ] == 0 :
                cnt [ ny ] [ nx ] = cnt [ nowpos [ 1 ] ] [ nowpos [ 0 ] ] + 1
                npos = point ( nx , ny )
                queue.append ( npos )
    if cnt [ h ] [ w ] != 0 and cnt [ h ] [ w ] != - 1 :
        print ( siro - cnt [ h ] [ w ] )
    else :
        print ( - 1 )
