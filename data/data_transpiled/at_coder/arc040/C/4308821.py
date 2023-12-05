def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.field = [ ]
        for i in range ( self.n ) :
            self.field.append ( sys.argv [ i ] )
    count = 0
    for i in range ( self.n ) :
        for j in range ( self.n ) :
            if self.field [ i ] [ self.n - 1 - j ] == '.' :
                count += 1
                if i != self.n - 1 :
                    for k in range ( self.n - 1 - j , self.n ) :
                        self.field [ i + 1 ] [ k ] = 'o'
                break
    print ( count )
