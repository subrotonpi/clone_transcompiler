def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        seen = set ( )
        count = 0
        for i in range ( n ) :
            a = sc.readline ( ).strip ( )
            if a in seen :
                count += 1
            else :
                seen.add ( a )
        print ( count )
