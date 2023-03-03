def _import ( ) :
    from sys import stdin , stdout
    from os import urandom
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = stdin
            self.out = BytesIO ( )
            S = self.sc.getvalue ( )
            self.out.write ( "ABC" + S )
            self.out.flush ( )
