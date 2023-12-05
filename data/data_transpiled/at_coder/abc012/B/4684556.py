def import time
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.readline ( ).strip ( )
    def run ( self ) :
        self.N = self.N
        h = self.N / 60 / 60
        m = self.N / 60 - h * 60
        s = self.N % 60
        print ( "%02d:%02d:%02d" % ( h , m , s ) )
        print ( )
