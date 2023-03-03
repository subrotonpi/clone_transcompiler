def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        stream = sys.stdin
        stream = sys.stdout
        input = string
        stream = string
        out = string
        solver = TaskC ( )
        solver.solve ( 1 , input , stream )
        out.close ( )
class TaskC ( object ) :
    def solve ( self , test_number , stream , ** kwargs ) :
        sx , sy , tx , ty = [ int ( x ) for x in test_number ]
        dx = tx - sx
        dy = ty - sy
        lines = [ 'R' for x in range ( dx ) ]
        lines.append ( 'U' )
        lines.append ( 'L' )
        lines.append ( 'D' )
        lines.append ( 'D' )
        lines.append ( 'R' )
        lines.append ( 'U' )
        lines.append ( 'L' )
        lines.append ( 'U' )
        lines.append ( 'L' )
        lines.append ( 'D' )
        lines.append ( 'R' )
        return ''.join ( lines )
    def isSpaceChar ( c ) :
        return c in string.printable or c in string.printable or c in string.printable
