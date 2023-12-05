def import _judge
class Main ( object ) :
    def __init__ ( self ) :
        self.b = 0
        self.c = [ ]
    def judge ( self , a , r ) :
        self.a = a
        self.b = b
        self.c = [ ]
        for i in range ( a ) :
            for j in range ( b ) :
                self.c [ i ].append ( i )
        print ( "Found" if self.judge ( a - 1 , 0 ) else "Nothing" )
    def judge ( self , a , r ) :
        if a < 0 :
            return r == 0
        for i in range ( b ) :
            if self.judge ( a - 1 , r ^ self.c [ a ] [ i ] ) :
                return True
        return False
