def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.raw_input = raw_input
    r = Main ( )
    g = Main ( )
    b = Main ( )
    num = r * 100 + g * 10 + b * 1
    print ( "YES" if ( num % 4 == 0 ) else "NO" )
