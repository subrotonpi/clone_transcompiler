def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count
        m = sc.count
        a = [ ]
        for i in range ( m ) :
            cont = self.edge [ queue [ 0 ] ]
            del self.edge [ queue [ 0 ] ]
            for i in range ( m ) :
                if not self.edge [ i ] :
                    self.copy_v.remove ( self.edge [ i ] )
                    self.queue.append ( self.edge [ i ] )
        return self.count
    ans = 0
    for i in range ( m ) :
        g = Graph ( )
        for j in range ( n ) :
            g.add ( "%d" % ( j + 1 ) )
        for j in range ( m ) :
            if i != j :
                g.add ( a [ j ] , a [ j ] )
        if g.connected_compo ( ) != 1 :
            ans += 1
    print ( ans )
class Graph ( object ) :
    def __init__ ( self ) :
        self.edge = { }
        self.vertex = { }
    def add ( self , a ) :
        if a not in self.edge :
            self.edge [ a ].add ( self.edge [ a ] )
            self.vertex [ a ] = self.edge [ a ] + 1
    def connected_compo ( self ) :
        copy_v = copy.copy ( self.vertex )
        count = 0
        while len ( copy_v ) != 0 :
            count += 1
            a = ""
            for key in self.edge [ b ] :
                a = key
                break
        if b in self.edge :
            self.edge [ b ].add ( self.edge [ b ] )
            self.vertex [ b ] = self.edge [ b ] + 1
        else :
            self.edge [ b ] = self.edge [ b ]
            self.vertex [ b ] = self.edge [ b ] + 1
    return Graph
