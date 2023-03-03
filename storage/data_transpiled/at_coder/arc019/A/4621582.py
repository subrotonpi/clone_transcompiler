def _import ( ) : return
import random
import sys
class Main ( object ) :
    def solve ( self , f , out ) :
        s = [ 'O' , 'D' , 'I' , 'Z' , 'S' , 'B' ]
        s , t = [ '0' , '0' , '1' , '2' , '5' , '8' ]
        ans = next ( f )
        for i in range ( 6 ) :
            ans = ans.replace ( s [ i ] , t [ i ] )
        out.write ( ans )
    def write ( * ar ) :
        print ( ' '.join ( ar ) )
    def main ( self , * args ) :
        self.main = Main ( )
        f = open ( '/dev/null' , 'w' )
        f.write ( '\n' )
        f.close ( )
        return f
    def read ( self , stream ) :
        self.stream = stream
        self.stream.read ( 1024 )
        self.stream.read ( 1024 )
        self.stream.read ( 1024 )
    def has_next_byte ( self ) :
        if self.stream.read ( 1024 ) < self.stream.read ( 1024 ) :
            return True
        else :
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
    def has_next_byte ( self ) :
        if self.stream.read ( 1024 ) == True :
            return self.stream.read ( 1024 )
        else :
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
            self.stream.read ( 1024 )
    def is_printable ( self ) :
        return 33 <= self.stream.read ( ) <= 126
    def skip ( self ) :
        while self.stream.read ( 1024 ) and not self.stream.read ( 1024 ) :
            self.stream.read ( 1024 )
    def write ( self , stream ) :
        self.stream.read ( 1024 )
