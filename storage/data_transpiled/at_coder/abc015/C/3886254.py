def import _judge
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 0
        self.b = 0
        self.c = [ ]
        for i in range ( self.a ) :
            for j in range ( self.b ) :
                self.c [ i ] [ j ] = _judge ( i , j )
        print ( "Found" if self.judge ( 0 , 0 ) else "Nothing" )
    def judge ( self , t , r ) :
        if t == self.a :
            return r == 0
        for i in range ( self.b ) :
            if self.judge ( t + 1 , r ^ self.c [ t ] [ i ] ) :
                return True
        return False
