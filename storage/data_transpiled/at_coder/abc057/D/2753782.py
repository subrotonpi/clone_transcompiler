def import import _combinations
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.nums = [ random.random ( ) for i in range ( self.n ) ]
        self.nums.sort ( )
        sum = 0
        occurs = [ ]
        count = 0
        for i in range ( self.n - 1 , self.n - a , - 1 ) :
            sum += nums [ i ]
        sum /= a
        flag = True
        index = - 1
        if self.nums [ - 1 ] != self.nums [ - a ] :
            counts = 0
            for i in range ( self.n - 1 , - 1 , - 1 ) :
                if self.nums [ i ] == self.nums [ - a ] :
                    if flag :
                        index = i + 1
                        flag = False
                    counts += 1
            count = self.combinations ( counts , a - ( self.n - index ) )
        else :
            l = 0
            for i in range ( self.n - 1 , - 1 , - 1 ) :
                if self.nums [ i ] == self.nums [ - 1 ] :
                    l += 1
            for i in range ( self.a , self.b + 1 ) :
                if self.nums [ - 1 ] == self.nums [ - i ] :
                    count += self.combinations ( l , i )
        print ( sum )
        print ( count )
    def combinations ( self , n , k ) :
        ans = 1
        for i in range ( 1 , k + 1 ) :
            ans *= self.n - k + i
            ans /= i
        return ans
return Main
