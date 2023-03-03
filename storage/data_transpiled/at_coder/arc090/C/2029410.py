def import _sys , sys , ** kwargs ) :
    import os
    class Main ( object ) :
        def __init__ ( self , to , cost ) :
            self.to , self.cost = to , cost
    mod = 1000000007
    graph = [ ]
    def run ( s ) :
        try :
            f = open ( s , 'r' )
        except IOError :
            pass
        else :
            return f.read ( )
    def readline ( ) :
        try :
            f = tokenize.open ( s )
        except IOError :
            pass
        else :
            return f.readline ( )
    def dist ( ) :
        return int ( dist ( ) )
    def dist ( ) :
        return int ( dist ( ) )
    def dist ( ) :
        return float ( dist ( ) )
    def main ( ) :
        return Main ( ).run ( )
    def calc ( dist , count , s ) :
        INF = float ( 'inf' ) / 3
        dist [ s ] = INF
        dist [ s ] = 0
        q = sorted ( [ ( s , dist ( ) ) ] )
        count [ s ] = 1
        while not q.empty ( ) :
            cur = q.popleft ( )
            for t , e in enumerate ( graph [ cur.id ] ) :
                if cur.dist + e.cost < dist [ e.to ] :
                    v = Vertex ( e.to , dist [ e.to ] )
                    q.remove ( v )
                    v.dist = dist [ e.to ] = cur.dist + e.cost
                    count [ e.to ] = count [ cur.id ]
                    q.append ( v )
                elif cur.dist + e.cost == dist [ e.to ] :
                    count [ e.to ] += count [ cur.id ]
                    if count [ e.to ] >= mod :
                        count [ e.to ] -= mod
    solve ( )
    n , m = sys.argv [ 1 : ]
    graph = [ ]
    s , t = sys.argv [ 2 : ]
    for i in range ( n ) :
        graph.append ( Edge ( i , t ) )
    return graph
