def _ _ main _ _ ( ) :
    from collections import Counter
    from random import randint
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    M = 1_000_000_007
    class Main ( object ) :
        def __init__ ( self ) :
            self.M = M
        def __init__ ( self ) :
            self.N = choice ( [ choice ( [ ] ) for _ in range ( N ) ] )
            self.nodes = [ Node ( ) for _ in range ( self.N ) ]
            for a , b in choice ( [ choice ( [ ] ) for _ in range ( self.N - 1 ) ] ) :
                self.nodes [ a ].neighbors.append ( self.nodes [ b ] )
                self.nodes [ b ].neighbors.append ( self.nodes [ a ] )
        def dfs ( self ) :
            self.visited = True
            count = ( 1 , 1 )
            for n in self.neighbors :
                if not n.visited :
                    c = self.dfs ( n )
                    count *= ( c [ 0 ] + c [ 1 ] ) % M
                    count %= M
                    count *= c [ 0 ]
                    count %= M
            return count
    class Node ( object ) :
        def __init__ ( self ) :
            self.neighbors = [ ]
            self.visited = False
    return Main
