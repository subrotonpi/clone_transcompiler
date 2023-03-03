def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        m = self.sc.getfloat ( ) * 0.001
        a = 0
        if 0.1 <= m <= 5 :
            a = m * 10
        elif 6 <= m <= 30 :
            a = m + 50
        elif 35 <= m <= 70 :
            a = ( m - 30 ) / 5 + 80
        elif 70 <= m <= 89 :
            a = 89
        print ( "%02.0f" % a )
        print ( )
        self.sc.close ( )
