def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        sum = [ 0 ] * n
        for i in range ( n ) :
            a [ i ] = sc.readline ( ).strip ( )
        sc.close ( )
        a = sorted ( a )
        sum [ 0 ] = a [ 0 ]
        for i in range ( 1 , n ) :
            sum [ i ] = sum [ i - 1 ] + a [ i ]
        pos = - 1
        for i in range ( n - 1 ) :
            if sum [ i ] * 2 < a [ i + 1 ] :
                pos = i
        print ( n - ( pos + 1 ) )
