def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        s = [ ]
        for ss in sc.split ( ) :
            for i , j in enumerate ( ss ) :
                s [ i ].append ( j )
    ans = 0
    for a in range ( n ) :
        flag = 1
        for i in range ( n ) :
            for j in range ( n ) :
                if s [ ( i + a ) % n ] [ j ] != s [ ( j + a ) % n ] [ i ] :
                    flag = 0
        if flag :
            ans += n
    print ( ans )
