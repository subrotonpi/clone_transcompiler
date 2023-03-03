def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.A = int ( self.A )
        self.B = int ( self.B )
        self.h = [ ]
        max = 0
        for i in range ( 1 , self.n + 1 ) :
            self.h.append ( _main ( self.h [ i ] ) )
            max = max ( max , self.h [ i ] )
        lo = 0
        hi = ( max - 1 ) // B + 1
        while hi - lo > 1 :
            mid = ( hi + lo ) // 2
            if self.check ( mid ) :
                hi = mid
            else :
                lo = mid
        print ( hi )
    def check ( self , target ) :
        cnt = 0
        for i in range ( 1 , self.n + 1 ) :
            temp = self.h [ i ] - target * B
            if temp > 0 :
                cnt += ( temp - 1 ) / ( A - B ) + 1
            if cnt > target :
                return False
        return True
