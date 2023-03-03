def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.T = sys.stdin.read ( )
            self.X = sys.stdin.read ( )
            self.ans = float ( self.T ) / float ( self.X )
            print ( self.ans )
    return Main
