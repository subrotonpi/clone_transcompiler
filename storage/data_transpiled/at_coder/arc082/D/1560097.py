def import _readline
import sys
class Main ( object ) :
    def submit ( self ) :
        x = randint ( 0 , len ( sys.stdin ) )
        k = randint ( 0 , len ( sys.stdin ) )
        flip = [ ]
        for i in range ( k ) :
            flip.append ( int ( sys.stdin.readline ( ) ) )
        return long ( sys.stdin.readline ( ) )
    def uniform ( x , q ) :
        return float ( sys.stdin.readline ( ) )
    def func ( x ) :
        dir = - 1
        ptr = 0
        cur_t = 0
        while q :
            t = randint ( 0 , q )
            qx = randint ( 0 , q )
            while ptr < k and flip [ ptr ] <= t :
                func ( flip [ ptr ] - cur_t , dir )
                cur_t = flip [ ptr ]
                dir *= - 1
                ptr += 1
            func ( t - cur_t , dir )
            cur_t = t
            print ( func ( qx ) , file = sys.stdout )
    class Function ( object ) :
        def __init__ ( self , x ) :
            self.flip_x = flip_y = 0
            self.X = x
        def __getitem__ ( self , x ) :
            if x <= flip_x :
                return flip_y
            if x >= flip_x + self.X :
                return flip_y + self.X
            return flip_y + self.X - self.X
        def modify ( self , dist , dir ) :
            self.flip_y += dist * dir
            if self.flip_y + self.X <= 0 :
                self.flip_x = flip_y = self.X = 0
                return
            if self.flip_y >= self.X :
                self.flip_x = self.X = self.X = 0
                self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X = self.X )
    def pre_calc ( self ) :
        pass
    def stress ( self ) :
        pass
    def test ( self )