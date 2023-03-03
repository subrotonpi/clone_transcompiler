def _import ( ) : return open ( 'input.txt' ).read ( )
import sys
import os
import sys
import os
import math
import os
import os
import string
import sys
import struct
import struct
import os
import string
import string
import struct
import struct
import math
import string
import struct
import struct
import os
import sys
import getopt
def _str_tok ( ) :
    try :
        f = open ( 'input.txt' )
    except :
        print ( 'LEYENDO DE ARCHIVO' )
        f = sys.stdin
    else :
        f = open ( 'output.txt' , 'w' )
def _nl ( ) :
    return int ( string.split ( ' ' , 1 ) [ 0 ] )
def _str_tok ( ) :
    try :
        ret = [ ]
        for i in range ( size ) :
            ret.append ( _nl ( ) )
        return ret
    except :
        print ( 'LEYENDO DE CONSOLA' )
        f = sys.stdin
out = open ( 'output.txt' , 'w' )
T = int ( _str_tok ( ) )
for i in range ( 1 , T + 1 ) :
    o = _solve ( )
    out.write ( 'Case #%d: %s\n' % ( i , o ) )
    out.write ( 'Case #%d: %s\n' % ( i , o ) )
out.close ( )
