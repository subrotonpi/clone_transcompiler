def import _main
class Main ( object ) :
    MOD = 1000000007L
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        self.n = Scanner ( ).__next__ ( )
        self.k = Scanner ( ).__next__ ( )
        if self.n > k :
            self.dp = [ ]
            print ( self.combination ( self.n + self.k - 1 , self.k ) )
        else :
            self.dp = [ ]
            print ( self.combination ( self.n , self.k % self.n + 1 ) )
    def combination ( self , left , right ) :
        if right > self.left - right :
            return self.combination ( self.left , self.left - right )
        if right == 0 :
            return 1
        if right == 1 :
            return self.left
        if self.dp [ self.left ] [ right ] != 0 :
            return self.dp [ self.left ] [ right ]
        val = self.combination ( self.left - 1 , self.right ) + self.combination ( self.left - 1 , self.right - 1 )
        val %= self.MOD
        self.dp [ self.left ] [ right ] = val
        return val
