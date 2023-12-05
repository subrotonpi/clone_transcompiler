def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        seen = set ( )
        for i in range ( n ) :
            a = sc.readline ( ).strip ( )
            while a % 2 == 0 :
                a /= 2
            seen.add ( a )
        print ( len ( seen ) )
