def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = Main ( )
    def run ( self ) :
        self.n = int ( self.n )
        a = int ( self.a )
        b = int ( self.b )
        if a + b > n + 1 :
            print ( - 1 )
            return
        if long ( a ) * b < n :
            print ( - 1 )
            return
        x ( a , b , n )
    def x ( self , a , b , n ) :
        z = self.n
        res = [ ]
        for ind in range ( n ) :
            x = int ( min ( long ( a ) * ( b - 1 ) + 1 , z ) )
            for y in range ( x , z + 1 ) :
                res.append ( y )
                ind += 1
            b -= 1
            z = x - 1
        for i in range ( n - 1 ) :
            print ( i , end = ' ' )
        print ( res [ n - 1 ] )
