def import _main
class Edge ( object ) :
    def __init__ ( self , A , B , C ) :
        self.a = A
        self.b = B
        self.c = C
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def g_int ( self ) :
        return int ( self.s.readline ( ) )
    def main ( self , * args , ** kwargs ) :
        global INIT
        global a
        a = defaultdict ( list )
        n , m = self.g_int ( ) , self.g_int ( )
        pos = [ 0 ] * n
        pos [ 0 ] = INIT
        for q in range ( m ) :
            l , r , d = self.g_int ( ) - 1 , self.g_int ( ) - 1 , self.g_int ( )
            a.setdefault ( l , [ ] ).append ( ( l , r , d ) )
            a.setdefault ( r , [ ] ).append ( ( r , l , - d ) )
        d = deque ( )
        while not a.empty ( ) :
            d.extend ( a.popleft ( ) [ 1 ] )
            while not d.empty ( ) :
                o = d.pop ( )
                if pos [ o.a ] == INIT :
                    pos [ o.a ] = 0
                if pos [ o.b ] == INIT :
                    pos [ o.b ] = pos [ o.a ] + o.c
                    v = a.pop ( o.b )
                    if v :
                        d.extend ( v )
                if pos [ o.b ] - pos [ o.a ] != o.c :
                    print ( "No" )
                    return
        print ( "Yes" )
