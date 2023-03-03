def import _DFS
class Main ( object ) :
    def __init__ ( self , args ) :
        sc = sys.stdin
        N = sc.readline ( ).split ( ) [ 0 ]
        a = [ ]
        b = [ ]
        c = [ ]
        for i in range ( N ) :
            d = { }
            self.append ( d )
        for i in range ( N - 1 ) :
            a.append ( sc.readline ( ).split ( ) [ 0 ] )
            b.append ( sc.readline ( ).split ( ) [ 1 ] )
            c.append ( long ( sc.readline ( ).split ( ) [ 1 ] ) )
            self.a [ b [ i ] ] = c [ i ]
            self.b [ b [ i ] ] = c [ i ]
        Q = sc.readline ( ).split ( ) [ 0 ]
        K = sc.readline ( ).split ( ) [ 1 ]
        x = [ ]
        y = [ ]
        for i in range ( Q ) :
            x.append ( sc.readline ( ).split ( ) [ 0 ] )
            y.append ( sc.readline ( ).split ( ) [ 1 ] )
        DFS ( self , K )
        for i in range ( Q ) :
            print ( self.maze_cnt [ x [ i ] ] , self.maze_cnt [ y [ i ] ] )
    def DFS ( self , now ) :
        stack = deque ( )
        stack.append ( now )
        self.maze_cnt = { }
        flag = [ False ]
        for i in range ( len ( self.a ) ) :
            self.maze_cnt [ i ] = self.maze_cnt [ i ] + self.a [ i ]
            flag [ i ] = True
