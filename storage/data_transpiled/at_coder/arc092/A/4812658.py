def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.x , self.y , self.pair = self.x , self.y , self.pair = self.pair , - 1
    def map ( self , r , b ) :
        n = len ( r )
        r = [ Point ( r [ 0 ] , r [ 1 ] ) for r in r ]
        b = [ Point ( r [ 2 ] , r [ 3 ] ) for r in b ]
        map = [ [ 1 if i in r else 0 for i in b ] for j in range ( n ) if ( r [ i ].x < b [ j ].x ) and ( r [ i ].y < b [ j ].y ) ] for i in range ( n ) ]
        ans = 0
        for i in range ( n ) :
            ans += ( 1 if foo ( i , n , [ ] ) else 0 )
        print ( ans )
    def foo ( v , n , bs ) :
        for i in range ( n ) :
            if ( map [ v ] [ i ] != 1 ) or ( bs [ i ] ) :
                continue
            bs [ i ] = 1
            if b [ i ].pair == - 1 or foo ( b [ i ].pair , n , bs ) :
                b [ i ].pair = v
                return True
        return False
