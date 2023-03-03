def _import ( ) : return depth [ a ] + depth [ b ] - 2 * depth [ b ]
def bfs ( ) :
    q = Queue ( )
    q.put ( X )
    vis = [ ]
    for d in range ( 0 , n + 1 ) :
        for L in q :
            u = q.get ( )
            if u in special and v in special : return True
        if u in depth and u not in depth :
            depth.append ( u )
    def main ( ) :
        io = IO ( None , None )
        X = io.__next__ ( )
        for i in range ( 1 , n + 1 ) :
            a = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            a = io.__next__ ( )
        for i in range ( 1 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            b = io.__next__ ( )
        for i in range ( 0 , n + 1 ) :
            if i in depth :
                d = depth [ i ] + 1
            else :
                d = i
    def write ( x , num_digits ) :
        io.write ( x , num_digits )
    def write ( x , p ) :
        io.write ( x , num_digits )
    def write ( x , p ) :
        io.write ( x , p )
def write ( x , y ) :
    io.write ( x , y )
def write ( x , y ) :
    io.write ( x , y )
write ( write )
return write
