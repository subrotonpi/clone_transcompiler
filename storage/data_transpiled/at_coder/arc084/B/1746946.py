def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __init__ ( self ) :
        self.k = len ( sys.argv )
        dist = [ sys.maxsize for _ in range ( self.k ) ]
        dist [ 1 ] = 0
        deque = deque ( )
        deque.append ( 1 )
        visit = [ 1 ]
        while deque :
            u = deque.popleft ( )
            v1 = ( 10 * u ) % self.k
            v2 = ( u + 1 ) % self.k
            if visit [ v1 ] == 0 :
                dist [ v1 ] = min ( dist [ v1 ] , dist [ u ] )
                deque.append ( v1 )
                visit [ v1 ] = 1
            else :
                if dist [ v1 ] > dist [ u ] :
                    dist [ v1 ] = dist [ u ]
                    deque.append ( v1 )
            if visit [ v2 ] == 0 :
                dist [ v2 ] = min ( dist [ v2 ] , dist [ u ] + 1 )
                deque.append ( v2 )
                visit [ v2 ] = 1
        print ( dist [ 0 ] + 1 )
