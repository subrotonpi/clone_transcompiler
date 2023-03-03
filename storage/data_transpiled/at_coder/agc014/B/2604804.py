def import import sys , StringIO , BUnplannedQueries
from BUnplannedQueries import BUnplannedQueries
from BUnplannedQueries import BUnplannedQueries
from BUnplannedQueries import BUnplannedQueries
from BUnplannedQueries import BUnplannedQueries
from BUnplannedQueries import BUnplannedQueries
class Main ( object ) :
    input_file = sys.stdin
    output_file = sys.stdout
    def __init__ ( self , input_file , output_file ) :
        self.input_file = input_file
        self.output_file = output_file
        self.output_file = output_file
        self.solver = BUnplannedQueries ( )
        self.solver.solve ( 1 , input_file , output_file )
        self.output_file.close ( )
    def solve ( self , test_number , infile , outfile ) :
        n , m = infile.read ( ) , infile.read ( )
        f = [ 0 ] * n
        for i in range ( m ) :
            f [ infile.read ( ) - 1 ] += 1
            f [ infile.read ( ) - 1 ] += 1
        for i in f :
            if i % 2 :
                self.output_file.write ( "NO" )
                return
        self.output_file.write ( "YES" )
