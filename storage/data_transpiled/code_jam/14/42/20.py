def import import sys , getopt , iread , dread , lread
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from locale import getdefaultlocale
from os.path import join
class Main ( object ) :
    def __init__ ( self , problem ) :
        self.problem = problem
        self.filename = 'B'
        self.problem = '%s-large' % self.problem
    def solve ( self ) :
        N = iread ( )
        A = [ getdefaultlocale ( ) for i in range ( N ) ]
        ans = 0
        for i in range ( N ) :
            left , right = 0 , 0
            for j in range ( N ) :
                if A [ j ] > A [ i ] :
                    if j < i : left += 1
                    else : right += 1
            ans += min ( left , right )
        self.out.write ( '%s' % ans )
    def solve_gcj ( self ) :
        tests = getdefaultlocale ( )
        for test in range ( 1 , tests + 1 ) :
            self.out.write ( 'Case #%d: ' % test )
            self.solve ( )
            self.out.write ( '\n' )
    def run ( self ) :
        try :
            f = open ( self.filename + '.in' , 'r' )
            out = open ( self.filename + '.out' , 'w' )
            self.solve_gcj ( )
            out.flush ( )
        except :
            sys.stderr.write ( 'Failed to open %s\n' % self.filename )
            sys.exit ( 1 )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
