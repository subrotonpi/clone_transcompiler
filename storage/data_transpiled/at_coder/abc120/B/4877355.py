def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
            print ( Divisor ( A , B , K ) )
    def Divisor ( a , b , k ) :
        ans = 0
        for i in range ( 100 , 0 , - 1 ) :
            if a % i == 0 and b % i == 0 :
                k -= 1
                ans = i
                if not k :
                    break
        return ans
