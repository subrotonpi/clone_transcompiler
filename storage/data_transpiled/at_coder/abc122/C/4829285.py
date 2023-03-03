def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.Q = int ( self.Q )
        arr = self.arr.split ( ' ' )
        dp = [ ]
        for i in range ( 1 , len ( arr ) ) :
            if arr [ i ] == 'C' and arr [ i - 1 ] == 'A' :
                dp.append ( 1 )
        for i in range ( 1 , len ( dp ) ) :
            dp [ i ] += dp [ i - 1 ]
        while Q :
            l , r = _main ( N )
            l -= 1
            r -= 1
            val = dp [ r ] - dp [ l ]
            print ( val )
