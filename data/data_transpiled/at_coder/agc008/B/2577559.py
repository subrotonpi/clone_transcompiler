def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        a = [ ]
        for i in range ( self.n ) :
            a.append ( sys.stdin.read ( ) )
        sum1 = [ 0 ] * ( n + 1 )
        sum2 = [ 0 ] * ( n + 1 )
        sum1 [ 0 ] = 0
        sum2 [ 0 ] = 0
        for i in range ( 1 , self.n + 1 ) :
            sum1 [ i ] = sum1 [ i - 1 ] + a [ i - 1 ]
            sum2 [ i ] = sum2 [ i - 1 ] + max ( 0 , a [ i - 1 ] )
        ans = 0
        for i in range ( 0 , self.n - k ) :
            ans = max ( ans , max ( 0 , sum1 [ i + k ] - sum1 [ i ] ) + sum2 [ n ] - sum2 [ i + k ] + sum2 [ i ] )
        print ( ans )
    def main ( self ) :
        with open ( "/tmp/main.txt" , "r" ) as sc :
            eval ( sc )
