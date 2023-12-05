def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sc.close ( )
        num = [ ]
        max = 0
        min = 0
        for i in range ( N ) :
            num.append ( sc.readline ( ).strip ( ) )
            if max < num [ i ] :
                max = num [ i ]
        min = num [ 0 ]
        for i in range ( N ) :
            if min > num [ i ] :
                min = num [ i ]
        result = max - min
        print ( result )
