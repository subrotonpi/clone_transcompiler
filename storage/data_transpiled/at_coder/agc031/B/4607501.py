def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        num = sc.readline ( ).strip ( )
        color = [ sc.readline ( ).strip ( ) for i in range ( num ) ]
        index = np.arange ( 2 * int ( math.pow ( 10 , 5 ) ) + 10 )
        same = [ index [ color [ i ] ] - 1 for i in range ( num ) ]
        dp = [ 1 ]
        for i in range ( 1 , num ) :
            if color [ i - 1 ] == color [ i ] or same [ i ] < 0 :
                dp.append ( dp [ i - 1 ] )
            else :
                dp.append ( mod ( dp [ i - 1 ] + dp [ same [ i ] ] ) )
        print ( dp [ num - 1 ] )
    divisor = long ( math.pow ( 10 , 9 ) ) + 7
    def mod ( self , i ) :
        return self.i % divisor + ( ( self.i % divisor ) < 0 )
