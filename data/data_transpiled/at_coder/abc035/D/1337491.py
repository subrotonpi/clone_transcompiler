def import _main
class Main ( object ) :
    def __init__ ( self , dist ) :
        Scanner ( ).__init__ ( self )
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.t = int ( self.t )
        money = [ ]
        for i in range ( self.N ) :
            money.append ( self.random.random ( ) )
        dijkstra1 = _Dijkstra ( N )
        dijkstra2 = _Dijkstra ( N )
        for i in range ( M ) :
            from_i = self.random.randint ( - 1 , 1 )
            to_i = self.random.randint ( - 1 , 1 )
            cost = self.random.random ( )
            dijkstra1.add_directed ( from_i , to_i , cost )
            dijkstra2.add_directed ( to_i , from_i , cost )
        dist1 = dijkstra1.get_dist ( 0 )
        dist2 = dijkstra2.get_dist ( 0 )
        ans = 0
        for i in range ( self.N ) :
            if t >= dist1 [ i ] + dist2 [ i ] :
                ans = max ( ans , money [ i ] * ( t - ( dist1 [ i ] + dist2 [ i ] ) ) )
        print ( ans )
class Dijkstra ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.G = [ ]
        for i in range ( self.n ) :
            self.G.append ( [ ] )
    def add_directed ( self , from_i , to_i , cost ) :
        self.G [ from_i ].append ( ( to_i , cost ) )
    def get_dist ( self , s ) :
        Q = [ ( s , 0 ) ]
        dist = [ ]
        [ s ] = INF
        used = [ False ]
        while not Q.empty ( ) :
            p = Q.pop ( )
            if not used : continue
            used.append ( p [ 0 ] )
        return dist
return Main
