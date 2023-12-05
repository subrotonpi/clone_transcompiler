def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        s = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        num = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        sum = 0
        max = - 1
        index = - 1
        for i in range ( N ) :
            sum += num [ i ]
            if max < num [ i ] :
                max = num [ i ]
                index = i
        if sum / 2 < max :
            print ( s [ index ] )
        else :
            print ( 'atcoder' )
