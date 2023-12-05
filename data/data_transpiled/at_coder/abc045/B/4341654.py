def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    S = [ _main.get ( 'S' ) , _main.get ( 'S' ) , _main.get ( 'S' ) ]
    i = 0
    while S [ i ] != '' :
        turn = S [ i ] [ 0 ] - 'a'
        S [ i ] = S [ i ] [ 1 : ]
        i = turn
    print ( chr ( ord ( 'A' ) + i ) )
