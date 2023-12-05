def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import readline
import readline.parse_file
import readline.parse_file
import tokenize
class Main ( readline.parse_file ) :
    def __init__ ( self ) :
        self.N = ni ( )
        self.Q = ni ( )
        self.X = [ ]
        self.R = [ ]
        self.H = [ ]
        self.A = [ ]
        self.B = [ ]
        self.v = [ ]
        for i in range ( N ) :
            for j in range ( self.H [ i ] ) :
                h1 = j
                r1 = float ( R [ i ] * h1 / self.H [ i ] )
                h2 = j + 1
                r2 = float ( R [ i ] * h2 / self.H [ i ] )
                v1 = math.pi * r1 ** 2 / h1 ** 3
                v2 = math.pi * r2 ** 2 / h2 ** 3
                v [ X [ i ] + self.H [ i ] - 1 - j ] += v2 - v1
        self.sum = [ ]
        for i in range ( 1 , 20000 ) :
            self.sum.append ( self.sum [ i - 1 ] + self.v [ i - 1 ] )
        for i in range ( self.Q ) :
            readline.write ( "%.2f" % self.sum [ i ] )
    ns = [ ]
    for i in range ( 0 , n ) :
        ns.append ( i )
    ni = int ( ns )
    nl = long ( ns )
    return sys.stdin.readline ( )
