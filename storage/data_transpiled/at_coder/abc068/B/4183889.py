def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys
        mod = 1000000007
    def main ( ) :
        ar = [ 64 , 32 , 16 , 8 , 4 , 2 , 1 ]
        n = sc.randint ( 0 , mod )
        for i in range ( 7 ) :
            if n >= ar [ i ] :
                print ( ar [ i ] )
                return
