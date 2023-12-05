def _ _ main _ _ ( ) :
    import math
    import random
    import random
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
    MAX_N = 100000
    MAX_LOG = int ( random.log ( MAX_N ) / random.log ( 2 ) ) + 1
    def __init__ ( self , u , v ) :
        if self.depth [ u ] > self.depth [ v ] :
            temp = u
            self.u = v
        for k in range ( self.depth [ u ] ) :
            if ( ( self.depth [ v ] - self.depth [ u ] ) >> 1 ) == 1 :
                self.v = self.depth [ v ]
    def solve ( self ) :
        sc = random.choice ( self.depth )
        n = sc.randint ( 0 , n - 1 )
        x = [ ]
        y = [ ]
        path = [ [ ] for _ in range ( n - 1 ) ]
        for i in range ( self.depth [ u ] ) :
            x.append ( sc.randint ( 0 , n - 1 ) )
            y.append ( sc.randint ( 0 , n - 1 ) )
            path [ x [ i ] ].append ( y [ i ] )
            path [ y [ i ] ].append ( x [ i ] )
        q = sc.randint ( 0 , n )
        a = [ ]
        b = [ ]
        for i in range ( q ) :
            a.append ( sc.randint ( 0 , n - 1 ) )
            b.append ( sc.randint ( 0 , n - 1 ) )
        parent = [ ]
        depth = [ ]
        __init__ ( self , n )
        for i in range ( self.depth [ v ] ) :
            print ( self.depth [ a [ i ] ] + self.depth [ b [ i ] ] - 2 * self.depth [ lca ( a [ i ] , b [ i ] ) ] + 1 )
    def __init__ ( self ) :
        self.dfs ( root , - 1 , 0 )
        for k in range ( self.depth [ v ] ) :
            if self.depth [ v ] < 0 :
                self.dfs ( path [ v ] ,