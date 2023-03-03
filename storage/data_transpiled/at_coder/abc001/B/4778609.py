def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        v = int ( self.sc.readline ( ) )
        m = float ( v ) / 1000
        vv = 00
        if 0 <= m <= 5 :
            vv = int ( m * 10 )
        elif 6 <= m <= 30 :
            vv = int ( m + 50 )
        elif 6 <= m <= 30 :
            vv = int ( m + 10 )
        elif 35 <= m <= 70 :
            vv = int ( ( m - 30 ) / 5 + 80 )
        else :
            vv = 89
        sys.stdout.write ( "%02d\n" % vv )
