def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B , self.C , self.X , self.Y = sys.stdin.read ( ).read ( ).strip ( ).split ( '\n' )
    A , B , C , X , Y = map ( int , sys.stdin.read ( ).split ( '\n' ) )
    v0 = C * 2 * X + max ( 0 , B * ( Y - X ) )
    v1 = C * 2 * Y + max ( 0 , A * ( X - Y ) )
    v2 = X * A + Y * B
    v = min ( v0 , v1 )
    v = min ( v , v2 )
    print ( v )
