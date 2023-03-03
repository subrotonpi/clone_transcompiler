def SPACETOKEN from SPACETOKEN pycodejam2013.round1b SPACETOKEN import SPACETOKEN read _ lines STRNEWLINE import SPACETOKEN sys STRNEWLINE import SPACETOKEN os STRNEWLINE import SPACETOKEN sys STRNEWLINE import SPACETOKEN sys STRNEWLINE STRNEWLINE def SPACETOKEN solve ( ) : STRNEWLINE SPACETOKEN sys.stdin SPACETOKEN = SPACETOKEN open ( 'B-small-attempt1.in' ) STRNEWLINE SPACETOKEN sys.stdout SPACETOKEN = SPACETOKEN open ( 'B-small-attempt1.out' , SPACETOKEN 'w' ) STRNEWLINE SPACETOKEN """
class FallingDiamonds ( ) :
    def readline ( self ) :
        return sys.stdin.readline ( )
    def write ( self , p ) :
        sys.stdout.write ( ' SPACETOKEN %.10f \n ' % p / p )
    def read_ints ( self ) :
        line = self.readline ( )
        s = line.split ( )
        ret = [ int ( i ) for i in s ]
        return ret
tt = None
ti = None
def read_int ( self ) :
    if not tt or ti == len ( self.tt ) :
        self.tt = read_int ( self )
        ti = None
    return tt [ ti ]
def solve_test ( test ) :
    print ( ' Case SPACETOKEN # % d : ' % test , file = sys.stderr )
    n = read_int ( self )
    level = 1
    q = 1
    while q <= n :
        q += 4 * level + 1
        level += 1
    level -= 1
    n -= level * ( 2 * level - 1 )
    x = read_int ( self )
    y = read_int ( self )
    if y < x + 2 * level - 1 and y < - x + 2 * level - 1 :
        print ( " SPACETOKEN 1.0" , file = sys.stderr )
        return
    if y > x + 2 * ( level + 1 ) - 1 or y > - x + 2 * ( level + 1 ) - 1 :
        print ( " SPACETOKEN 0.0" , file = sys.stderr )
        return
    f = [ 1.0 ]
    for i in range ( 1 , n + 1 ) :
        f.append ( f [ i - 1 ] * i )
    p = 0.0
    for i in range ( 0 , n ) :
        cnt = i + max ( 0 , n - i - 2 * level )
        p = float ( cnt )
    return