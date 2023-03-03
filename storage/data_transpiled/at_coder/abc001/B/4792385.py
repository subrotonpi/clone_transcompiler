def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        m = self.sc.readline ( )
        vv = 0
        if m < 100 :
            vv = 0
        elif 100 <= m <= 5000 :
            vv = m / 100
        elif 6000 <= m <= 30000 :
            vv = m / 1000 + 50
        elif 35000 <= m <= 70000 :
            vv = ( m / 1000 - 30 ) / 5 + 80
        elif 70000 < m :
            vv = 89
        print ( '%02d' % vv )
