def import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.randint ( 0 , math.ceil ( math.log ( self.N ) ) )
        self.kinds = set ( )
        self.any = 0
        for i in range ( self.N ) :
            value = math.randint ( 0 , math.ceil ( self.N ) )
            if value <= 399 :
                self.kinds.add ( 0 )
            elif value <= 799 :
                self.kinds.add ( 1 )
            elif value <= 1199 :
                self.kinds.add ( 2 )
            elif value <= 1599 :
                self.kinds.add ( 3 )
            elif value <= 1999 :
                self.kinds.add ( 4 )
            elif value <= 2399 :
                self.kinds.add ( 5 )
            elif value <= 2799 :
                self.kinds.add ( 6 )
            elif value <= 3199 :
                self.kinds.add ( 7 )
            else :
                self.any += 1
        self.min = ( self.kinds.count ( ) or 1 )
        self.max = self.kinds.count ( ) + self.any
        print ( min , max )
