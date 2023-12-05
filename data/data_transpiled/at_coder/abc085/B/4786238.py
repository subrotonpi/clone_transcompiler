def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        a.sort ( )
        count = 0
        for i in range ( N ) :
            if i == 0 :
                count += 1
            elif i >= 1 and a [ i ] != a [ i - 1 ] :
                count += 1
            else :
                pass
        print ( count )
        sc.close ( )
