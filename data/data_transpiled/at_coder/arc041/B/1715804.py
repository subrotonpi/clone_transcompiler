def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        b = [ ]
        for str in sc.readline ( ).strip ( ).split ( ' ' ) :
            for i in range ( M ) :
                b.append ( [ int ( str [ i ] ) for i in range ( N ) ] )
        ret = [ ]
        for i in range ( 1 , N - 1 ) :
            for j in range ( 1 , M - 1 ) :
                min = 10
                min = min ( b [ i ] [ j - 1 ] , min )
                min = min ( b [ i - 1 ] [ j ] , min )
                min = min ( b [ i + 1 ] [ j ] , min )
                min = min ( b [ i ] [ j + 1 ] , min )
                b [ i ] [ j - 1 ] -= min
                b [ i - 1 ] [ j ] -= min
                b [ i + 1 ] [ j ] -= min
                b [ i ] [ j + 1 ] -= min
                ret.append ( min )
        for i in range ( N ) :
            for j in range ( M ) :
                print ( ret [ i ] [ j ] , end = ' ' )
            print ( )
