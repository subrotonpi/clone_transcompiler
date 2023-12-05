def import f
class Main ( object ) :
    def __init__ ( self ) :
        self.A = int ( self.A )
        self.B = int ( self.B )
        cnt = 0
        for i in range ( A , B + 1 ) :
            s = str ( i )
            c = s.split ( ' ' )
            x = self.f ( c )
            if x :
                cnt += 1
        print ( cnt )
        self.A = int ( self.A )
    def f ( self ) :
        x = 0
        l = len ( self.A ) - 1
        cnt = 0
        for i in range ( len ( self.A ) // 2 ) :
            if self.A [ i ] == self.A [ l - i ] :
                cnt += 1
        if cnt == len ( self.A ) // 2 :
            x = 1
        return x
