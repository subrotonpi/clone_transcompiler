def import _main
class Main ( object ) :
    KEY = ( 'WBWBWWBWBWBW' , 'WBWWBWBWBWBWWB' , 'WWBWBWBWBWWB' , 'WBWBWBWBWBWWB' , 'WWBWBWBWBWBWWB' )
    VALUE = ( 'Do' , 'Re' , 'Mi' , 'Fa' , 'So' , 'La' , 'Si' )
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.read ( )
        for i in range ( len ( KEY ) ) :
            if s.startswith ( KEY [ i ] ) :
                print ( VALUE [ i ] )
                return
