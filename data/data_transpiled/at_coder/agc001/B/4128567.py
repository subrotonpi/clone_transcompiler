def import import _sys
class Main ( object ) :
    def solve ( self , N , X ) :
        long_edge = max ( X , N - X )
        short_edge = min ( X , N - X )
        length = X + N - X
        times = 1
        while short_edge > 0 :
            num = long_edge / short_edge
            left = long_edge - ( short_edge * num )
            length += ( short_edge * num * 2 )
            long_edge = short_edge
            short_edge = left
            times += 1
        length -= long_edge
        return length
    def solve ( self , N , X ) :
        self.N = N
        self.X = X
        self.times = times
        return self.times
