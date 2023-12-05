def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.graph = [ ]
        self.visited = [ ]
        self.color = [ ]
        self.one = 0
        self.bipartite = 0
        self.count = 0
        self.mujun = False
        def dfs ( a , c ) :
            if self.visited [ a ] :
                if self.color [ a ] in [ 0 , 1 ] :
                    mujun = True
                return 0
            self.visited [ a ] = True
            self.color [ a ] = c
            total = 1
            for b in self.graph [ a ] :
                total += dfs ( b , 1 - c )
            return total
    def run ( self ) :
        Scanner ( ).run ( )
        n , m = Scanner ( ).scan ( )
        self.graph = [ [ ] for _ in range ( n ) ]
        for u , v in Scanner ( ).scan ( ) :
            self.graph [ u ].append ( v )
            self.graph [ v ].append ( u )
        self.visited = [ ]
        self.color = [ ]
        self.color = [ ]
        self.one = 0
        self.bipartite = 0
        self.count = 0
        for i in range ( n ) :
            if self.visited [ i ] :
                continue
            self.count += 1
            mujun = False
            kind = self.dfs ( i , 0 )
            if kind == 1 :
                self.one += 1
            elif not mujun :
                self.bipartite += 1
        total = self.one * ( 2 * self.n - one )
        total += ( self.count - one ) ** 2
        total += self.bipartite ** 2
        print ( total )
    def main ( self ) :
        return ( None , Main ( ) , "" , 128 * 1024 * 1024 )
Note :./ Main.py.uses.unchecked or unsafe.operations.Note : Recompile.with - Xlint : classmethod
for details in Main.__members__ :
    print ( details )
