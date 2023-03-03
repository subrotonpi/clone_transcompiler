def import _main
import sys
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self , H , W , K ) :
        self.H = H
        self.W = W
        self.K = K
        self.dp = [ [ 110 ] * 10 ] * 110
        self.ans = 0
        self.n = 0
    def main ( ) :
        sc = sys.stdin
        n = sc.read ( )
        data = [ ]
        for i in range ( 2 , n + 1 ) :
            flag = True
            for j in range ( 2 , 2 * i + 1 ) :
                if i % j == 0 :
                    flag = False
                    break
            if flag :
                data.append ( i )
        data = [ ]
        p = 0
        while True :
            if n == 0 :
                break
            x = n
            p = 0
            while True :
                if x == 1 :
                    break
                if x % data [ p ] == 0 :
                    data [ p ] += 1
                    x /= data [ p ]
                else :
                    p += 1
            n -= 1
        c75 = c25 = c15 = c5 = c3 = 0
        for i in data :
            if i >= 2 :
                c3 += 1
            if i >= 4 :
                c5 += 1
            if i >= 14 :
                c15 += 1
            if i >= 24 :
                c25 += 1
            if i >= 74 :
                c75 += 1
        ans = 0
        self.ans += c75 + c25 * ( c3 - 1 ) + c15 * ( c5 - 1 ) + ( c5 * ( c5 - 1 ) / 2 ) * ( c3 - 2 )
        print ( ans )
class Pair ( object ) :
    from operator import itemgetter
    def from_key ( self , key ) :
        return self.end
    def num ( self , other ) :
        return self.num
    def bango ( self , other ) :
        return self.bango
return Main ( )
