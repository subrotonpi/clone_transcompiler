def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def main ( self ) :
        self.n = self.n
        self.m = self.m
        student = [ ( self.n , self.m ) for i in range ( self.n ) ]
        check_point = [ ( self.n , self.m ) for i in range ( self.m ) ]
        for i in range ( self.n ) :
            min_num = - 1
            min_value = sys.maxint
            for j in range ( self.m ) :
                d = calc_manhat_distance ( student [ i ] [ 0 ] , student [ i ] [ 1 ] , check_point [ j ] [ 0 ] , check_point [ j ] [ 1 ] )
                if d < min_value :
                    min_value = d
                    min_num = j
            print ( min_num + 1 )
    def calc_manhat_distance ( self , x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calc_euclid_distance ( self , x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
class Point ( object ) :
    def __init__ ( self , a , b ) :
        self.x = a
        self.y = b
    def getX ( self ) :
        return self.x
    def getY ( self ) :
        return self.y
    def setX ( self , n ) :
        self.x = n
        self.y = n
    def setY ( self , n ) :
        self.x = n
        self.y = n
