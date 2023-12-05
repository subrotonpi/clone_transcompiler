def _import ( ) : return sys.stdin.read ( )
import io
import stream
import stream
import stream
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
class Main ( object ) :
    def __init__ ( self , output_file ) :
        self.output_file = output_file
        self.reader = csv.reader ( self )
        self.writer = csv.writer ( self )
        self.writer.writerow ( [ '' , '\t' , '\t' ] )
    def print_line ( self , * args ) :
        self.writer.writerow ( [ '' , '\t' ] )
    def close ( self ) :
        self.writer.writerow ( [ '\t' , '\t' ] )
class TaskC ( object ) :
    def solve ( self , test_number , infile , outfile ) :
        n = infile.read ( )
        a = infile.read ( n )
        count_3200 = sum ( x for x in a if x >= 3200 )
        if count_3200 == n :
            outfile.writerow ( [ '1 ' + str ( n ) ] )
            return
        count = sum ( x for x in a if x < 3200 )
        outfile.writerow ( [ '' + str ( count + count_3200 ) ] )
class InputReader ( stream ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buf = ''
        self.fobj = None
        self.fobj = None
        self.fobj = None
        self.fobj = None
        self.fobj = None
        self.writer = None
        self.writer = None
        self.writer = None
        self.writer = None
        self.reader = None
        self.writer = None
        self.writer = None
        self.writer = None
        self.writer = None
        self.reader = None
        self.writer = None
        self.writer = None
        self.writer = None
        self.writer = None
