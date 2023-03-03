def import _main
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def __call__ ( self , * args , ** kwargs ) :
        sc = _main.raw_input ( )
        R = sc.randint ( 0 , R )
        C = sc.randint ( 0 , C )
        start = Point ( sc.randint ( 0 , R ) , sc.randint ( 0 , C ) )
        goal = Point ( sc.randint ( 0 , C ) , sc.randint ( 0 , C ) )
        field = [ ]
        sc.readline ( )
        for s in sc.readlines ( ) :
            for j in range ( C ) :
                field.append ( s [ j ] )
        print ( _bfs ( start , goal , field ) )
        sc.close ( )
    def _bfs ( start , goal , field ) :
        fifo = [ start ]
        while not fifo.empty ( ) :
            p = fifo.pop ( )
            field [ p [ 0 ] ] [ p [ 1 ] ] = '-'
            if p == goal :
                return p.turn
            move ( p [ 0 ] + 1 , p [ 1 ] , field , p.turn + 1 , fifo )
            move ( p [ 0 ] - 1 , p [ 1 ] , field , p.turn + 1 , fifo )
            move ( p [ 0 ] , p [ 1 ] + 1 , field , p.turn + 1 , fifo )
            move ( p [ 0 ] , p [ 1 ] - 1 , field , p.turn + 1 , fifo )
        return - 1
    def move ( self , x , y , field , turn , queue ) :
        if x >= 0 and y >= 0 and x < len ( field ) and y < len ( field [ x ] ) :
            if field [ x ] [ y ] == '.' :
                p = Point ( x , y )
                field [ x ] [ y ] = '-'
                p.turn = turn
                queue.append ( p )
