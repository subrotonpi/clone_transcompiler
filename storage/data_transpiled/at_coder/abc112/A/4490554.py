def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( stream ) :
        def __init__ ( self ) :
            stream.__init__ ( self )
            self.stream = stream
        def read ( self ) :
            N = len ( self.stream.read ( 1 ) )
            if N == 1 :
                print ( "Hello World" )
            elif N == 2 :
                print ( self.stream.read ( 1 ) , self.stream.read ( 1 ) )
    class FastScanner ( stream ) :
        def __init__ ( self ) :
            stream.read = self.stream.read
        def write ( self , data ) :
            self.stream.write ( data )
        def read ( self , ptr = 0 ) :
            if self.stream.read ( ptr ) < self.stream.read ( ) :
                return self.stream.read ( ptr )
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( ptr )
                except IOError :
                    pass
                if self.stream.read ( ptr ) <= self.stream.read ( 1 ) :
                    return self.stream.read ( ptr )
                else :
                    return self.stream.read ( ptr )
        def read ( self , ptr = 0 ) :
            if self.stream.read ( ptr ) == self.stream.read ( 1 ) :
                return self.stream.read ( ptr )
            else :
                return self.stream.read ( ptr )
        def startswith ( self ) :
            return 33 <= self.stream.read ( ) <= 126
    def startswith ( self ) :
        while True :
            self.stream.read ( 1 )
    def startswith ( self ) :
        return ''
    def decode ( self ) :
        return ''
    def startswith ( self ) :
        return ''
    def decode ( self ) :
        return ''
    def startswith ( self ) :
        return '-'
