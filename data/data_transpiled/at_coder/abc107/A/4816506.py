def main ( arg ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            self.arg = arg
    n = Main ( )
    b = Main ( )
    sys.exit ( n - b + 1 )
