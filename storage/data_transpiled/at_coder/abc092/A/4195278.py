def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = int ( sys.stdin.read ( ) )
            self.B = int ( sys.stdin.read ( ) )
            self.C = int ( sys.stdin.read ( ) )
            self.D = int ( sys.stdin.read ( ) )
            self.train = min ( self.A , self.B )
            self.bus = min ( self.C , self.D )
            print ( self.train , self.bus )
