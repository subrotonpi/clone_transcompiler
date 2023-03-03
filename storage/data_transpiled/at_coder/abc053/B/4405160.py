def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.po = _main ( )
    def go ( self ) :
        self.po = _main ( )
        s = self.po.split ( '' )
        i , j = 0 , 0
        for i in range ( 0 , 1 ) :
            if s [ i ] == 'A' :
                break
        for j in range ( len ( s ) - 1 , 1 , - 1 ) :
            if s [ j ] == 'Z' :
                break
        print ( j - i + 1 )
