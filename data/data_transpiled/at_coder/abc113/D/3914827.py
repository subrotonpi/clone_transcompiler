def import _main
import sys
import os
import sys
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __init__ ( self ) :
        self.H , self.W , self.K = self.H , self.W , self.K
    def main ( self ) :
        with open ( "/proc/self/" , "r" ) as f :
            self.H = int ( f.read ( ) )
            self.W = int ( f.read ( ) )
            self.K = int ( f.read ( ) ) - 1
    def main ( self ) :
        dp = [ ]
        for h in range ( 1 , self.H + 1 ) :
            for w in range ( self.W ) :
                for b in range ( ( 1 << ( self.W - 1 ) ) ) :
                    x = 3
                    flg = False
                    while x < 1 << 20 :
                        if ( x & b ) == x :
                            flg = True
                        x <<= 1
                    if flg :
                        continue
                    else :
                        if w > 0 and ( b & ( 1 << ( w - 1 ) ) ) :
                            self.dp [ h ] [ w ] += self.dp [ h - 1 ] [ w - 1 ]
                        elif w < self.W - 1 and ( b & ( 1 << w ) ) :
                            self.dp [ h ] [ w ] += self.dp [ h - 1 ] [ w + 1 ]
                        else :
                            self.dp [ h ] [ w ] += self.dp [ h - 1 ] [ w ]
                        self.dp [ h ] [ w ] %= self.MOD
        print ( self.dp [ H ] [ K ] )
    class Pair ( object ) :
        def __init__ ( self ) :
            from self.import Pair
            self.from = Pair
            self.end = Pair.Num
            self.num = Pair.Num
            self.bango = Pair.Bango
        def __init__ ( self ) :
            from self.import Pair
            self.from = Pair.Bango
            self.num = Pair.Num
            self.bango = Pair.Bango
    