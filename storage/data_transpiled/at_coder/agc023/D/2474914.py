def import import _sys , os , sys
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.N = self.N
        self.S = self.S
        self.x , self.p = [ ] , [ ]
        self.left , self.right = 0 , N - 1
        self.order = [ ]
        self.idx = 0
        while self.x [ left ] < S and self.x [ right ] < S :
            if self.p [ left ] >= self.p [ right ] :
                self.order.append ( self.x [ right ] )
                self.p [ left ] += self.p [ right ]
                self.right -= 1
            else :
                self.order.append ( self.x [ left ] )
                self.p [ right ] += self.p [ left ]
                self.left += 1
        while self.right >= 0 and self.S < self.x [ right ] :
            self.order.append ( self.x [ right ] )
            self.right -= 1
        while self.left < N and self.x [ left ] < S :
            self.order.append ( self.x [ left ] )
            self.left += 1
    ans = 0
    for i in range ( N - 1 , - 1 , - 1 ) :
        ans += abs ( self.order [ i ] - S )
        S = self.order [ i ]
    print ( ans )
