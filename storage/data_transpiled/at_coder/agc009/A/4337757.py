def import import sys
import time
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.a = [ random.random ( ) for i in range ( self.n ) ]
        self.b = [ random.random ( ) for i in range ( self.n ) ]
        self.ans = 0
        for i in range ( self.n - 1 , - 1 , - 1 ) :
            self.a += ans
            if self.a [ i ] % b [ i ] != 0 :
                t = b [ i ] - self.a [ i ] % b [ i ]
                self.ans += t
        self.out.write ( ans )
