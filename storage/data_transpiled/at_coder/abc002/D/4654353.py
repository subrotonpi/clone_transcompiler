def import _makens
from scipy.sparse import issparse
from scipy.sparse import issparse
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.sparse import csc_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
from scipy.sparse.linalg.matrix import eigs_matrix
from scipy.sparse.linalg import eigs_matrix
n , m = eigs_matrix ( 4 )
relation = { }
for i in range ( m ) :
    x , y = eigs_matrix ( i )
    x -= 1
    y -= 1
    eigs_matrix [ x , y ] = eigs_matrix ( y )
ans = 0
for i in range ( ( 2 , n ) ) :
    lst = [ ]
    for j in range ( n ) :
        if ( ( i >> j ) & 1 ) == 1 :
            lst.append ( j )
    flag = True
    for j in range ( len ( lst ) ) :
        for k in range ( len ( lst ) ) :
            x , y = lst [ j ]
            if x == y :
                continue
            if ( ( ( ( i >> x ) & 1 ) == 1 ) and ( ( ( i >> y ) & 1 ) == 1 ) and not eigs_matrix [ x , y ] ) :
                flag = False
    if flag :
        ans = max ( ans , len ( lst ) )
print ( ans )
