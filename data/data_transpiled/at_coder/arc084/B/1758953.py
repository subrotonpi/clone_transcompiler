def import _main
class Main ( object ) :
    def read ( self ) :
        self.n = n
        ns = [ [ ] for _ in range ( n + 1 ) ]
        def solve ( self ) :
            for i in range ( n + 1 ) :
                nxt = ( i + 1 ) % n
                nxt2 = ( i * 10 ) % n
                ns [ i ].append ( ( i , nxt , 1 ) )
                ns [ i ].append ( ( i , nxt2 , 0 ) )
    def solve ( self ) :
        for i in range ( n + 1 ) :
            nxt = ( i + 1 ) % n
            nxt2 = ( i * 10 ) % n
            ns [ i ].append ( ( i , nxt , 1 ) )
            ns [ i ].append ( ( i , nxt2 , 0 ) )
        ds = [ 1 ] * ( n + 1 )
        deq = deque ( )
        ds [ 1 ] = 1
        for e in ns [ 1 ] :
            if e.c == 0 : deq.append ( e )
            else : deq.append ( e )
        while not deq.empty ( ) :
            e = deq.popleft ( )
            dist = ds [ e.cur ] + e.c
            ds [ e.to ] = min ( dist , ds [ e.to ] + nxt.c )
            for nxt in self.ns [ e.to ] :
                if ds [ nxt.to ] > ds [ e.to ] + nxt.c :
                    if nxt.c == 0 : deq.append ( nxt )
                    else : deq.append ( nxt )
        print ( ds [ 0 ] )
    class Edge ( object ) :
        def __init__ ( self , cur , to , c ) :
            self.cur = cur
            self.to = to
            self.c = c
