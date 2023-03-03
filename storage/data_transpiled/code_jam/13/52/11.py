def _import ( ) : return _import ( )
def cross ( a , b , c ) : return _import ( b [ 0 ] - a [ 0 ] , b [ 1 ] - a [ 1 ] )
def cross ( a2 , a3 ) : return 0
class B :
    def __init__ ( self , fname ) :
        self.fname = fname
    def readline ( self ) :
        return self.fname
    def readline ( self ) :
        return int ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return int ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def readline ( self ) :
        return long ( self.readline ( ) )
    def perm ( i , v ) :
        if i == N :
            for x in range ( N ) :
                for y in range ( x + 2 ) :
                    line1 = _import ( a [ p [ x ] ] , a [ p [ ( x + 1 ) % N ] ] )
                    line2 = _import ( a [ p [ y ] ] , a [ p [ ( y + 1 ) % N ] ] )
                    if line1.intersectsLine ( line2 ) : return
                area = 0
                for x in range ( 1 , N - 1 ) : area += cross ( a [ p [ 0 ] ] , a [ p [ x ] ] )
                if area > best : return area
                best = p [ 0 ]
        return best
    return B
