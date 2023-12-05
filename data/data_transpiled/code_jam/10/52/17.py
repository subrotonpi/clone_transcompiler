def import _readline
import readline
import sys
import random
import sys
import random
import time
class b :
    INF = float ( 'inf' )
    def __init__ ( self ) :
        self.l = randint ( 0 , len ( self.l ) )
        self.n = randint ( 0 , len ( self.l ) )
        self.b = [ randint ( 0 , len ( self.n ) ) for i in range ( self.n ) ]
        self.ma = 100000
        self.best = [ self.best ]
        self.best.append ( INF )
        for ind in range ( self.n ) :
            for i in range ( self.ma - self.b [ ind ] ) :
                if self.best [ i ] != INF :
                    self.best [ i + self.b [ ind ] ] = min ( self.best [ i + self.b [ ind ] ] , self.best [ i ] + 1 )
    ans = INF
    for i in range ( self.n ) :
        cur = l // self.b [ i ]
        tmp = int ( l % self.b [ i ] )
        while tmp < self.ma and tmp <= self.l :
            if self.best [ tmp ] != INF :
                ans = min ( ans , self.best [ tmp ] + cur )
                del self.best [ tmp ]
            tmp += self.b [ i ]
    if ans == INF :
        sys.stdout.write ( 'IMPOSSIBLE\n' )
    else :
        sys.stdout.write ( ans )
    def run ( self ) :
        try :
            tc = randint ( 0 , 1 )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( it )
                sys.stdout.write ( 'Case #%d: ' % it )
                self.solve ( )
        except :
            NOO ( self )
        finally :
            sys.stdout.close ( )
    if sys.platform == 'win32' :
        import msvcrt
        msvcrt.putch ( sys.stdout.fileno ( ) , msvcrt.putch ( sys.stdout.fileno ( ) ) )
