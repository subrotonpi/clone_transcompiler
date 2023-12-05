def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    from io import BytesIO
    from io import StringIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.stream = stream
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
    def read ( self ) :
        while True :
            if self.stream.read ( 1 ) <= '9' :
                self.stream.seek ( 0 )
                self.stream.write ( self.stream.read ( 10 ) )
            elif self.stream.read ( 1 ) == '-' or not is_printable_char ( self.stream.read ( 1 ) ) :
                return - self.stream.read ( 1 )
            else :
                raise ValueError ( )
            self.stream.write ( 'Yes' )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
    def write ( self , data ) :
        if self.stream.read ( 1 ) < '0' or self.stream.read ( 1 ) == '' :
            raise ValueError ( )
        self.stream.write ( data )
        self.stream.seek ( 0 )
        self.stream.write ( '' )
        self.stream.write ( data )
        self.stream.write ( '' )
        self.stream.write ( data )
        self.stream.write ( '\n' )
