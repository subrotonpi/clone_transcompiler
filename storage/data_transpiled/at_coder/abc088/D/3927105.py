def _ import _ , SPACETOKEN sys.stdout , SPACETOKEN sys.stderr , SPACETOKEN sys.stderr ]
import Queue , time
class Main ( object ) :
    def __init__ ( self ) :
        self.q = Queue ( )
        self.count = [ [ ] for _ in range ( self.count [ 0 ] ) ]
        self.maze = [ [ ] for _ in range ( self.maze [ 0 ] ) ]
        self.count = [ [ ] for _ in range ( self.count [ 1 ] ) ]
        self.white = 0
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                self.count [ i ] [ j ] = 100000
        for i in range ( self.count [ 0 ] ) :
            line = sys.stdin.readline ( )
            for j in range ( self.count [ 0 ] ) :
                self.maze [ i ] [ j ] = line [ j ]
                if self.maze [ i ] [ j ] == '.' :
                    self.white += 1
        self.count [ 0 ] [ 0 ] = 1
        self.q = Queue ( )
        self.q.put ( ( 0 , 0 ) )
        while self.q.get ( ) :
            p = self.q.get ( )
            if p [ 0 ] == self.H - 1 and p [ 1 ] == self.W - 1 :
                break
            self.addPQ ( p )
        result = self.count [ self.H - 1 ] [ self.W - 1 ]
        if result < 100000 :
            print ( self.white - self.count [ self.H - 1 ] [ self.W - 1 ] )
        else :
            print ( - 1 )
    def addPQ ( self ) :
        x , y = int ( self.maze [ 0 ] [ 0 ] ) , int ( self.maze [ 0 ] [ 1 ] )
        if self.maze [ x ] [ y ] == '#' :
            return
        self.maze [ x ] [ y ] = '#'
        if x + 1 < self.H and self.maze [ x + 1 ] [ y ] == '.' :
            self.q.put