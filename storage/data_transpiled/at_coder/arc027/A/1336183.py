def import time
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        h = self.sc.read ( )
        m = self.sc.read ( )
        time = 18 * 60
        print ( time - h * 60 - m )
