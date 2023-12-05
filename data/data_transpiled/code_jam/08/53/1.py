def _import ( ) : return _import ( )
import math
import collections
import math
import math
import math
import math
import collections
import math
import math
import re
class C :
    def __init__ ( self ) :
        self._import match
        match = 0
        for v in self.vs :
            if v.pair is None and self._match :
                self._match += 1
        if self._match :
            self._used = True
            for u in self.es :
                w = u.pair
                if not w or self._used < self._match :
                    self._pair = u
            return False
    class C :
        es = [ ]
        def __init__ ( self ) :
            self._es.append ( self )
            self._pair = self._pair
        def connect ( self , * os ) :
            print ( deeprepr ( os ) , file = sys.stderr )
    def debug ( * os ) :
        print ( "Case #%d: " % o , file = sys.stderr )
        n , m = len ( self.es ) , len ( self.es )
        cs = [ ]
        for i in range ( n ) :
            cs.append ( self.es [ i ].decode ( 'utf-8' ) )
        num = 0
        vs = [ ]
        for i in range ( n ) :
            for j in range ( m ) :
                vs.append ( c.decode ( 'utf-8' ) )
                if cs [ i ] [ j ] == '.' :
                    num += 1
        for i in range ( n ) :
            for j in range ( m ) :
                if cs [ i ] [ j ] == '.' :
                    for k in range ( 4 ) :
                        ii , jj = i + di [ k ] , j + dj [ k ]
                        if 0 <= ii < n and 0 <= jj < m and cs [ ii ] [ jj ] == '.' :
                            vs [ i * m + j ].connect ( vs [ ii * m + jj ] )
        print ( num - hopcroftKarp ( vs ) )
    hopcroftKar@@