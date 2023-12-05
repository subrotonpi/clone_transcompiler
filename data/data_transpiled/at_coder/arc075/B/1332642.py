def import import os , sys , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a , self.b = sys.stdin.read ( ).split ( '\n' )
        self.h = [ ]
    def f ( self ) :
        self.h.append ( sys.stdin.read ( ).split ( '\n' ) )
    def g ( self ) :
        self.n = int ( self.n )
        self.a , self.b = int ( self.a ) , int ( self.b )
        self.h = [ int ( self.h [ i ] ) for i in self.h ]
    def g ( self ) :
        low , high = 0 , int ( self.n / 2 )
        while high - low > 1 :
            mid = ( low + high ) / 2
            if self.f ( mid ) :
                high = mid
            else :
                low = mid
        print ( high )
    def g ( self ) :
        count = 0
        for i in range ( self.n ) :
            if self.h [ i ] - self.c * self.b > 0 :
                count += int ( math.ceil ( float ( ( self.h [ i ] - self.c * self.b ) ) / ( self.a - self.b ) ) )
        if self.DEBUG :
            print ( 'count = %d' % count )
        return count <= self.c
