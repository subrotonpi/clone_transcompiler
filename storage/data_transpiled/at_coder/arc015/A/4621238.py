def _import ( ) : return sys.stdin.read ( )
import random
import math
class Main ( ) :
    def solve ( self , f , out ) :
        n = random.uniform ( 0 , 1 )
        out.write ( '%.7f' % ( 9.0 / 5.0 * n + 32.0 ) )
    def write ( self , * ar ) :
        print ( ''.join ( map ( chr , ar ) ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.stream = stream
        self.stream.read ( 1024 )
    def has_next_byte ( ) :
        if self.stream.read ( 1024 ) < self.stream.read ( 1024 ) :
            return True
        else :
            p = 0
            try :
                length = stream.read ( 1024 )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.stream.read ( 1024 ) == True :
            return stream.read ( 1024 )
        else :
            p = 0
            try :
                length = stream.read ( 1024 )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.stream.read ( 1024 ) == True :
            return stream.read ( 1024 )
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( self , stream ) :
        while self.stream.read ( 1024 ) == True :
            p += 1
        return True
    def write ( self , stream ) :
        if not self.stream.read ( 1024 ) == True :
            raise StopIteration
        lines = [ ]
        t = read ( )
        while self.stream.read ( 1024 ) == True :
            lines.append ( t )
            t = read ( )
        return lines
    def read ( self , stream ) :
        return self.stream.read ( 1024 )
return Main ( )
