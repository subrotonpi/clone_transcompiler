def import import sys
class Main ( object ) :
    MOD = 10007
    def __init__ ( self ) :
        self.n = sys.argv [ 1 ]
        if self.n in [ 1 , 2 ] :
            print ( 0 )
            return
        elif self.n == 3 :
            print ( 1 )
            return
        a1 = a2 = a3 = 1
        for i in range ( 4 , self.n + 1 ) :
            x = a1 + a2 + a3
            x %= MOD
            a1 = a2
            a2 = a3
            a3 = x
        print ( a3 )
