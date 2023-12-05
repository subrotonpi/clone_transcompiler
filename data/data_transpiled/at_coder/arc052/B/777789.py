def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.Q = self.N , self.Q
        self.ensui = [ [ ] for _ in range ( self.N ) ]
    def solve ( self , a , b ) :
        ans = [ ]
        for A , B in self._combinations ( [ a , b ] , 2 ) :
            ans.append ( self.solve ( A , B ) )
        for i in range ( self.Q ) :
            print ( ans [ i ] )
    def solve ( self , a , b ) :
        ans = 0
        for X , R , H in self._combinations ( [ a , b ] , 2 ) :
            if X + H <= a or b <= X :
                continue
            else :
                S = ( math.pi * R ** 2 * H ) / 3
                if X < a :
                    sum_s = S * pow ( ( float ( H - ( a - X ) ) ) / H , 3 )
                else :
                    sum_s = S
                ans += sum_s
                if b < X + H :
                    sub_s = S * pow ( ( float ( H + X - b ) ) / H , 3 )
                    ans -= sub_s
        return ans
