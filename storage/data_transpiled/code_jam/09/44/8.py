def _import ( ) : return ( x , y , r )
class Circle :
    def __init__ ( self , x , y , r ) :
        self.x = x
        self.y = y
        self.r = r
    def get ( self , c1 , c2 , c3 ) :
        r = math.sqrt ( ( c2.x - c3.x ) ** 2 + ( c2.y - c3.y ) ** 2 )
        return max ( self.c1.r , ( r + c2.r + c3.r ) / 2 )
    def run ( self ) :
        with open ( self.input , 'r' ) as input :
            with open ( self.output , 'w' ) as output :
                t = input.readline ( ).strip ( )
                for tt in t :
                    n = input.readline ( ).strip ( )
                    ans = 0
                    cs = [ Circle ( input.readline ( ) , input.readline ( ) , input.readline ( ) ) for x in range ( n ) ]
                    if n == 1 :
                        ans = cs [ 0 ].r
                    if n == 2 :
                        ans = max ( cs [ 1 ].r , cs [ 0 ].r )
                    if n == 3 :
                        ans = min ( get ( cs [ 0 ] , cs [ 1 ] , cs [ 2 ] ) , min ( get ( cs [ 1 ] , cs [ 0 ] , cs [ 2 ] ) , get ( cs [ 2 ] , cs [ 0 ] , cs [ 1 ] ) ) )
                    output.write ( 'Case #%d: %f\n' % ( tt + 1 , ans ) )
