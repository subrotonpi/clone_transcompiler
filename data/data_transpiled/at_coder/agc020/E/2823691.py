def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import re
import sys
import os.path
import sys
import os.environ [ 'PATH' ]
import os.environ [ 'PATH' ]
import os.environ [ 'PATH' ]
import os.environ [ 'PATH' ]
import sys
import os.environ [ 'PATH' ]
import os.environ [ 'PATH' ]
import sys
import os.environ [ 'PATH' ]
import os.environ [ 'PATH' ]
import sys
mod = 998244353
dp = { }
def solve ( s ) :
    if not s : return 1
    if len ( s ) == 1 :
        return s [ 0 ] == '1' and 2 or 1
    if s in dp :
        return dp [ s ]
    ret = ( s [ 0 ] == '1' and 2 or 1 ) * ( solve ( s [ 1 : ] ) )
    ret %= mod
    for i in range ( len ( s ) ) :
        lst = i + 1
        lst = i + 1
        cur = [ s [ 0 : lst ] ]
        while lst + lst - 1 < len ( s ) :
            for k , p in zip ( lst , range ( 0 , lst + len ( cur ) - 1 ) ) :
                if s [ k ] == '0' :
                    cur.insert ( p , '0' )
            lst += len ( cur )
            ret += ( 1 * solve ( cur ) * solve ( s [ lst : ] ) ) % mod
            ret %= mod
    dp [ s ] = ret
    return ret
