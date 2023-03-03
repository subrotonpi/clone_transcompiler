def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = Coord ( sys.stdin.read ( ) , sys.stdin.read ( ) )
            self.B = Coord ( sys.stdin.read ( ) , sys.stdin.read ( ) )
            self.N = sys.stdin.read ( )
        def __init__ ( self ) :
            self.C = Coord ( sys.stdin.read ( ) , sys.stdin.read ( ) )
        def is_intersect ( self , ax , ay , bx , by , cx , cy , dx , dy ) :
            if self.is_intersect ( A [ 0 ] , A [ 1 ] , B [ 0 ] , B [ 1 ] , c [ 0 ] , c [ 1 ] , c [ ( i + 1 ) % N ] [ 0 ] , c [ ( i + 1 ) % N ] [ 1 ] ) :
                count += 1
        print ( count / 2 + 1 )
    def is_intersect ( self , ax , ay , bx , by , cx , cy , dx , dy ) :
        ta = ( cx - dx ) * ( ay - cy ) + ( cy - dy ) * ( cx - ax )
        tb = ( cx - dx ) * ( by - cy ) + ( cy - dy ) * ( cx - bx )
        tc = ( ax - bx ) * ( cy - ay ) + ( ay - by ) * ( ax - cx )
        td = ( ax - bx ) * ( dy - ay ) + ( ay - by ) * ( ax - dx )
        return tc * td < 0 and ta * tb < 0
    class Coord ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
