def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.C1 = sys.stdin.read ( )
            self.C2 = sys.stdin.read ( )
            self.C3 = sys.stdin.read ( )
            print ( "%s%s%s" % ( self.C1 [ 0 ] , self.C2 [ 1 ] , self.C3 [ 2 ] ) )
