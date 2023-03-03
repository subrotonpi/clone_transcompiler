def _import ( ) : return sys.stdin.read ( )
import io
import readline
import readline
import readline
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_file
import readline.parse_line
import tokenize
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = readline.stdin
        self.stdout = readline.stdout
        self.readline.close ( )
    def readline ( self ) :
        n = self.read_number ( )
        while self.is_eof ( ) :
            b = self.read_number ( )
            minus = ( b == '-' )
            if minus :
                b = self.read_number ( )
            b *= 10
            b = self.read_number ( )
        if not self.is_eof ( ) :
            raise ValueError ( )
        return minus , b
    def solve ( self , test_number , readline , self ) :
        n = self.read_number ( )
        sum = [ [ ] for _ in range ( 1 , n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                sum [ i ] [ j ] = self.read_number ( )
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                sum [ i ] [ j ] += sum [ i ] [ j - 1 ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                sum = max (