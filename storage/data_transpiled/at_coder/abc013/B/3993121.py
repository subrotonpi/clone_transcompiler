def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.buffer.__init__ ( self )
            self.stream = stream
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
        def write ( self , data ) :
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.buffer.__init__ ( self )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
        def seek ( self , offset ) :
            if self.stream.read ( offset ) < self.stream.tell ( ) :
                return self.stream.read ( offset )
            else :
                self.stream.seek ( offset )
                try :
                    self.stream.read ( offset )
                except :
                    pass
                if self.stream.read ( offset ) <= self.stream.tell ( ) :
                    return self.stream.read ( offset )
                else :
                    return self.stream.read ( offset )
        def read ( self , offset ) :
            if self.stream.read ( offset ) == self.stream.read ( offset ) :
                return self.stream.read ( offset )
            else :
                return self.stream.read ( offset )
        def write ( self , data ) :
            self.stream.write ( data )
            return data
    def read ( self , offset ) :
        if self.stream.read ( offset ) == self.stream.read ( offset ) :
            return self.stream.read ( offset )
        else :
            return self.stream.read ( offset )
