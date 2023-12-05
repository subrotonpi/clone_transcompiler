def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            self.mt = [ True ] * ( N + 1 )
            self.K = len ( sys.argv )
            for tmp in sys.argv [ 1 : ] :
                if self.mt [ tmp ] :
                    print ( "NO" )
                    sys.exit ( )
                else :
                    self.mt [ tmp ] = True
            print ( "YES" )
