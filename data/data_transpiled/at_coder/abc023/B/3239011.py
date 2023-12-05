def _import ( ) : return _import ( )
from io import BytesIO
from io import BytesIO
from io import BytesIO
from io import BytesIO
from io import BytesIO
class Main ( ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def read ( self ) :
        try :
            with BytesIO ( BytesIO ( ) ) as f :
                self.appendbytes ( f.read ( ) )
        except EOFError :
            raise StopIteration
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        if self.peek ( ) == '-' :
            minus = True
        if self.peek ( ) == '0' or self.peek ( ) == '0' :
            raise ValueError
        while True :
            if self.peek ( ) == '0' and self.peek ( ) == '' :
                n *= 10
                n += self.peek ( ) - '0'
            elif self.peek ( ) == '' or not self.peek ( ) :
                raise ValueError
        b = self.read ( )
    def read ( self ) :
        nl = self.peek ( )
        if nl < int ( nl ) or self.peek ( ) == '' :
            raise StopIteration
        while True :
            if self.peek ( ) == '' :
                n *= 10
            elif self.peek ( ) == '' :
                n += 1
            elif self.peek ( ) == '' :
                n += 1
            elif self.peek ( ) == '' :
                n += 1
            elif self.peek ( ) == '' :
                n += 1
            elif self.peek ( ) == '' :
                n += 1
            elif self.peek ( ) == '' :
                n += 1
            else :
                raise StopIteration
    def write ( self , s ) :
        if s is None :
            return None
        s = [ ]
        s.append ( u'' )
        s.append ( u'' )
        s.append ( u'' )
    def write ( self , s ) :
        if s is None :
            s.append ( u'' )
