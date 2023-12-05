def import import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.main = _main ( args )
    def start ( self ) :
        sc = _main.sc
        str = sc.data
        if str == 'A' :
            print ( 'T' )
        if str == 'T' :
            print ( 'A' )
        if str == 'C' :
            print ( 'G' )
        if str == 'G' :
            print ( 'C' )
