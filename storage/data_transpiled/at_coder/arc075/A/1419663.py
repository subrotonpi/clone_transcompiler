def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.sum = 0
        min = sys.maxint
        count = 0
        for i in range ( N ) :
            a = sys.maxint
            if a % 10 == 0 :
                count += 1
            self.sum += a
            if a % 10 != 0 :
                min = min ( min , a )
        if count == N :
            self.count = 0
            return
        if self.sum % 10 != 0 :
            self.count = sum
            return
        else :
            self.count = sum - min
            return
