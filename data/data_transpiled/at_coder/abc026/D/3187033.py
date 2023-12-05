def import import sys , StringIO , os , sys
from numpy.testing import assert_almost_equal
from numpy.testing import assert_almost_equal
from scipy.sparse import csc_matrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
from scipy.sparse import spmatrix
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.stdin = file ( self.rfile )
        self.stdout = file ( self.wfile )
        self.solver = spmatrix
        self.solver.solve ( 1 , self.rfile , self.wfile )
        self.stdout.close ( )
    def solve ( self , test_number , self , stdin , stdout ) :
        a , b , c = stdin.read ( ) , stdin.read ( ) , stdin.read ( )
        calc = lambda t : a * t + b * np.sin ( c * t * np.pi )
        min , max = 0.0 , 128.0
        while max - min > 1e-12 :
            mid = ( min + max ) / 2.0
            if calc ( mid ) > 100 :
                max = mid
            else :
                min = mid
        return max
