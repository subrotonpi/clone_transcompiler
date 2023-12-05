def _ ( ) : return
import sys
import os
import os
import sys
import os
import sys
import os
import sys
import os
import sys
FILE = True
def main ( ) :
    global seen
    if not FILE :
        print ( "DON'T FORGET TO REDIRECT TO FILE!" )
    f = open ( 'GCJ.in' , 'r' )
    if FILE :
        f = open ( 'GCJ.in' , 'r' )
        out = open ( 'GCJ.out' , 'w' )
    for i in range ( 2 , 10 ) :
        used [ i ] [ 1 ] = True
        memo [ i ] [ 1 ] = True
    T = int ( f.readline ( ) )
    for t in range ( 1 , T + 1 ) :
        toks = f.readline ( ).split ( )
        B = len ( toks )
        bases = [ int ( t ) for t in toks ]
        ret = - 1
        for i in range ( 2 ) :
            ok = True
            for b in bases :
                ok &= happy ( b , i )
            if ok :
                ret = i
                break
        out.write ( "Case #%d: %d\n" % ( t , ret ) )
    f.close ( )
    if not FILE :
        print ( "DON'T FORGET TO REDIRECT TO FILE!" )
    stack = [ ]
    len = 20000001
    memo = [ ]
    used = [ ]
    seen = [ ]
    def happy ( base , num ) :
        if base == 2 or base == 4 :
            return True
        if used [ base ] [ num ] :
            return memo [ base ] [ num ]
        x = num
        stack.append ( x )
        seen.append ( x )
        return memo [ base ] [ num ]
    return
