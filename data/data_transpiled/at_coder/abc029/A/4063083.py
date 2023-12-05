def _import ( ) :
    import sys
    import struct
    class Main ( object ) :
        def __init__ ( self ) :
            sc = FastScanner ( sys.stdin )
            print ( sc.next ( ) + 's' )
    class FastScanner ( Scanner ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( self.stream.tell ( ) )
                except IOError :
                    pass
                if self.stream.tell ( ) <= self.stream.tell ( ) :
                    return False
            return True
        def readByte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return self.stream.read ( )
            else :
                return - 1
    def isPrintableChar ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.stream.read ( ptr ) < self.stream.tell ( ) :
            self.stream.seek ( ptr )
            ptr += 1
        return True
    def readByte ( self ) :
        if self.stream.read ( ) < self.stream.tell ( ) :
            raise StopIteration
        s = [ ]
        b = self.stream.read ( )
        while self.stream.read ( b ) == '-' :
            s.append ( b )
            b = self.stream.read ( )
        if self.stream.read ( ) < self.stream.tell ( ) :
            raise StopIteration
        while True :
            if self.stream.read ( ) < self.stream.tell ( ) :
                s.append ( b )
            if self.stream.read ( ) == self.stream.tell ( ) :
                s.append ( b )
        return s
