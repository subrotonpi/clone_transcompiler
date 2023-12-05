def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.s = sys.stdin.read ( )
            self.formatted = ""
            if len ( self.s ) == 1 :
                formatted = self.s.upper ( )
            else :
                formatted = self.s [ 0 ].upper ( ) + self.s [ 1 : ].lower ( )
            print ( formatted )
    return Main
