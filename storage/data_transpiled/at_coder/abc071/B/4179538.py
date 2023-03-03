def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = [ x.strip ( ) for x in self.sc.split ( '' ) ]
        s.sort ( )
        s = set ( s )
        alphabet = 'a'
        for i in range ( 26 ) :
            if str ( alphabet ) not in s :
                print ( alphabet )
                return
            alphabet += 1
        print ( 'None' )
