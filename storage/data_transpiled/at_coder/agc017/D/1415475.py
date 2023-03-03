def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        self.edge = [ [ ] for i in range ( 1 , N + 1 ) ]
        for i in range ( N - 1 ) :
            x , y = _main ( )
            self.edge [ x ].append ( y )
            self.edge [ y ].append ( x )
        ans = 'Alice'
        if self.dfs ( 1 , 0 ) == 0 :
            ans = 'Bob'
        print ( ans )
