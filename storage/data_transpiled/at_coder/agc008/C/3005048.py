def import __main__
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.i = sc.__next__ ( )
        self.o = sc.__next__ ( )
        self.t = sc.__next__ ( )
        self.j = sc.__next__ ( )
        self.l = sc.__next__ ( )
        self.s = sc.__next__ ( )
        self.z = sc.__next__ ( )
        ans1 = self.o
        ans1 += ( self.i // 2 ) * 2
        ans1 += ( self.j // 2 ) * 2
        ans1 += ( self.l // 2 ) * 2
        ans1 += 3 * ( ( self.i % 2 ) * ( self.j % 2 ) * ( self.l % 2 ) )
        ans2 = self.o
        if self.i >= 1 and self.j >= 1 and self.l >= 1 :
            ans2 += 3
            self.i -= 1
            self.j -= 1
            self.l -= 1
        ans2 += ( self.i // 2 ) * 2
        ans2 += ( self.j // 2 ) * 2
        ans2 += ( self.l // 2 ) * 2
        print ( max ( ans1 , ans2 ) )
