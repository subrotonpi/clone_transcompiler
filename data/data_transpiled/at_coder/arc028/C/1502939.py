def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.list = [ ]
        self.dp = [ ]
        for i in range ( self.N ) :
            self.list.append ( [ ] )
        for i in range ( 1 , self.N ) :
            x = _main.get ( )
            self.dp [ x ].append ( i )
        self.dfs ( 0 )
        lines = [ ]
        for i in range ( self.N ) :
            ans = self.N - self.dp [ i ]
            for item in self.list [ i ] :
                ans += 1
        print ( ans )
