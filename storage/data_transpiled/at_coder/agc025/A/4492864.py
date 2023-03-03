def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.stdout.close ( )
        min = 10 ** self.N
        for A in range ( 1 , self.N // 2 + 1 ) :
            B = self.N - A
            min = min ( min , self.digits_sum ( A ) + self.digits_sum ( B ) )
        print ( min )
    def digits_sum ( n ) :
        ret = 0
        s = str ( n )
        for i in s :
            ret += int ( i )
        return ret
