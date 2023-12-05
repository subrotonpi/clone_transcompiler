def _import ( ) : return sys.stdin.read ( )
import time
from itertools import count
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = raw_input
        self.outfile = sys.stdout
    def run ( self ) :
        tn = count ( self.raw_input )
        for test in range ( 1 , tn + 1 ) :
            n = count ( self.raw_input )
            a = [ ]
            for s in self.input :
                a.append ( s.rfind ( '1' ) )
            r = 0
            for i in range ( n - 1 ) :
                j = i
                while a [ j ] > i :
                    j += 1
                r += j - i
                t = a [ j ]
                while j > i :
                    a [ j ] = a [ j - 1 ]
                    j -= 1
                a.append ( t )
            print ( "Case #%d: %d" % ( test , r ) )
