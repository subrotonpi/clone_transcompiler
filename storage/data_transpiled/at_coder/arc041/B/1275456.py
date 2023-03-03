def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        a = [ ]
        for s in sc.split ( ) :
            for j in range ( M ) :
                a.append ( [ int ( s [ j ] ) for s in s.split ( ) ] )
        ret = [ ]
        for i in range ( 1 , N - 1 ) :
            for j in range ( 1 , M - 1 ) :
                min = 10
                min = min ( a [ i ] [ j - 1 ] , min )
                min = min ( a [ i ] [ j + 1 ] , min )
                min = min ( a [ i + 1 ] [ j ] , min )
                min = min ( a [ i - 1 ] [ j ] , min )
                a [ i ] [ j - 1 ] -= min
                a [ i ] [ j + 1 ] -= min
                a [ i + 1 ] [ j ] -= min
                a [ i - 1 ] [ j ] -= min
                ret.append ( min )
        for i in range ( N ) :
            for j in range ( M ) :
                print ( ret [ i ] [ j ] , end = ' ' )
            print ( )
