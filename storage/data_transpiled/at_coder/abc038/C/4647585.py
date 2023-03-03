def import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.randint ( 1 , N + 1 )
        self.values = [ sc.randint ( 0 , N + 1 ) for i in range ( N + 1 ) ]
        self.values.append ( 0 )
        self.ans = 0
        count = 1
        for i in range ( N ) :
            if self.values [ i ] < self.values [ i + 1 ] :
                count += 1
            else :
                self.ans += ( count * ( count + 1 ) ) / 2
                count = 1
        print ( self.ans )
