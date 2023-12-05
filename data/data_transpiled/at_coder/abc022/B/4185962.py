def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX_NUM = 100000
    def __init__ ( self ) :
        self.N = 0
    def read ( self ) :
        with open ( self.N ) as sc :
            sum = [ 0 ] * ( self.MAX_NUM + 1 )
            for a in range ( self.N ) :
                sum [ a ] += 1
        ans = 0
        for i in range ( 1 , self.MAX_NUM + 1 ) :
            if sum [ i ] > 0 :
                ans += sum [ i ] - 1
        print ( ans )
