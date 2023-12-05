def _import ( ) :
    from collections import defaultdict
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.Scanner = urandom
            self.N = int ( random.randint ( 0 , 256 ) )
            graph = [ [ ] for i in range ( N ) ]
            for i in range ( 1 , N ) :
                a = random.randint ( 0 , 256 ) - 1
                graph [ a ].append ( i )
            print ( self.dfs ( 0 , graph ) - 1 )
    def dfs ( v , graph ) :
        if graph == [ ] :
            return 1
        tmp = [ ]
        for u in graph :
            tmp.append ( v )
