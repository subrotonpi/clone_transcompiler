def import import sys
import os
import sys
import os
import sys
import sys
class B ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.outfile = sys.stdout
        self.T = int ( sys.stdin.readline ( ) )
        for t in range ( 1 , T + 1 ) :
            N = int ( sys.stdin.readline ( ) )
            freq = [ 0 ] * 2501
            for i in range ( 2 * N - 1 ) :
                line = sys.stdin.readline ( ).split ( )
                for j in range ( N ) :
                    freq [ int ( line [ j ] ) ] += 1
            self.outfile.write ( "Case #%d: " % t )
            for i in range ( 1 , 2500 + 1 ) :
                if freq [ i ] % 2 == 1 :
                    self.outfile.write ( "%d " % i )
            self.outfile.write ( "\n" )
    sys.stdin.close ( )
    sys.stdout = sys.stdout
