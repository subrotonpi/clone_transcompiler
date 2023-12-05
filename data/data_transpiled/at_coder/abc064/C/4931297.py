def _import ( ) : return sys.stdin.read ( )
import io
import StringIO
import io
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import csv
class Main :
    def __init__ ( self ) :
        self.output_file = csv
        self.writer = csv
    def write ( self , * args ) :
        for arg in args :
            if arg != '' :
                self.writer.write ( ' ' )
            self.writer.write ( self.writer.write ( arg ) )
    def print_line ( self , * args ) :
        self.writer.write ( self.writer.write ( '\n' ) )
    def print_line ( self , * args ) :
        self.writer.write ( self.writer.write ( '\n' ) )
    def print_line ( self , * args ) :
        self.writer.write ( self.writer.write ( ' ' ) )
    def solve ( self , test_number , infile , outfile ) :
        n = infile.tell ( )
        a = infile.read ( n )
        count_3200 = 0
        for i in range ( n ) :
            if a [ i ] >= 3200 :
                a [ i ] = 3200
                count_3200 += 1
        if count_3200 == n :
            outfile.write ( '1 %d' % n )
            return
        count = [ 0 ] * 9
        for i in range ( n ) :
            count [ a [ i ] // 400 ] += 1
        c = 0
        for i in range ( 8 ) :
            if count [ i ] > 0 :
                c += 1
            outfile.write ( '%d %d' % ( c , count_3200 ) )
    class Reader ( io.StringIO ) :
        def __init__ ( self ) :
            self.stream = self
        def __init__ ( self ) :
            self.