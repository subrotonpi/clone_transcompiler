def __main ( __ ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , s ) :
            self.solve ( s )
        def _solve ( self ) :
            count = 0
            for i in range ( 1 , len ( self.s ) ) :
                if self.s [ i ] != self.s [ i - 1 ] :
                    count += 1
            print ( count )
    return Main
