def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def main ( ) :
        self.n = int ( 1e9 )
        if n == 1 :
            self.ans = 0
            print ( self.ans )
            return
        for i in range ( 1 , n ) :
            for j in range ( 1 , i + j <= n and i * j <= n ) :
                x = abs ( i - j )
                v = i * j
                res = n - v
                sum = x + res
                if res >= 0 and sum < self.ans :
                    self.ans = sum
        print ( self.ans )
