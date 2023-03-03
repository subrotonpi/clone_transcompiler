def _import ( ) : return
import Queue
import Queue
import Queue
import Queue
import Queue
import sys
class Edge :
    def __init__ ( self , A , B , C ) :
        self.a , self.b , self.c = A , B , C
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.readline ( )
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
            a.setdefault ( l , ( 1 , ) ).append ( ( l , r , d ) )
            a.setdefault ( r , ( 1 , ) ).append ( ( r , l , - d ) )
        d = Queue.Queue ( )
        while not a.empty ( ) :
            d.update ( a.popleft ( ) [ 1 ] )
            while not d.empty ( ) :
                o = d.pop ( )
                if pos [ o.a ] == INIT :
                    pos [ o.a ] = 0
                if pos [ o.b ] == INIT :
                    pos [ o.b ] = pos [ o.a ] + o.c
                    v = a.remove ( o.b )
                    if v :
                        d.update ( v )
                if pos [ o.b ] - pos [ o.a ] != o.c :
                    print ( "No" )
                    return
        print ( "Yes" )
