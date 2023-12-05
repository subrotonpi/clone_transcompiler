def import math
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
        self.count = 0
        self.t = 0
        self.t = abs ( a - b )
        if self.t > 10 :
            self.count = self.t // 10
            self.t = self.t % 10
        if self.t > 7 :
            self.count += abs ( self.t - 10 ) + 1
            self.t = 0
        if self.t > 3 :
            self.count += abs ( self.t - 5 ) + 1
        else :
            self.count += t
        print ( self.count )
