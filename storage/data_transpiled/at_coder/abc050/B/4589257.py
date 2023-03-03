def import import sys
import string
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.input = string
        n = int ( self.input [ 0 ] )
        problems = [ ]
        sum = 0
        for line in sys.stdin :
            problems.append ( int ( line ) )
            sum += problems [ - 1 ]
        out = [ ]
        m = int ( self.input [ 1 ] )
        for line in sys.stdin :
            line = line.rstrip ( )
            out.append ( ( sum - problems [ int ( line ) - 1 ] ) + int ( line ) )
        sys.stdout.write ( out )
