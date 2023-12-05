def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
            self.D = sys.stdin.read ( )
            self.start = max ( self.A , self.C )
            self.end = min ( self.B , self.D )
            reult = self.end - self.start
            print ( reult < 0 )
