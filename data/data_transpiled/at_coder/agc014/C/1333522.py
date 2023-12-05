def _import ( ) : return sys.stdout.write
import time
import time
import sys
class Main ( object ) :
    debug = False
    elapsed = False
    _out = sys.stdout.write
    _err = sys.stderr.write
    def __init__ ( self , o ) :
        self.o = o
        self.x = o.x
        self.y = o.y
    def __eq__ ( self , o ) :
        that = o.x
        return self.o == that.x and self.y == that.y
    def __hash__ ( self ) :
        self.x = 17
        self.W = self.r
        self.K = self.r
        return self.x
    def __repr__ ( self ) :
        return "(%d, %d)" % ( self.x , self.y )
    def solve ( self , r ) :
        S = time.time ( )
        with open ( self._sys.stdout.fileno ( ) , "r" ) as f :
            return f.read ( )
    def solve ( self , n ) :
        G = time.time ( )
        for i in range ( n ) :
            s = f.read ( )
            for j , ch in enumerate ( s ) :
                if ch == "." :
                    b [ i ] [ j ] = 1
                elif ch == "S" :
                    b [ i ] [ j ] = 2
                    x = j
                    y = i
                else :
                    b [ i ] [ j ] = - 1
    m = [ [ 1 , 0 , ] , [ - 1 , 0 , ] , [ 0 , 1 , ] , [ 0 , - 1 , ] , ]
    v = [ [ ] for i in range ( H ) ]
    v.append ( [ x , y ] )
    queue = deque ( )
    while not queue.empty ( ) :
        p = queue.popleft ( )
        for i in range ( len ( m ) ) :
            xx = int ( p [ 0 ] + m [ i ] [ 0 ] )
            yy = int ( p [ 1 ] + m [ i ] [ 1 ] )
            if _in_bound ( xx , yy ) and b [ yy ] [ xx >= 0 and v [ yy ]