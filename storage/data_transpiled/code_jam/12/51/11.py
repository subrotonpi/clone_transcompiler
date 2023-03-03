def _ ( ) : return sys.stdin.readline ( ).strip ( )
import random
import sys
import sys
class A ( object ) :
    PROBLEM = "A-large"
class Level ( object ) :
    def __init__ ( self , p , l , idx ) :
        self.p = p
        self.l = l
        self.idx = idx
        self.time = float ( 'inf' ) if p == 0 else l * 100.0 / p
    def __lt__ ( self , that ) :
        return float ( self.time ) < that.time
    def solve ( self ) :
        n = randint ( 1 , 10000 )
        p = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
        l = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
        p = [ randint ( 1 , 10000 ) for _ in range ( n ) ]
        a = [ Level ( p [ i ] , l [ i ] , i ) for i in range ( n ) ]
        a.sort ( )
        s = [ " %d" % level.idx for level in a ]
        return ''.join ( s )
    def readline ( self ) :
        try :
            return sys.stdin.readline ( ).strip ( )
        except IOError :
            pass
    def write ( self , line ) :
        self.line = line.strip ( )
        return self.line
