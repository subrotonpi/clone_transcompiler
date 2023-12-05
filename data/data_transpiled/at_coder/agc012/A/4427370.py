def _import ( ) :
    from sys import stdin
    from io import BytesIO
    class Main ( ) :
        def solve ( self ) :
            n = randint ( 0 , len ( self._bytes ) )
            ar = self._next_ints ( n * 3 )
            ar.sort ( )
            ans = 0
            for i in range ( n , n * 3 , 2 ) :
                ans += ar [ i ]
            self.write ( ans )
        def __next__ ( self ) :
            self._bytes = [ ]
            while self._bytes.read ( 1 ) in [ '-' , '0' , '0' ] :
                self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
        def __next__ ( self ) :
            self._bytes.append ( self._bytes.read ( 1 ) )
    return Main
