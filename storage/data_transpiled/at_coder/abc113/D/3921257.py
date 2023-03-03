def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __init__ ( self ) :
        self.H , self.W , self.K = int ( self.H ) , int ( self.W ) , int ( self.K )
        self.MOD = 1000000007
        dp = [ [ 1 ] * ( self.H + 1 ) ]
        dp [ 0 ] [ 0 ] = 1
        for h in range ( 1 , self.H + 1 ) :
            for w in range ( self.W ) :
                for i in range ( ( 1 << self.W - 1 ) ) :
                    mask = 3
                    flag = True
                    while 1 :
                        if mask & i == mask :
                            flag = False
                        if mask == 3 << self.W - 1 :
                            break
                        mask = mask << 1
                    if flag :
                        if w > 0 and ( i & ( 1 << w - 1 ) ) > 0 :
                            dp [ h ] [ w ] += dp [ h - 1 ] [ w - 1 ]
                        elif w < self.W - 1 and ( i & ( 1 << w ) ) > 0 :
                            dp [ h ] [ w ] += dp [ h - 1 ] [ w + 1 ]
                        else :
                            dp [ h ] [ w ] += dp [ h - 1 ] [ w ]
                        dp [ h ] [ w ] %= self.MOD
        print ( dp [ H ] [ K - 1 ] )
class Pair ( object ) :
    def __init__ ( self ) :
        from time import time
        self.end = time ( )
        self.num = 0
        self.bango = 0
    def __repr__ ( self ) :
        return "%s %s" % ( self.num , self.bango )
return Main
