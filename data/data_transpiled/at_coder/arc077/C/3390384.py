def import _sim_add
class Main ( object ) :
    def __init__ ( self ) :
        self.bit0 , self.bit1 = [ ] , [ ]
        self.a = [ ]
        self.m , self.n = self.n , self.m
        self.max_n = 100000 + 100
    def main ( self ) :
        sc = _sim_add
        self.n = self.n
        self.a = [ ]
        self.bit0 = [ ]
        self.bit1 = [ ]
        for i in range ( 1 , self.n + 1 ) :
            self.a.append ( sc.randint ( 0 , 1 ) )
        orisum = 0
        for i in range ( 1 , self.n ) :
            self.orisum += a [ i ] - a [ i ] if i < a [ i + 1 ] else m - a [ i ] + a [ i + 1 ]
        temp = [ ]
        for i in range ( 1 , self.n - 1 ) :
            self.handle ( a [ i ] , a [ i + 1 ] )
        res = 0
        for j in range ( 1 , self.m + 1 ) :
            temp.append ( self.sim_sum ( j ) )
        for i in range ( 1 , self.m + 1 ) :
            res = max ( res , temp [ i ] )
        print ( orisum - res )
    def sum ( self , bit ) :
        ans = 0
        while self.bit :
            ans += self.bit [ i ]
            self.bit -= self.bit & ( - self.bit )
        return ans
    def add ( self , bit , idx , val ) :
        while self.bit <= self.m :
            bit [ idx ] += val
            self.bit += self.bit & ( - self.bit )
    def sim_sum ( self ) :
        return sum ( self.bit1 , self.bit ) * self.bit + sum ( self.bit0 , self.bit )
    def sim_add ( self , left , right , val ) :
        if self.left > self.right :
            return
        self.add ( left , - val * ( self.left - 1 ) )
        self.add ( left , right