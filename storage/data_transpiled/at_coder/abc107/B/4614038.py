def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h , w = sc.readline ( ).split ( '\n' )
        a = [ ]
        for s , b in zip ( sc.readline ( ).split ( '\n' ) , s.split ( '\n' ) ) :
            for i in range ( w ) :
                a.append ( b )
    row = [ False ] * h
    col = [ False ] * w
    for i in range ( h ) :
        cnt = 0
        for j in range ( w ) :
            if a [ i ] [ j ] == '.' :
                cnt += 1
        if cnt == w :
            row [ i ] = True
    for i in range ( w ) :
        cnt = 0
        for j in range ( h ) :
            if a [ j ] [ i ] == '.' :
                cnt += 1
        if cnt == h :
            col [ i ] = True
    for i in range ( h ) :
        if row [ i ] :
            continue
        for j in range ( w ) :
            if col [ j ] :
                continue
            print ( a [ i ] [ j ] , end = ' ' )
        print ( )
