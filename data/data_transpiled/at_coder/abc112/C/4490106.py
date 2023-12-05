def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.N = sc.count ( )
    def main ( self ) :
        self.N = sc.count ( )
    def main ( self ) :
        self.values = [ [ random.randint ( 0 , 100 ) , random.randint ( 0 , 100 ) ] for i in range ( self.N ) ]
    ans = None
    for i in range ( 0 , 100 ) :
        for j in range ( 0 , 100 ) :
            center_posi = ( i , j )
            H = 0
            for k in range ( self.N ) :
                x , y , h = values [ k ]
                if h is not None :
                    H = h + abs ( center_posi [ 0 ] - x ) + abs ( center_posi [ 1 ] - y )
                    break
            is_ok = True
            for k in range ( self.N ) :
                x , y , h = values [ k ]
                estimated_h = max ( ( H - abs ( x - center_posi [ 0 ] ) - abs ( y - center_posi [ 1 ] ) ) , 0 )
                is_ok = is_ok and ( estimated_h == h )
            if is_ok :
                ans = "%d %d %d" % ( i , j , H )
    print ( ans )
