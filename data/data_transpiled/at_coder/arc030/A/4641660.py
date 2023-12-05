def import readline
import sys
class Main ( object ) :
    def solve ( self , f ) :
        n , k = readline ( ).decode ( 'ascii' )
        print ( 'YES' if n / 2 >= k else 'NO' )
    def write ( self , * ar ) :
        print ( ''.join ( [ str ( i ) for i in ar ] ) , end = '' )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.read = stream
        self.length , p = 0 , 0
    def write ( self , stream ) :
        self.read = stream
    def has_next_byte ( ) :
        if p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.read ( self.length )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.has_next_byte ( ) == True :
            return self.buffer [ p ]
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.has_next_byte ( ) and not is_printable ( self.buffer [ p ] ) :
            p += 1
    def __iter__ ( self ) :
        skip ( self )
        return self.stream.readline ( )
    def readline ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        ar = [ ]
        t = self.read ( )
        while self.is_printable ( t ) :
            ar.append ( t )
            t = self.read ( )
        return ar
    def readline ( self ) :
        return self.stream.readline ( )
return Main ( )
