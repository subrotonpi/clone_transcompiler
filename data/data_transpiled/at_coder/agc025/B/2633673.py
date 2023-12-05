def _ _ main _ _ ( ) : return sys.stdin
import io
import sys
import io
import sys
import io
import io
import sys
import io
import io
import sys
class Main ( object ) :
    def __init__ ( self ) :
        io.open = sys.stdin
        io.open = sys.stdout
        self.stdin = io.open = io.open
        self.stdout = io.open
        self._inv = [ ]
        self._inv = [ 1 ]
        self._inv = [ 1 ]
        self._inv.append ( self._inv [ - 1 ] )
    def solve ( self , test_number , in_stream , out_stream ) :
        n = in_stream.read ( )
        a = in_stream.read ( )
        b = in_stream.read ( )
        k = in_stream.read ( )
        res = 0
        self._m = 998244353
        for counta in range ( 0 , n ) :
            left = k - counta * a
            if left % b != 0 or left < 0 :
                continue
            countb = left / b
            if countb > n :
                continue
            res += self._inv [ counta ] * self._inv [ int ( countb ) ] % self._m
        out_stream.write ( res % self._m )
class MyScan ( io.open ) :
    def __init__ ( self ) :
        io.open = sys.stdin
        self.inbuf = io.read ( 1024 )
        self.lenbuf = 0
        self.ptrbuf = 0
    def read ( self , in_stream ) :
        if not in_stream :
            raise InputError ( )
        if self.ptrbuf >= self.lenbuf :
            self.ptrbuf = 0
            try :
                self.lenbuf = read_byte ( in_stream )
            except EOFError :
                raise InputError ( )
            if self.lenbuf <= 0 :
                return - 1
        return in_stream.read ( )
    def read ( self , in_stream ) :
        num , b = 0 , 0
        self._inv = [ ]
        self._inv.append ( b )
        return b
