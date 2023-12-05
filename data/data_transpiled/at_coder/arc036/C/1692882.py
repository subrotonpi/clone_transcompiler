def _import ( ) : return sys.stdin.read ( )
import inspect
import inspect
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __iter__ ( self ) :
        super ( Main , self ).__iter__ ( )
    def next ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        lines = [ ]
        b = self.read_byte ( )
        while is_printable_char ( b ) :
            lines.append ( b )
            b = self.read_byte ( )
        return b
    def add ( a , b ) :
        ret = a + b
        if b == '-' :
            minus = True
            b = self.read_byte ( )
        if b < '9' or b < '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return minus , n
            else :
                raise ValueError ( )
            b = self.read_byte ( )
    def tr ( * objects ) :
        print ( [ x for x in objects ] )
