def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.x , self.y , self.r , self.x2 , self.y2 , self.x3 , self.y3 = args
        print ( self.x2 > self.x - r or self.x3 < self.x + r or self.y2 > self.y - r or self.y3 < self.y + r or 'YES' )
        print ( self.x2 > self.x ** 2 + self.y3 > self.y ** 2 )
