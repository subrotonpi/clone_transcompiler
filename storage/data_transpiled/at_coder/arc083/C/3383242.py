def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.map = [ [ ] for i in range ( 0 , n + 1 ) ]
        self.other = [ ]
        self.X = [ ]
        self.dp = [ ]
    def dfs ( s ) :
        self.map = [ ]
        self.other.append ( s )
        self.X = [ ]
        for i in range ( 2 , n + 1 ) :
            p = _sys.stdin.read ( )
            self.map [ p ].append ( i )
        for i in range ( 1 , n + 1 ) :
            self.X.append ( _sys.stdin.read ( ) )
        self.dfs ( 1 )
        ans = "POSSIBLE" if self.other [ 1 ] < inf else "IMPOSSIBLE"
        print ( ans )
    def dfs ( s ) :
        self.map = [ ]
        if not self.map : return
        for i in self.map :
            self.dfs ( self.map [ i ] )
        self.dp = [ [ inf ] * self.X [ s ] + 1 for i in self.other ]
        self.dp [ 0 ] [ 0 ] = 0
        for i in range ( 1 , self.X [ s ] + 1 ) :
            curX = self.X [ self.map [ s ] [ i - 1 ] ]
            curF = other [ self.map [ s ] [ i - 1 ] ]
            for j in range ( 0 , self.X [ s ] + 1 ) :
                if j >= curX : self.dp [ i ] [ j ] = min ( self.dp [ i ] [ j ] , self.dp [ i - 1 ] [ j - curX ] + curF )
                if j >= curF : self.dp [ i ] [ j ] = min ( self.dp [ i ] [ j ] , self.dp [ i - 1 ] [ j - curF ] + curX )
        self.other = self.X [ s ]
Note :./ Main.py.uses.unsafe.operations.Recompile : unchecked.for details in _sys.operations :
INDENT