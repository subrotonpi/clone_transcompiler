def import search
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.num = [ ]
        for i in range ( 3 , 55555 + 1 ) :
            if search ( i ) :
                self.num.append ( i )
        self.count = N
        for i in range ( 3 , 55555 + 1 ) :
            if self.num [ i ] != 0 and self.count > 0 :
                self.count -= 1
                print ( self.num [ i ] )
    def search ( n ) :
        if n == 1 or n == 2 :
            return False
        for i in range ( 2 , math.sqrt ( n ) + 1 ) :
            if n % i == 0 or n % 10 != 3 :
                return False
        return True
