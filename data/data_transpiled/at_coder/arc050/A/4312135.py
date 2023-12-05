def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        a = self.sc.get ( 'a' )
        b = self.sc.get ( 'b' )
        if a [ 0 ] - 'A' + 'a' == b [ 0 ] :
            print ( 'Yes' )
        else :
            print ( 'No' )
