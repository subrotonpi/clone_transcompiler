def import datetime
class Main ( object ) :
    def __init__ ( self ) :
        self.y = int ( self.y )
        self.m = int ( self.m )
        self.d = int ( self.d )
        print ( self.get_days ( 2014 , 5 , 17 ) - self.get_days ( y , m , d ) )
    def get_days ( self , y , m , d ) :
        if m <= 2 :
            m += 12
            y -= 1
        return 365 * y + y // 4 - y // 100 + y // 400 + 306 * ( m + 1 ) // 10 + d - 429
