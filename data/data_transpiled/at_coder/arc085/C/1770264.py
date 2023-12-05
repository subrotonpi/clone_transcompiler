def import _solve
class Main ( object ) :
    class MaxFlow ( object ) :
        def __init__ ( self , to , rev , cap ) :
            self.to = to
            self.rev = rev
            self.cap = cap
    def __init__ ( self , v ) :
        self.v = v
        self.G = [ [ ] for _ in range ( v ) ]
        self.used = [ False ]
    def add_edge ( self , from_to , cap ) :
        self.G [ from_to ].append ( ( to_to , len ( self.G [ to_to ] ) , cap ) )
        self.G [ to_to ].append ( ( from_to , len ( self.G [ from_to ] ) - 1 , 0 ) )
    def dfs ( v , t , f ) :
        if v == t : return f
        self.used [ v ] = True
        for e in self.G [ v ] :
            if not self.used [ e.to ] and e.cap > 0 :
                d = dfs ( e.to , t , min ( f , e.cap ) )
                if d :
                    e.cap -= d
                    self.G [ e.to ] [ e.rev ].cap += d
                    return d
        return 0
    def max_flow ( self , s , t ) :
        flow = 0
        while True :
            [ f ] = dfs ( s , t , int ( s ) )
            if not f : return flow
            flow += f
    def solve ( self , n , a ) :
        flow = MaxFlow ( self , n + 2 )
        for i in range ( self.n ) :
            if a [ i ] :
                flow.add_edge ( i , self.n + 1 , a [ i ] )
            else :
                flow.add_edge ( n , i , - a [ i ] )
        for j in range ( ( self.n + 1 ) * 2 , self.n + 1 ) :
            flow.add_edge ( i , j - 1 , int ( s ) / 2 )
