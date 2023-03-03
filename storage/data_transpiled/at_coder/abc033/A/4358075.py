def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 0
        def __repr__ ( self ) :
            return "SAME" if ( self.a % 1111 == 0 ) else "DIFFERENT"
    return Main ( )
