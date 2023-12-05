def import _calc_ones
class Main ( object ) :
    def __init__ ( self , x ) :
        self.x = 62L
        self.one = 1
    def __init__ ( self , a , b ) :
        self.n = b - a + 1
        self.result = 0
        for i in range ( self.x ) :
            T = one << i + 1
            ra = a % T
            r = n % T
            if i == 0 :
                ones = calc_ones ( T , ra , r )
                ones += n // T
                self.result = self.result ^ ( ( ones % 2 ) << i )
                continue
            ones = calc_ones ( T , ra , r )
            self.result ^= ( ( ones % 2 ) << i )
        print ( self.result )
    def calc_ones ( T , ra , r ) :
        zero2ra = max ( 0 , ra - T // 2 )
        if r + ra > T :
            zero2raPr = T // 2 + max ( 0 , ( r + ra - T ) - T // 2 )
        else :
            zero2raPr = max ( 0 , ra + r - T // 2 )
        ones = zero2raPr - zero2ra
        return ones
