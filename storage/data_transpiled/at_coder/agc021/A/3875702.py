def import import math
import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = math.factorial ( self.n )
        self.s = str ( self.n )
        self.l = len ( self.s )
        if self.l == 1 :
            print ( self.n )
        else :
            nine = True
            for i in range ( 1 , self.l ) :
                if self.s [ i ] != '9' :
                    nine = False
                    break
            if nine :
                print ( 9 * ( self.l - 1 ) + self.n / long ( math.pow ( 10 , self.l - 1 ) ) )
            else :
                print ( 9 * ( self.l - 1 ) + self.n / long ( math.pow ( 10 , self.l - 1 ) ) - 1 )
