def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = int ( sc.readline ( ) )
            m = int ( sc.readline ( ) )
            bf = BellmanFord ( n )
            for a , b , c in [ ( a , b , c ) for a , b , c in [ ( a , b , c ) for a , b , c in [ ( a , b , c ) for a , c , c in [ ( a , c , c ) for a , b , c in [ ( b , c , c ) for b , c in [ ( a , c , c ) for c in [ ( b , c , c ) for a , c in [ ( b , c , c ) for b , c in [ ( b , c , c ) for c in [ ( b , c , c ) for b , c in [ ( b , c , c ) for c in [ ( b , c , c ) for b in [ ( b , c , c ) for c in [ ( b , c , c ) for b in [ b , c ] ] ] ] ] ] ] ) for i in range ( m ) ]
        def __init__ ( self , n ) :
            self.n = n
            self.graph = [ ]
            self.dist = [ ]
        def add_edge ( self , from_number ) :
            self.graph.append ( ( from_number , self.cost ) )
        def bellman_ford ( self , from_number ) :
            dist = [ INF ] * n
            dist [ from_number ] = 0
            for i in range ( n ) :
                for v in range ( n ) :
                    for k in range ( len ( self.graph [ v ] ) ) :
                        e = self.graph [ v ] [ k ]
                        if dist [ v ] != INF and dist [ e.to_number ] > dist [ v ] + e.cost :
                            dist [ e.to_number ] = dist [ v ] + e.cost
                            if i == n - 1 and e.to_number == n - 1 :
                                return True
            return False
    return Main ( )
