def test_main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 1
        def __next__ ( self ) :
            return ( ( ( self.n - 1 ) // 111 ) + 1 ) * 111
    print ( Main ( ) )
