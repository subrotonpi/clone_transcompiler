def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        m = self.sc.readline ( )
        if m < 100 :
            vv = 0
        elif m <= 5000 :
            vv = m / 100
        elif m <= 30000 :
            vv = m / 1000 + 50
        elif m <= 70000 :
            vv = m / 5000 + 74
        else :
            vv = 89
        s = '%02d' % vv
        print ( s )
