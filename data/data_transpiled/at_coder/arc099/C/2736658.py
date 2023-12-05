def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    class Main ( object ) :
        def __init__ ( self ) :
            self._import ( None , '' , os.getpid ( ) )
    p = 0
    flag = True
    def dfs ( cur , par ) :
        cnt [ p ] [ cur ] += 1
        for dst in self.g :
            if dst == par : continue
            if self.col [ dst ] == - 1 :
                self.col [ dst ] = self.col [ cur ] ^ 1
                dfs ( dst , cur )
            else :
                if self.col [ dst ] != ( self.col [ cur ] ^ 1 ) :
                    flag = False
    def tr ( * objects ) :
        with open ( '/' ) as sc :
            N = sc.read ( )
            M = sc.read ( )
            A = [ ]
            B = [ ]
            col = [ ]
            g = [ ]
            connect = [ [ ] for _ in range ( N ) ]
            cnt = [ ]
            for i in range ( N ) :
                g.append ( [ ] )
            col.append ( - 1 )
            for i in range ( M ) :
                A.append ( sc.read ( ) )
                B.append ( sc.read ( ) )
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
                    dfs ( i , - 1 )
                    p += 1
    if not flag :
        print ( - 1 )
        return
    ok = [ [ ] ]
    for i in range ( 0 , 1000 ) :
        for j in range ( 1000 ) :
            if ok [ i ] [ j ] :
                ok [ i ].append