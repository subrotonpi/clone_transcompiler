def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        map = [ ]
        sum = 0
        for i in range ( N ) :
            map.append ( sc.readline ( ).strip ( ) )
            sum += map [ i ]
        M = sc.readline ( ).strip ( )
        for i in range ( M ) :
            p = sc.readline ( ).strip ( )
            x = sc.readline ( ).strip ( )
            print ( sum - map [ p - 1 ] + x )
