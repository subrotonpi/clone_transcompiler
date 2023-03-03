def _import ( ) : return _raw_input ( )
import os
import sys
import os
import sys
import struct
import shlex
import sys
import sys
import os
import sys
import subprocess
from io import StringIO
import StringIO
import sys
class SC ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.__next__ ( )
        S = sc.next ( )
        tmp = deque ( )
        for i in range ( N ) :
            if S [ i ] == '(' :
                tmp.append ( 0 )
            elif S [ i ] == ')' :
                if len ( tmp ) == 0 :
                    tmp.append ( 1 )
                else :
                    if len ( tmp ) == 0 :
                        tmp.append ( 1 )
                    else :
                        if len ( tmp ) == 0 :
                            tmp.popleft ( )
                        else :
                            tmp.append ( 1 )
    mae = ato = 0
    size = tmp.size
    for i in range ( size ) :
        get = tmp.get ( )
        if get == 0 :
            ato += 1
        elif get == 1 :
            mae += 1
    s = [ "(%s)" % S for S in range ( mae ) ]
    pl ( "".join ( s ) )
    def pl ( x ) :
        print ( x )
    def p ( x ) :
        print ( x , end = '' )
    class SC ( object ) :
        def __init__ ( self , file = None ) :
            self.file = file or ""
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens :
                try :
                    self.tokens = list ( self.tokens )
                except :
                    self.tokens = [ ]
            return self.tokens [ 0 ]
    return SC ( )
