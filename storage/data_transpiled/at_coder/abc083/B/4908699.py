def import import _dib_sum
class Main ( object ) :
    def __init__ ( self ) :
        sc = _dib_sum ( )
        n = sc.__next__ ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        ans = 0
        for i in range ( 0 , n ) :
            ds = self.digital_sum ( i )
            if a <= ds <= b :
                ans += i
        print ( ans )
    def digital_sum ( i ) :
        if i == 0 :
            return 0
        return i % 10 + digital_sum ( i / 10 )
