def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
    def main ( self ) :
        days = [ 'Monday' , 'Tuesday' , 'Wednesday' , 'Thursday' , 'Friday' , 'Saturday' , 'Sunday' ]
        inp = self.s.next ( )
        for i in range ( 7 ) :
            if self.s.next ( ) == inp :
                self.s.next ( )
                return max ( 5 - i , 0 )
