def _solve ( ) : return _solve ( )
class D ( object ) :
    def __init__ ( self , * args ) :
        sc = args.pop ( 0 )
        self.solve ( )
        n = sc.randint ( 1 , n )
        ps = [ P ( x * d , y * d ) for d in range ( n ) ]
        rs = [ ]
        left , right = 0 , 1e5
        for i in range ( n ) :
            ps.append ( P ( self.x , self.y ) )
        def dot ( self , p ) :
            return x * p.x + y * p.y
        def det ( self ) :
            return x * p.y - y * p.x
        def __repr__ ( self ) :
            return "(%.2f, %.2f)" % ( x , y )
    EPS = 1e-10
    def isCC ( self , r1 , c2 , r2 ) :
        x = self.c1.sub ( c2 ).abs2 ( )
        y = ( ( r1 - r2 * x ) / 2 ).dot ( p1 )
        if d < - EPS :
            d = 0
        q1 = self.c1.sub ( c2 ).dot ( p1 )
        rs.append ( p2 )
        left = max ( left , rs [ - 1 ] )
        return [ q1.sub ( q2 ) , q1.sub ( q2 ) ]
    for i in range ( 50 ) :
        mid = ( left + right ) / 2
        lst = [ ]
        for j in range ( n ) :
            b = ZERO
            b = b.set_bit ( j )
            for k in range ( n ) :
                if p.sub ( ps [ k ] ).abs ( ) + rs [ k ] < mid + EPS :
                    b = b.set_bit ( k )
                lst.append ( b )
        for k in range ( n ) :
            for p in isCC ( self , mid - rs [ j ] , ps [ k ] , mid - rs [ k ] ) :
                b = ZERO
                b = b.set_bit ( j ).set_bit ( k )
                for a in range ( n ) :
                    if p.sub ( ps [ a ] ).abs ( ) + rs [ k