def _import ( ) :
    import os
    import math
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self , p ) :
            super ( Main , self ).__init__ ( None , '' , os.getpid ( ) )
        def __init__ ( self , * args ) :
            self.ans = min ( self.ans , self.ans )
        def dfs ( cur , par ) :
            self.cnt [ p ] += 1
            for dst in self.g :
                if dst == par : continue
                if self.col [ dst ] == - 1 :
                    self.col [ dst ] = self.col [ cur ] ^ 1
                else :
                    if self.col [ dst ] != ( self.col [ cur ] ^ 1 ) :
                        print ( - 1 )
                        sys.exit ( 0 )
    def tr ( * args ) :
        sc = os.popen ( '/usr/bin/sh' )
        N , M = sc.read ( ).split ( )
        A = [ ]
        B = [ ]
        col = [ ]
        g = [ ]
        connect = [ [ ] for _ in range ( N ) ]
        cnt = [ ]
        for i in range ( N ) :
            g.append ( [ ] )
        [ col ] = - 1
        for i in range ( M ) :
            A.append ( sc.read ( ).split ( ) [ 0 ] )
            B.append ( sc.read ( ).split ( ) [ 0 ] )
            del A [ i ]
            del B [ i ]
            connect [ A [ i ] ] [ B [ i ] ] = True
            connect [ B [ i ] ] [ A [ i ] ] = True
        for i in range ( N ) :
            for j in range ( N ) :
                if i != j and not connect [ i ] [ j ] :
                    g [ i ].append ( j )
        for i in range ( N ) :
            if self.col [ i ] == - 1 :
                self.col [ i ] = 0
                self.dfs ( i , - 1 )
                self.cnt [ i ] += 1
    ans = sum ( g ) / 3
    for i in range ( 1000 ) :