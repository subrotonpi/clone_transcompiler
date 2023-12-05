def _ _ main _ _ ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import getpass
import time
import time
import time
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.stdin = open ( self.rfile , 'r' )
        self.stdin = readline
        self.stdout = open ( self.wfile , 'w' )
        self.stdin.close ( )
        self.stdin = readline
        self.stdout = readline
        self.stdin.close ( )
        self.stdin = open ( self.wfile , 'r' )
        self.stdin.close ( )
        self.stdin = readline
        self.stdin.close ( )
        self.stdin = readline
        self.stdout = open ( self.wfile , 'w' )
        self.stdin.close ( )
    INF = 1 << 30
    LINF = 1 << 55
    MOD = 1000000007
    mh4 = [ 0 , - 1 , 1 , 0 ]
    mw4 = [ - 1 , 0 , 0 , 1 ]
    mh8 = [ - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 ]
    mw8 = [ - 1 , 0 , 1 , - 1 , 1 , - 1 , 0 , 1 ]
    class TaskX ( object ) :
        def __init__ ( self , test_number , self , stdin , stdout ) :
            self.p = stdin.read ( self.test_number )
            left = right = float ( 'inf' ) / 10
            for i in range ( 100000 ) :
                c1 = ( left * 2L + right ) / 3
                c2 = ( left + right * 2L ) / 3
                if self.func ( c1 ) < self.func ( c2 ) :
                    right = c2
                else :
                    left = c1
            self.stdout.write ( func ( left ) )
        def func ( x ) :
            return x + p * pow ( 2 , - x / 1.5 )