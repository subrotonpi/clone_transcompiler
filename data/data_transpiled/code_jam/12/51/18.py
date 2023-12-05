def import import _sys , time , prob , id
class a ( object ) :
    def __init__ ( self ) :
        self.T = int ( time )
    for t in range ( 1 , T + 1 ) :
        n = int ( time )
        pairs = [ ]
        v1 = [ _sys.stdin.readline ( ) for _ in range ( n ) ]
        v2 = [ _sys.stdin.readline ( ) for _ in range ( n ) ]
        for i in range ( n ) :
            pairs.append ( ( i , v2 [ i ] , v1 [ i ] ) )
        pairs.sort ( )
        print ( "Case #%d:" % t , end = " " )
        for p in pairs :
            print ( " " + p.id , end = " " )
        print ( )
class Pair ( object ) :
    def __init__ ( self , a , b , c ) :
        self.id = a
        self.prob = b
        self.time = c
    def __lt__ ( self , other ) :
        if prob * self.time != time * self.prob :
            return time * self.prob - prob * self.time
        return id - self.id
