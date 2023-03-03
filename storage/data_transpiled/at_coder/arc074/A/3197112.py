def import import sys , StringIO , StringIO , cChocolateBar
from scipy.sparse import cChocolateBar
from scipy.sparse import cChocolateBar
from scipy.sparse import csr_matrix
from scipy.sparse import cChocolateBar
from scipy.sparse import cChocolateBar
from scipy.sparse.linalg import solve
from scipy.sparse.csr import csr_matrix
from scipy.sparse.linalg import inv
from scipy.sparse.linalg import inv
from scipy.sparse.linalg import inv
from scipy.sparse.linalg import inv
from scipy.sparse.linalg import inv
class cChocolateBar ( cChocolateBar ) :
    def solve ( self , test_number , stdin , stdout ) :
        h , w = stdin.shape
        if h * w % 3 == 0 :
            stdout.write ( 0 )
            return
        ans = min ( h , w )
        for x in range ( 0 , w ) :
            s1 = ( w - x ) * h
            s2 = x * ( h / 2 )
            s3 = x * ( ( h + 1 ) / 2 )
            ans = min ( ans , max ( s1 , s3 ) - min ( s1 , s2 ) )
        for y in range ( 0 , h ) :
            s1 = w * ( h - y )
            s2 = ( w / 2 ) * y
            s3 = ( ( w + 1 ) / 2 ) * y
            ans = min ( ans , max ( s1 , s3 ) - min ( s1 , s2 ) )
        return ans
