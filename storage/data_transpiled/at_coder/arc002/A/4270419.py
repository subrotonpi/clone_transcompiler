def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = stream.read
            N = sc.randint ( 0 , 400 )
            if N % 400 == 0 ^ N % 100 == 0 ^ N % 4 == 0 :
                print ( "YES" )
            else :
                print ( "NO" )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
            self.stream = stream
        def read ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return self.stream.read ( )
            else :
                self.stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.stream.read ( self.stream.read ( self.stream.stream.read ( self.stream.stream.count ( ) ) ) ) ) ) ) ) ) ) ) ) ) )
                except :
                    pass
    return FastScanner ( )
