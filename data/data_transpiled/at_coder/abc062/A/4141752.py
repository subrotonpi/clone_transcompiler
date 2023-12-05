def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        ar = [ 1 , 2 , 1 , 3 , 1 , 3 , 1 , 1 , 3 , 1 , 3 , 1 ]
        x , y = sc.regs [ : 2 ]
        print ( 'Yes' if ar [ x - 1 ] == ar [ y - 1 ] else 'No' )
