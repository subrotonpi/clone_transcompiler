def import solve , sys
from os import sys
from io import BytesIO
import getopt
class Solution ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdin
        self.err = sys.stdout
        self.t = int ( getopt.getmaxyx ( ) [ 1 ] )
        for i in range ( 1 , t + 1 ) :
            sys.stderr.write ( 'Running test %d...' % i )
            sys.stdout.flush ( )
            print ( 'Case #%d: ' % i , end = ' ' )
            self.solve ( )
            sys.stderr.write ( 'done!\n' )
        sys.exit ( 0 )
    def solve ( f ) :
        f.readline ( )
        buf = f.read ( ).split ( )
        k = int ( buf [ 0 ] )
        ans = 0
        for i in range ( 0 , len ( buf ) - k ) :
            if buf [ i ] == '-' :
                for j in range ( k ) :
                    if buf [ i + j ] == '-' :
                        buf [ i + j ] = '+'
                    else :
                        buf [ i + j ] = '-'
                ans += 1
        for i in buf :
            if buf [ i ] != '+' :
                print ( 'IMPOSSIBLE' )
                return
        print ( ans )
