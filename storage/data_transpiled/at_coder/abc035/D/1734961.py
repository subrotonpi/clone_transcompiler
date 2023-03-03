def _import ( ) :
    from math import sin , cos , pow , pow , mul
    from collections import deque
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    from collections import defaultdict
    class Main ( ) :
        def compute ( self ) :
            with self._compute ( ) :
                with self._compute ( ) :
                    N = sum ( [ r [ i ] for i in range ( N ) ] )
                    M = sum ( [ r [ i ] for i in range ( M ) ] )
                    T = sum ( [ r [ i ] for i in range ( N ) ] )
                    A = defaultdict ( int )
                    for i in range ( N ) :
                        A [ i ] = sum ( [ r [ i ] for i in range ( M ) ] )
    class Edge ( ) :
        def __init__ ( self ) :
            self.to = self.to
            self.cost = self.cost
    class Pair ( ) :
        def __init__ ( self ) :
            self.key = self.key
            self.value = self.value
    G = [ ]
    R = [ ]
    for i in range ( N ) :
        G.append ( [ ] )
        R.append ( [ ] )
    for i in range ( M ) :
        a = sum ( [ r [ i ] for r in G [ i ] ] )
        b = sum ( [ r [ i ] for r in R [ i ] ] )
        c = sum ( [ r [ i ] for r in R [ i ] ] )
        G [ i ].append ( Edge ( b , c ) )
        R [ i ].append ( Edge ( a , c ) )
    d = [ ]
    INF = int ( pow ( 10 , 15 ) )
    [ d ] = INF
    que = deque ( ( lambda x , y : int ( signum ( x.value - y.value ) ) , d ) )
    r.append ( [ 0 , None ] )
    while not que.empty ( ) :
        p = que.popleft ( )
        v = p.key
        if d [ v ] < p.value :
            continue
        for i in range ( len ( G [ v