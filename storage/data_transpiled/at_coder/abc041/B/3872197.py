def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.A = math.mpf ( 10 )
        self.B = math.mpf ( 10 )
        self.C = math.mpf ( 10 )
        self.X = long ( math.pow ( 10 , 9 ) ) + 7
        self.ans = long ( A * B % X * C % X )
        self.print ( ans )
