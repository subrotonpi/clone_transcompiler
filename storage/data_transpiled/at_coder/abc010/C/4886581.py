def import import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.txa , self.tya , self.txb , self.tyb , self.t , self.v , self.n = args
        for x , y in self.txa :
            if math.sqrt ( ( self.txa - x ) ** 2 + ( self.tya - y ) ** 2 ) + math.sqrt ( ( self.txb - x ) ** 2 + ( self.tyb - y ) ** 2 ) <= t * v :
                print ( "YES" )
                return
        print ( "NO" )
