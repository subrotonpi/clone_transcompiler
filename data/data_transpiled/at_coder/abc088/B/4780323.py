def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        a.sort ( )
        for i in range ( N - 1 , - 2 ) :
            if i >= 1 :
                result += a [ i ] - a [ i - 1 ]
            else :
                result = result + a [ i ]
        print ( result )
        sc.close ( )
