def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( self.table )
        self.table = [ [ ] for _ in range ( self.N ) ]
        self.visited = [ False for _ in range ( self.N ) ]
    def dfs ( self , now ) :
        self.visited [ now ] = True
        self.table [ now ].append ( now )
        self.visited [ now ] = False
        return self.table [ now ]
