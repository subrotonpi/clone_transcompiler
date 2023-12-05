def import _main
class Main ( object ) :
    class Pair ( object ) :
        def __init__ ( self , x , y ) :
            self.x = min ( x , y )
            self.y = max ( x , y )
    def main ( ) :
        sc = _main ( )
        N = sc.count ( )
        v = [ ]
        min = sys.maxint
        max = sys.maxint
        for i in range ( N ) :
            v.append ( ( sc.randint ( min , max ) , sc.randint ( min , max ) ) )
            min = min ( v [ i ] [ 0 ] , sc.randint ( min , max ) )
            max = max ( v [ i ] [ 1 ] , sc.randint ( max , max ) )
        min1 = sum ( v [ 0 ] )
        max1 = min ( v [ 1 ] )
        min2 = sum ( v [ 2 ] )
        max2 = max ( v [ 2 ] )
        ans = ( max1 - min1 ) * ( max2 - min2 )
        v.sort ( key = lambda p1 : p1 [ 0 ] )
        mindiff = v [ N - 1 ] [ 0 ] - v [ 0 ] [ 0 ]
        min3 = sum ( v [ 3 ] )
        max3 = max ( v [ 3 ] )
        mindiff = min ( mindiff , max3 - min3 if i == N - 1 else max ( max3 , v [ N - 1 ] [ 0 ] ) - min ( min3 , v [ i + 1 ] [ 0 ] ) )
        ans = min ( ans , mindiff * ( max - min ) )
        print ( ans )
        sc.close ( )
