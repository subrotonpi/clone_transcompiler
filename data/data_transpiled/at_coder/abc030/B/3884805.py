def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        if n >= 12 :
            n = n - 12
        arg_n = float ( n ) * 30 + m * 0.5
        arg_m = float ( m ) * 6
        arg = math.fabs ( arg_n - arg_m )
        if arg > 180.0 :
            arg = 360.0 - arg
        print ( arg )
