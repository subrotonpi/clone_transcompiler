def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def __call__ ( self , * args ) :
        w = self.mod
        a = self.a
        b = self.b
        line1 = _main.Line ( a , a + w )
        line2 = _main.Line ( b , b + w )
        print ( 0 if abs ( line1.L - line2.L ) <= w else abs ( line2.L - line1.L ) - w )
class Line ( object ) :
    def __init__ ( self , a , b ) :
        self.L = a
        self.R = b
    def getL ( self ) :
        return self.L
    def getR ( self ) :
        return self.R
    def getLength ( self ) :
        return R - self.L
    def setL ( self , n ) :
        self.L = n
    def setR ( self , n ) :
        self.R = n
