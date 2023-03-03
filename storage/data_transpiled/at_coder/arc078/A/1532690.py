def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.x = 0
        self.y = 0
        self.N = N
        self.a = [ ]
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            self.N = f.read ( )
    def main ( self , args ) :
        self.input ( )
        self.x = self.a [ 0 ]
        for i in range ( 1 , N ) :
            self.y += self.a [ i ]
        self.ans = abs ( self.x - self.y )
        for i in range ( 1 , N - 1 ) :
            self.x += self.a [ i ]
            self.y -= self.a [ i ]
            self.ans = min ( abs ( self.x - self.y ) , self.ans )
        print ( self.ans )
