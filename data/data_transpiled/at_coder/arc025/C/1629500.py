def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
        self.r = 0
        self.t = 0
    def input ( self ) :
        with open ( self.input , 'r' ) as f :
            self.N = f.read ( )
            self.M = f.read ( )
            self.r = f.read ( )
            self.t = f.read ( )
    def output ( self ) :
        with open ( self.input , 'r' ) as f :
            self.N = f.read ( )
            self.M = f.read ( )
            self.r = f.read ( )
            self.t = f.read ( )
    def output ( self ) :
        with open ( self.input , 'r' ) as f :
            self.N = f.read ( )
            self.M = f.read ( )
            self.r = f.read ( )
            self.t = f.read ( )
    def output ( self ) :
        self.N = self.M
        self.r = f.read ( )
        self.t = f.read ( )
        self.node = [ ]
        for a in self.M :
            self.node.append ( ( a , self.t ) )
    def output ( self ) :
        self.node.append ( ( self.node , self.t ) )
    def dijkstra ( node , s ) :
        queue = [ ( s , 0 ) ]
        dist = [ ]
        while not queue.empty ( ) :
            p = queue.pop ( )
            if dist [ p.id ] < self.t :
                continue
            dist [ p.id ] = p.dist
            for e in self.node [ p.id ] :
                queue.append ( ( e.to , e.dist + p.dist ) )
        dist.sort ( )
        return dist
class Main ( object ) :
    def __init__ ( self ) :
        self.N = N
        self.M = M
        self.r = f.read ( )
        self.t = f.read ( )
return Main