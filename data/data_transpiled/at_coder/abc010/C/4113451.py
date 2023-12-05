def import _calc
class Main ( object ) :
    def __init__ ( self , x1 , y1 , x2 , y2 ) :
        sc = _raw_input ( )
        x1 = sc.get ( 'x' )
        y1 = sc.get ( 'y' )
        x2 = sc.get ( 'x' )
        y2 = sc.get ( 'y' )
        t = sc.get ( 't' )
        v = sc.get ( 'v' )
        n = sc.get ( 'n' )
        for i in range ( n ) :
            if t * v >= _calc ( sc.get ( 'x' ) , sc.get ( 'y' ) ) :
                print ( 'YES' )
                return
        print ( 'NO' , end = ' ' )
    def calc ( x , y ) :
        return math.sqrt ( ( x1 - x ) ** 2 + ( y1 - y ) ** 2 ) + math.sqrt ( ( x2 - x ) ** 2 + ( y2 - y ) ** 2 )
