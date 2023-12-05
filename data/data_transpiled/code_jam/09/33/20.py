def import _main
import os
import sys
import os
import sys
import sys
import os
import sys
import subprocess
import subprocess
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import os
import sys
import tempfile
import tempfile
import os
import tempfile
import tempfile
import os
import sys
import subprocess
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import os
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import tempfile
import nline
def nline ( ) :
    try :
        return os.popen ( fname + '.in' , 'r' ).read ( )
    except :
        return None
    ns = tempfile.getroot ( )
    try :
        while not os.path.exists ( ns ) or not os.path.exists ( ns ) :
            ns = os.popen ( fname + '.in' , 'r' ).read ( )
        return ns
    except :
        return None
    ni = int ( ns )
    nl = long ( ns )
    nd = float ( ns )
    def dp ( i , j ) :
        if i > j :
            return 0
        if dp ( i , j ) != - 1 :
            return dp ( i , j )
        ans = sys.maxint
        left = i > 0 and qc [ i - 1 ] + 1 or 0
        right = j < q - 1 and qc [ j + 1 ] - 1 or n - 1
        sc = right - left
        for l in range ( i , j + 1 ) :
            ans = min ( ans , dp ( i , l - 1 ) + dp ( l + 1 , j ) + sc )
        return dp ( i , j )
    def run ( ) :
        T = tempfile.gettempdir ( )
        for t_num in range ( 1 , T + 1 ) :
            n = ni ( )
            q = ni ( )
            dp = [ i - 1 ] + dp ( l + 1 , j )
            qc = [ i - 1 ] + qc [ j - 1 ]
            [ ans ] = dp ( 0 , q - 1 )
        return run