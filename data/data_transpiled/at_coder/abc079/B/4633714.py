def import _luca
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.ans = 0
    def run ( self ) :
        sc = _luca.Scanner ( )
        self.N = sc.N
        self.luca ( 2 , 1 , 0 )
        print ( self.ans )
    def luca ( self , a , b , n ) :
        if n >= self.N :
            self.ans = a
            return
        self.luca ( b , a + b , n + 1 )
