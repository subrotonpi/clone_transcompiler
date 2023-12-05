def import import _readline
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def readline ( self ) :
        for i in range ( len ( self.s ) // 2 , - 1 , - 1 ) :
            if self.s [ i ] != self.s [ - i - 1 ] and self.s [ i ] != '*' and self.s [ - i - 1 ] != '*' :
                self.s.append ( 'NO' )
                return
        self.s.append ( 'YES' )
