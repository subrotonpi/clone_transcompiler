def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.s , self.t , self.w , self.a , self.b = sys.stdin.read ( ).decode ( ).strip ( ).split ( ' ' )
    def __init__ ( self ) :
        self.n , self.s , self.t , self.w = self.s , self.t , self.w
        self.a = 0
        if self.s <= self.w <= self.t :
            self.a += 1
        for i in range ( 1 , self.n - 1 ) :
            self.b = self.b
            self.w = self.w + self.b
            if self.s <= self.w <= self.t :
                self.a += 1
        print ( self.a )
