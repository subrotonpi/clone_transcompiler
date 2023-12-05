def _import ( ) : return sys.stdin
import io
import io
import sys
import io
import io
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
import codecs
class Main :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.output_file = io.open ( self.stream )
        self.reader = codecs.getreader ( 'utf-8' )
        self.writer = codecs.getwriter ( 'utf-8' )
    def write ( self , array ) :
        for i in range ( self.count ) :
            self.writer.write ( ' ' )
        self.writer.write ( self.array [ i ] )
    def close ( self ) :
        self.writer.close ( )
    def print_line ( self , i ) :
        self.writer.write ( i )
    def write ( self , array ) :
        if self.filter :
            return self.filter ( self.filter )
        return self.writer.write ( self.array [ i ] )
    def print_line ( self , array ) :
        self.writer.write ( '\n' )
    def print_line ( self , i ) :
        self.writer.write ( i )
    def print_line ( self , array ) :
        self.writer.write ( i )
    def print_line ( self , i ) :
        self.writer.write ( i )
    def print_line ( self , test_number ) :
        k = len ( self.reader )
        n = min ( k , 500 )
        temp = [ ]
        for i in range ( n - 1 , - 1 , - 1 ) :
            if i + 1 < k :
                for j in range ( 0 , n , 2 ) :
                    temp.append ( [ i , j ] )
                k -= 1
                for j in range ( 1 , n , 2 ) :
                    temp.append ( [ i , j ] )
                    k -= 1
            else :
                for j in range ( n ) :
                    temp [ i ] = k
                k -= 1
        answer = [