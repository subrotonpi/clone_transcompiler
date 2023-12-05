def import _main
class Main ( object ) :
    class Edge ( object ) :
        def __init__ ( self , p , type ) :
            self.p = p
            self.type = type
    class State ( object ) :
        def __init__ ( self , p , cb , time ) :
            self.p = p
            self.cb = cb
            self.time = time
    class A ( object ) :
        def __init__ ( self , p , cb , time ) :
            self.p = p
            self.cb = cb
            self.time = time
    def main ( ) :
        sc = _main.raw_input ( )
        n , m = sc.regs [ 0 ]
        v = [ ]
        dis = [ ]
        flag = [ ]
        dis.append ( int ( n ) )
        for i in range ( n ) :
            v.append ( [ ] )
        for i in range ( m ) :
            c , a , b = sc.regs [ i ]
            v [ a ].append ( Edge ( b , c ) )
            v [ b ].append ( Edge ( a , c ) )
    pq = PriorityQueue ( key = lambda x : x [ 0 ] , reverse = True )
    while not pq.empty ( ) :
        p = pq.pop ( )
        if p.time > dis [ p.p ] :
            continue
        dis [ p.p ] = p.time
        for e in v [ p.p ] :
            if e.type == 1 :
                if p.time + p.cb + 1 < dis [ e.p ] :
                    pq.append ( Edge ( e.p , p.cb + 1 , p.time + p.cb + 1 ) )
            else :
                if p.time + 1 < dis [ e.p ] :
                    pq.append ( Edge ( e.p , p.cb , p.time + 1 ) )
    return A ( )
