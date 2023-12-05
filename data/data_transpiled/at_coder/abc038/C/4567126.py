def import import sys , string , traceback
from itertools import repeat
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.N = sys.stdin.read ( )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.read ( ) )
        print ( func ( self.N , a ) )
    def func ( self , a ) :
        if self.N == 1 :
            return 1
        l = r = 1
        cnt = self.N
        while r < N :
            while r < N and a [ r ] > a [ r - 1 ] :
                r += 1
            lst = r - l
            cnt += lst * ( lst - 1 ) / 2
            l = r
            r += 1
        return cnt
