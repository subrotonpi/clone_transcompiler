def import _min
class Main ( object ) :
    def __init__ ( self ) :
        sc = _raw_input
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        c = sc.__next__ ( )
        if a % 2 == 0 or b % 2 == 0 or c % 2 == 0 :
            print ( 0 )
        else :
            print ( min ( a * b , b * c , c * a ) )
    def max ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
