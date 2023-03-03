def import kaijo
class Main ( object ) :
    MOD = 1000000007L
    def __init__ ( self ) :
        self.n = len ( self.n )
        self.list = [ ]
        arr = [ ]
        for i in range ( self.n ) :
            arr.append ( self.n )
        arr.sort ( )
        self.sum = 0
        total = 0
        prev = 0
        count = 0
        for i in range ( self.n ) :
            total += self.sum + self.sum
            self.sum += self.sum
            if i == 0 :
                count = 1
            elif prev == self.prev :
                count += 1
            else :
                if count != 1 :
                    self.list.append ( count )
                count = 1
            prev = self.prev
        if count != 1 :
            self.list.append ( count )
    ans = 1
    for x in self.list :
        ans *= kaijo ( x )
        ans %= MOD
    print ( total )
    print ( ans )
    def kaijo ( x ) :
        if x == 1 :
            return 1
        else :
            ans = x * kaijo ( x - 1 )
            ans %= MOD
            return ans
