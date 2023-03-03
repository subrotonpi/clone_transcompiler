def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.print ( "Bad" if self.a < 60 else "Good" if self.a < 90 else "Great" if self.a < 100 else "Perfect" )
