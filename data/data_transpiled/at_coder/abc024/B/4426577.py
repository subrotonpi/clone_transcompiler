def _import ( ) : return _import ( )
class Main ( object ) :
    def solve ( self ) :
        n , t = randint ( 0 , 256 )
        ar = next_int ( n )
        ans = 0
        for i in range ( n - 1 ) :
            ans += min ( t , ar [ i + 1 ] - ar [ i ] )
        self.write ( ans + t )
    def nextDouble ( self ) :
        return float ( next ( self ) )
    def nextchar ( self ) :
        return lambda x : x
    def nextint ( self ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( next ( self ) )
        self.write ( ''.join ( ar ) )
    def nextchar ( self ) :
        return lambda x : x
    def nextint ( self ) :
        return lambda x : x
    def maxint ( self ) :
        return maxint , lambda x : x
    def minint ( self ) :
        return lambda x : x
    def pi ( self ) :
        return pi
    def mod ( self ) :
        return 1000000007
    def max ( self , * args ) :
        ar = [ ]
        for i in range ( 1 , n ) :
            ar.append ( ( self.read ( i ) , self.read ( i ) ) )
        return ar
    def calcManhat_distance ( self , x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calcEuclid_distance ( self , x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
    def isPrime ( self ) :
        if self.n == 2 :
            return True
        else :
            p = 0
            try :
                length = self.read ( 1024 )
            except :
                pass
            if not length :
                return False
            return True
    def printChar2DArray ( self ) :
        for i in range ( 1 , 1024 ) :
            for j in range ( 2 , 1024 ) :
            INDENT