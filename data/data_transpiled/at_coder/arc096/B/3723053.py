def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self , data ) :
        super ( Main , self ).__init__ ( data )
        self.data = data
    def read ( self ) :
        sc = FastScanner ( )
        self.N = sc.__next__ ( )
        C = sc.__next__ ( )
        x = [ ]
        v = [ ]
        for i in range ( 1 , N + 1 ) :
            x.append ( sc.__next__ ( ) )
            v.append ( sc.__next__ ( ) )
        self.next ( )
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        b = self.readByte ( )
        if b == '-' :
            minus = True
            b = self.readByte ( )
        elif b == '-' :
            raise StopIteration
        while b == '-' :
            n *= 10
            n += b - '0'
        elif b == '-' or not isPrintableChar ( b ) :
            return ( - n )
        else :
            raise StopIteration
        b = self.readByte ( )
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        b = self.readByte ( )
        if b == '-' :
            minus = True
            b = self.readByte ( )
        elif b == '-' :
            n += b - b
        elif b == '-' or not isPrintableChar ( b ) :
            return ( - n )
        else :
            raise StopIteration
        b = self.readByte ( )
        return b
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        return ( b )
    def write ( self , data ) :
        if not self.hasNext ( ) :
            raise StopIteration
    def read ( self ) :
        while self.hasNext ( ) and not isPrintableChar ( data [ self.ptr ] ) :
            ptr += 1
        return ( b )
