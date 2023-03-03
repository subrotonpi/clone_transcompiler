def main ( ) :
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            l = sc.readline ( ).strip ( )
            x = sc.readline ( ).strip ( )
            y = sc.readline ( ).strip ( )
            s = sc.readline ( ).strip ( )
            d = sc.readline ( ).strip ( )
            time = 1e200
            if d >= s :
                time = min ( time , ( d - s ) / ( x + y ) )
            else :
                time = min ( time , ( d + l - s ) / ( x + y ) )
            if y > x :
                if s >= d :
                    time = min ( time , ( s - d ) / ( y - x ) )
                else :
                    time = min ( time , ( s + l - d ) / ( y - x ) )
            sys.stdout.write ( "%.40f\n" % time )
