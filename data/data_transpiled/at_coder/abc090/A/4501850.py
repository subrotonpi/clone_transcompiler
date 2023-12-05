def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S1 = sys.stdin.read ( )
        self.S2 = sys.stdin.read ( )
        self.S3 = sys.stdin.read ( )
        print ( "%s%s%s" % ( self.S1 [ 0 ] , self.S2 [ 1 ] , self.S3 [ 2 ] ) )
