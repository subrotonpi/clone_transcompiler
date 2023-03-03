def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        array = [ ]
        sum = 0
        max = 0
        for i in range ( n ) :
            array.append ( sc.readline ( ) )
            sum += array [ i ]
            if max < array [ i ] :
                max = array [ i ]
        sum = sum - max / 2
        print ( sum )
