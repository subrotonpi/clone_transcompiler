def _import ( ) : return list ( map ( _import ( Point , [ ] ) , [ ] ) )
class Main ( object ) :
    def __init__ ( self , n11 , n12 , n21 , n22 ) :
        self.m = [ [ ] for _ in range ( 2 ) ]
    def sub ( self , A ) :
        self.m [ 0 ] [ 0 ] = n11
        self.m [ 0 ] [ 1 ] = n12
        self.m [ 1 ] [ 0 ] = n21
        self.m [ 1 ] [ 1 ] = self.m [ 1 ] [ 0 ]
        self.m [ 1 ] [ 1 ] = self.m [ 1 ] [ 1 ]
    def get ( self , y , x ) :
        return self.m [ y ] [ x ]
    def sub ( self , x ) :
        return self.m [ x ] [ x ]
    def move_x ( self , x ) :
        return self.m [ x ] [ x ]
    def move_y ( self , y ) :
        return self.m [ y ] [ x ]
    def move_x ( self , x ) :
        return self.m [ x ] [ x ]
    def move_y ( self , y ) :
        return self.m [ y ] [ x ]
    def sub ( self , point ) :
        self.x -= point [ 0 ]
        self.y -= point [ 1 ]
        return self
    def mul ( self , m ) :
        new_x = m [ 0 ] [ 0 ] * self.x + m [ 0 ] [ 1 ] * self.y
        new_y = m [ 1 ] [ 0 ] * self.x + m [ 1 ] [ 1 ] * self.y
        self.x = new_x
        self.y = new_y
    def move_x ( self , x ) :
        return self.move_x
    def move_y ( self , y ) :
        return self.move_y
    def move_x ( self , x ) :
        return self.move_x
    def move_y ( self , y ) :
        return self.move_y
