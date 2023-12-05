def _ import SPACETOKEN os.write ( ) : SPACETOKEN print ( os.write ( os.linesep ) )
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.ax = sc.__next__ ( )
        self.ay = sc.__next__ ( )
        self.bx = sc.__next__ ( )
        self.by = sc.__next__ ( )
        self.N = sc.__next__ ( )
        zahyo = [ [ sc.__next__ ( ) , sc.__next__ ( ) ] for i in range ( N ) ]
        point = 0
        for i in range ( N ) :
            if Crossing ( zahyo [ i ] [ 0 ] , zahyo [ i ] [ 1 ] , zahyo [ ( i + 1 ) % N ] [ 0 ] , zahyo [ ( i + 1 ) % N ] [ 1 ] ) :
                point += 1
        pl ( point / 2 + 1 )
    def Crossing ( px , py , qx , qy ) :
        t1 = ( ( py - ay ) * ( bx - ax ) - ( px - ax ) * ( by - ay ) )
        t2 = ( ( qy - ay ) * ( bx - ax ) - ( qx - ax ) * ( by - ay ) )
        t3 = ( ( ay - py ) * ( qx - px ) - ( ax - px ) * ( qy - py ) )
        t4 = ( ( by - py ) * ( qx - px ) - ( bx - px ) * ( qy - py ) )
        return t1 * t2 < 0 and t3 * t4 < 0
    class SC ( object ) :
        def __init__ ( self , sc ) :
            self.sc = sc
            self.tokens = None
        def __call__ ( self , * args ) :
            if not self.tokens or not self.tokens :
                try :
                    self.tokens = self.tokens.split ( )
                except ValueError :
                    raise TypeError ( "tokens must be integers" )
            return self.tokens [ 0 ]
return Main
