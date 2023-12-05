def import import sys , string , traceback , logging
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.b , self.c , self.d , self.e , self.f = string , string , string , ''
        DEBUG = False
    def __init__ ( self ) :
        self.a = int ( sys.stdin.read ( ) )
        self.b = int ( sys.stdin.read ( ) )
        self.c = int ( sys.stdin.read ( ) )
        self.d = int ( sys.stdin.read ( ) )
        self.e = int ( sys.stdin.read ( ) )
        self.f = int ( sys.stdin.read ( ) )
        self.amount , sum = 100 * self.a , 0
        self.prob = - 1
        for i in range ( 0 , 100 * self.a ) :
            for j in range ( 0 , 100 * self.a ) :
                water = i * ( 100 * self.a ) + j * ( 100 * self.b )
                for k in range ( 0 , 100 * self.c + water ) :
                    r = f - ( k * self.c + water )
                    low , high = 0 , r // self.d + 1
                    while high - low > 1 :
                        mid = ( low + high ) // 2
                        s = k * self.c + mid * self.d
                        if water + s <= self.f or s * 100 <= self.e * water :
                            low = mid
                        else :
                            high = mid
                    sugar = k * self.c + low * self.d
                    if ( not water and not sugar ) or water + sugar > self.f or sugar * 100 > self.e * water :
                        continue
                    p = float ( sugar ) / float ( ( water + sugar ) )
                    if self.prob < p :
                        self.prob = p
                        self.amount , sum = sugar + water , sugar
                    if DEBUG :
                        print ( 'water = ' , water , 'sugar = ' , sugar )
                        print ( 'amount = ' , ( water + sugar ) )
                        print ( '%d %d %d' % (