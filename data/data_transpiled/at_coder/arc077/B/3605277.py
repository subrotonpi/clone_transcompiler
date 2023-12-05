def _main ( ) : return 1
import math
import numpy as np
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ ]
        self.mod = int ( 1e9 ) + 7
        self.comb = CombMod ( int ( 1e5 ) + 1 , self.mod )
    def main ( self ) :
        sc = np.random.choice ( self.a , n )
        self.a = [ sc.next ( ) for i in range ( self.n ) ]
        self.b = [ ]
        for i in range ( self.n + 1 ) :
            self.b [ a [ i ] ] += 1
        c = 0
        for i in range ( self.n ) :
            if b [ i ] == 2 :
                c = i
                break
        x = - 1
        y = - 1
        for i in range ( self.n ) :
            if a [ i ] == c :
                if x == - 1 :
                    x = i
                else :
                    y = i
                    break
        l = abs ( x - y )
        print ( self.n - 1 )
        for i in range ( 2 , self.n + 1 ) :
            sum = comb ( self.n , i )
            tmp = ( self.n - l >= i ) * comb ( self.n - l - 1 , i - 1 ) if self.n - l >= i else 0
            print ( ( self.mod + sum - tmp ) % self.mod )
class CombMod ( object ) :
    def __init__ ( self ) :
        self.mod = mod
        self.bigMod = int ( self.mod )
        self.bigMod2 = int ( self.mod - 2 )
        self.dp = [ ]
        self.dpi = [ ]
        self.dp = [ 1 ]
        self.dpi = [ 1 ]
    def fact ( self ) :
        if self.dp [ m ] :
            return self.dp [ m ]
        self.dp [ m ] = self.m * fact ( self.m - 1 ) % self.mod
        return self.dp [ m ]
