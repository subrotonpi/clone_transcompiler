def import _scanner
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def main ( self ) :
        for i in range ( len ( self ) // 2 , - 1 , - 1 ) :
            if self.s [ - i - 1 ] != self.s [ i ] :
                self.s.append ( 'NO' )
                return
        self.s.append ( 'YES' )
