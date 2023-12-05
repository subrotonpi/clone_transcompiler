def _import ( ) : return sys.stdin.read ( 1024 )
import io
import array
import string
import string
import io
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._import ( )
    def read ( self ) :
        sc = readline
        self._import ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        data = sc.__next__ ( )
        col = [ ]
        for i in range ( N ) :
            col.append ( data [ i ] )
        if not self._import ( ) :
            raise StopIteration
        n = False
        b = self._byte ( )
        data = b
        while b < '9' :
            n += 1
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if n else n
        else :
            raise ValueError
        b = self._byte ( )
    def tr ( self , * args ) :
        print ( "".join ( args ) )
    def read ( self ) :
        if not self._import ( ) :
            raise StopIteration
        s = [ ]
        while is_printable_char ( s ) :
            s.append ( b )
        return s
    def write ( self , * args ) :
        s.append ( b )
    def read ( self ) :
        if not self._import ( ) :
            raise StopIteration
        n = False
        b = self._byte ( )
        while b in s :
            n += 1
        if b < '0' or b <= '9' :
            n *= 10
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if n else n
        else :
            raise StopIteration
    def read ( self ) :
        return 0
    def write ( self , * args ) :
        print ( "".join ( args ) )
    def write ( self , * args ) :
        print ( "".join ( write ( self , * args ) ) )
