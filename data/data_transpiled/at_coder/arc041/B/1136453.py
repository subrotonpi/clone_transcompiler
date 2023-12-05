def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.n = sc.n
        self.m = sc.m
        self.a = [ ]
        self.ret = [ ]
        for s in sc.split ( ) :
            for j in range ( m ) :
                self.a.append ( [ int ( s [ j ] ) for s in s.split ( ) ] )
        for i in range ( 1 , n - 1 ) :
            for j in range ( 1 , m - 1 ) :
                min = 10
                min = min ( min , a [ i - 1 ] [ j ] )
                min = min ( min , a [ i ] [ j - 1 ] )
                min = min ( min , a [ i + 1 ] [ j ] )
                min = min ( min , a [ i ] [ j + 1 ] )
                a [ i - 1 ] [ j ] -= min
                a [ i ] [ j - 1 ] -= min
                a [ i + 1 ] [ j ] -= min
                a [ i ] [ j + 1 ] -= min
                ret.append ( min )
        for i in range ( n ) :
            for j in range ( m ) :
                print ( self.ret [ i ] [ j ] , end = '' )
            print ( '' , end = '' )
