def import _readline
import sys
class Main ( object ) :
    def solve ( self , f , out ) :
        out.write ( 1080 - ( sys.maxint * 60 ) - sys.maxint )
    def write ( self , * ar ) :
        print ( ''.join ( map ( ord , ar ) ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.read = stream
        self.length , p = 0 , 0
    def write ( self , stream ) :
        self.write ( stream )
    def has_next_byte ( ) :
        if self.p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.read ( self.p )
            except :
                pass
            if length <= 0 :
                return False
        return True
    def read ( self , stream ) :
        if self.p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.read ( self.p )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.p < self.length :
            return self.p
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.p < self.length :
            if not self.p :
                raise StopIteration
            yield self.p
    def read ( self , stream ) :
        if not self.p :
            raise StopIteration
        s = [ ]
        t = self.read ( )
        while self.p :
            s.append ( t )
            t = self.read ( )
        return s
    def readline ( self ) :
        return sys.stdin.readline ( )
