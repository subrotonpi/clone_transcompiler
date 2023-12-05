def import string
import sys
import string
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        if self.stream.isatty ( ) :
            N = int ( self.stream.readline ( ) )
            if N == 3 :
                print ( '3 5 22' )
            else :
                c6p3 = ( ( N - 1 ) // 8 ) * 2 + 2
                c6p2 = ( N - c6p3 - 1 ) // 3 + 1
                c6p6 = N - c6p3 - c6p2 - c6p2
                qs = [ i * 6 + 3 for i in range ( c6p3 ) ]
                for i in range ( c6p2 ) :
                    qs += [ i * 6 + 2 for i in range ( c6p2 ) ]
                    qs += [ i * 6 + 4 for i in range ( c6p6 ) ]
                joiner = string.join
                for v in qs :
                    joiner.append ( str ( v ) )
                print ( joiner )
