def import _main
class Main ( object ) :
    class BIT ( object ) :
        def __init__ ( self , N ) :
            self.L = 1
            while self.L < N :
                self.L <<= 1
            self.min = [ ]
            self.min.append ( int ( self.min [ 0 ] ) )
        def set ( self , x , v ) :
            p = self.L - 1 + x
            self.min.append ( v )
            while p > 0 :
                p = ( p - 1 ) // 2
                self.min [ p ] = min ( self.min [ p * 2 + 1 ] , self.min [ p * 2 + 2 ] )
        def getMin ( self , a , b ) :
            return self.getMin ( a , b , 0 , L , 0 )
        def getMin ( self , a , b , l , r , idx ) :
            if r <= a or b <= l : return int ( self.min [ idx ] )
            elif a <= l and r <= b : return self.min [ idx ]
            else : return min ( self.getMin ( a , b , l , ( l + r ) // 2 , idx * 2 + 1 ) , self.getMin ( a , b , ( l + r ) // 2 , r , idx * 2 + 2 ) )
    def main ( self ) :
        with open ( "/proc/input.txt" , "r" ) as sc :
            N , E , T = sc.read ( ).split ( "\n" )
            x = [ int ( self.min [ 0 ] ) for self in sc ]
            dp = [ ]
            bit = BIT ( N + 1 )
            bit [ 0 ] = E + ( E - x [ 1 ] ) * 2
            j = 0
            for i in range ( 1 , N + 1 ) :
                while ( x [ i ] - x [ j + 1 ] ) * 2 > T :
                    j += 1
                min = bit [ 0 : j ]
                dp [ i ] = min ( min - ( E - x [ i ] ) * 3 , dp [ j ] + x [ i ] - x [ j ] + T )
                if i < N :
                    bit [ i ] = dp [