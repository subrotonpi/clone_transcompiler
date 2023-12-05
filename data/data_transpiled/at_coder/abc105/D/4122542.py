def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        d = { 0 : 1 }
        sum = 0
        for i in range ( n ) :
            sum += sc.readline ( ).strip ( )
            sum %= m
            x = d.get ( sum )
            if x is None :
                x = 0
            d [ sum ] = x + 1
        count = 0
        for x in d.values ( ) :
            count += long ( x ) * long ( x - 1 ) / long ( 2 )
        print ( count )
