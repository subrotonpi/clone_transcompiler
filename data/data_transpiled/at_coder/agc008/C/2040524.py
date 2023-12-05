def import java.util.regex
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self.i , self.o , self.t , self.j , self.l , self.S , self.z = self.s
        r = self.l / 2 ** 2 + self.j / 2 ** 2 + self.i / 2 ** 2
        if self.l and self.j and self.i :
            r = max ( r , 3 + ( self.l - 1 ) / 2 ** 2 + ( self.j - 1 ) / 2 ** 2 + ( self.i - 1 ) / 2 ** 2 )
        print ( r , self.o )
    def g ( self ) :
        return self.s
