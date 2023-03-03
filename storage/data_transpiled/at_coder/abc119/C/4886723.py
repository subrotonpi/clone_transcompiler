def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.A , self.B , self.C = int ( math.pow ( 10 , 9 ) )
        self.INF = int ( math.pow ( 10 , 9 ) )
    def main ( self ) :
        sc = sys.stdin
        self.N , self.A , self.B , self.C = sc.read ( )
        self.l = [ sc.read ( ) for i in range ( self.N ) ]
        print ( self.dfs ( 0 , 0 , 0 , 0 ) )
    def dfs ( self , cur , a , b , c ) :
        if self.cur == self.N :
            if min ( a , b , c ) > 0 :
                return abs ( a - A ) + abs ( b - B ) + abs ( c - C ) - 30
            else :
                return INF
        ret0 , ret1 , ret2 , ret3 = self.dfs ( self.cur + 1 , a , b , c ) , self.dfs ( self.cur + 1 , a + self.l [ self.cur ] , b , c ) + 10 , self.dfs ( self.cur + 1 , a , b + self.l [ self.cur ] , c ) + 10 , self.dfs ( self.cur + 1 , a , b + self.l [ self.cur ] , c + self.l [ self.cur ] ) + 10
        return min ( ret0 , ret1 , ret2 , ret3 )
    def min ( self , * value ) :
        min = value [ 0 ]
        for i in value [ 1 : ] :
            if i < min :
                min = i
        return min
