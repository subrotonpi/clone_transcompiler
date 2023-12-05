def _import ( ) : return _import ( )
import sys
import math
class Main ( ) :
    def solve ( self , f , out ) :
        n = ord ( f.read ( 1 ) )
        ans = n // 10 * 100
        n %= 10
        if 7 <= n <= 9 :
            ans += 100
        else :
            ans += - n
        out.write ( ans )
    def write ( self , * ar ) :
        print ( " ".join ( map ( str , ar ) ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
class Main ( ) :
    def __init__ ( self , f , out ) :
        self.f = f
        self.out = out
    def solve ( self , * args ) :
        self.out.write ( "\n".join ( map ( str , args ) ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def has_next_byte ( self ) :
        if self.p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( self.p )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self ) :
        if self.has_next_byte ( ) == True :
            return self.stream.read ( self.p )
        else :
            p += 1
    def is_printable ( self ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.has_next_byte ( ) and not is_printable ( self.stream.read ( self.p ) ) :
            p += 1
        return False
    def __iter__ ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        yield self.next ( )
