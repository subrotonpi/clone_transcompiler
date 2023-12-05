def import readline
import readline
import sys
import math
class Main ( object ) :
    def solve ( self , f , out ) :
        n = ord ( 'a' )
        sum = 0
        for i in range ( n ) :
            sum += ord ( 'a' ) * ord ( 'a' )
        out.write ( sum * 105 / 100 )
    def write ( self , * ar ) :
        print ( " ".join ( [ "%.4f" % ( i , ) for i in ar ] ) , end = '' )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.read = stream
        self.buffer = buffer
        self.length , p = 0 , 0
    def readline ( self ) :
        self.buffer = buffer
        self.length , self.p = 0 , 0
    def read ( self , stream ) :
        self.stream = stream
    def has_next_byte ( ) :
        if self.p < self.length :
            return True
        else :
            self.p = 0
            try :
                length = self.stream.read ( self.length )
            except :
                pass
            if self.length <= 0 :
                return False
        return True
    def read ( self , stream ) :
        if self.has_next_byte ( ) == True :
            return self.buffer [ self.p ]
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.has_next_byte ( ) and not is_printable ( self.buffer [ self.p ] ) :
            self.skip ( )
        return True
    def readline ( self ) :
        if not self.has_next_byte ( ) :
            raise StopIteration
        lines = [ ]
        t = self.read ( )
        while self.is_printable ( t ) :
            lines.append ( t )
            t = self.read ( )
        return ''.join ( lines )
    def readline ( self ) :
        return readline ( self )
