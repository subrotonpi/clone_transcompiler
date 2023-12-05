def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        t = sc.readline ( )
        type = [ 0 ] * 5
        for c in s :
            if c == 'L' :
                type [ 0 ] += 1
            elif c == 'R' :
                type [ 1 ] += 1
            elif c == 'U' :
                type [ 2 ] += 1
            elif c == 'D' :
                type [ 3 ] += 1
            elif c == '?' :
                type [ 4 ] += 1
    d = abs ( type [ 0 ] - type [ 1 ] ) + abs ( type [ 2 ] - type [ 3 ] )
    if t == 1 :
        print ( d + type [ 4 ] )
    else :
        if d >= type [ 4 ] :
            print ( d - type [ 4 ] )
        else :
            print ( ( type [ 4 ] - d ) % 2 )
