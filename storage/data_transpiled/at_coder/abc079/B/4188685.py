def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        mod = 1000000007
    def main ( self ) :
        n = sc.recv_number ( )
        ar = [ 2 , 1 ]
        for i in range ( 2 , n + 1 ) :
            ar [ i ] = ar [ i - 1 ] + ar [ i - 2 ]
        print ( ar [ n ] )
