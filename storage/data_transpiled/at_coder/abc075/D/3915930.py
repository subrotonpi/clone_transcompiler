def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.arr_x = [ ]
        self.arr_y = [ ]
        for i in range ( self.n ) :
            self.arr_x.append ( _main.arr_x [ i ] )
            self.arr_y.append ( _main.arr_y [ i ] )
        min = float ( 'inf' )
        for i in range ( self.n - 1 ) :
            for j in range ( self.i + 1 ) :
                for k in range ( self.n - 1 ) :
                    for l in range ( self.k + 1 ) :
                        sqr = abs ( self.arr_x [ i ] - self.arr_x [ j ] ) * abs ( self.arr_y [ k ] - self.arr_y [ l ] )
                        if sqr > min :
                            continue
                        if _is_over ( min ( self.arr_x [ i ] , self.arr_x [ j ] ) , max ( self.arr_x [ i ] , self.arr_x [ j ] ) , min ( self.arr_y [ k ] , self.arr_y [ l ] ) , max ( self.arr_y [ k ] , self.arr_y [ l ] ) ) :
                            min = sqr
    print ( min )
    def _is_over ( self , x1 , x2 , y1 , y2 ) :
        count = 0
        for i in range ( self.n ) :
            if self.arr_x [ i ] >= x1 and self.arr_x [ i ] <= x2 and self.arr_y [ i ] >= y1 and self.arr_y [ i ] <= y2 :
                count += 1
        return ( count >= k )
return Main
