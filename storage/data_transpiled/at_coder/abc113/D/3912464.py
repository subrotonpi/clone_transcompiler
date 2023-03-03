def import _main
class Main ( object ) :
    mod = 1000000007
    def __init__ ( self ) :
        self.mod = mod
    def __init__ ( self ) :
        sc = _main ( )
        self.h , self.w , self.k = sc.__next__ ( )
        self.p = [ 1 ]
        for i in range ( 2 , self.w + 2 ) :
            self.p [ i ] = self.p [ i - 1 ] + self.p [ i - 2 ]
        self.dp = [ ]
        for i in range ( 1 , self.h + 1 ) :
            for j in range ( 1 , self.w + 1 ) :
                self.dp [ i ] [ j ] = self.calc ( i , j )
        print ( self.dp [ self.h ] [ self.k ] )
    def calc ( self , height , width ) :
        if height == 1 and width == 1 :
            return self.p [ self.w - 1 ]
        elif height == 1 and width == 2 :
            return self.p [ self.w - 2 ]
        elif height + 1 < width :
            return 0
        else :
            res = 0
            res += self.dp [ self.height - 1 ] [ self.width ] * self.p [ self.width - 1 ] * self.p [ self.w - 1 ]
            res %= mod
            if self.width > 1 :
                res += self.dp [ self.height - 1 ] [ self.width - 1 ] * self.p [ self.width - 2 ] * self.p [ self.w - 1 ]
                res %= mod
            if self.width < self.w :
                res += self.dp [ self.height - 1 ] [ self.width + 1 ] * self.p [ self.width - 1 ] * self.p [ self.w - 1 - self.width ]
                res %= mod
            return res
return Main
