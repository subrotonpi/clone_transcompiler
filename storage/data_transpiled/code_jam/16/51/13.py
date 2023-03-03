def _2016_round3qA ( args ) :
    from io import BytesIO
    import sys
    from io import _2016_round3qA
    class _2016_round3qA ( object ) :
        def __init__ ( self , stream , * args ) :
            self.stream = stream
            self.stream = stream
            self.online = True
            self.file_name = 'A-large'
            if self.online :
                stream = open ( open ( self.file_name + '.in' , 'rb' ) )
            else :
                stream = open ( self.file_name + '.out.txt' , 'wb' )
        def read_int ( self ) :
            a = [ randint ( 0 , 255 ) for i in range ( self.n ) ]
            return a
        def write ( self , s ) :
            if self.filter : return self.filter ( s )
            return s
        def interface ( self , ch ) :
            if self.filter : return self.filter ( ch )
            return ch
    class _2016_round3qA ( object ) :
        def __init__ ( self , stream , * args ) :
            stream = BytesIO ( )
            self.stream = stream
            self.buf = BytesIO ( )
            self.curChar , self.snumchars = self.stream.read ( self.size )
            self.filter = self.filter ( self.isSpaceChar )
        def read ( self ) :
            if self.snumchars == - 1 : raise InputError ( )
            if self.curChar >= self.snumchars :
                self.curChar = 0
                try : self.snumchars = stream.read ( self.size )
                except AttributeError : raise InputError ( )
                if self.snumchars <= 0 : return - 1
            return self.buf [ self.curChar ]
    return _2016_round3qA
