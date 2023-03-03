def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        if len ( self.s ) == 26 :
            self.set = sorted ( self.s [ 25 ] )
            for i in range ( 24 , 0 , - 1 ) :
                if self.set.higher ( self.s [ i ] ) :
                    print ( self.s [ : i ] , self.set.higher ( self.s [ i ] ) )
                    return
                else :
                    self.set.add ( self.s [ i ] )
            print ( - 1 )
        else :
            for i in ( 'a' , 'z' ) :
                if self.s.find ( i ) == - 1 :
                    print ( self.s , chr ( i ) )
                    break
