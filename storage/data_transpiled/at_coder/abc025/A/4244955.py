def _import ( ) :
    from sys import stdin as stream
    from binascii import hexlify
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.s = stream.read ( )
    S = ''
    N = len ( S )
    print ( S [ ( N - 1 ) // 5 ] )
    print ( S [ ( N + 4 ) % 5 ] )
