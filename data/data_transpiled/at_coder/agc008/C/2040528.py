def import _main
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self.i , self.o , self.t , self.j , self.l , self.r = self.s.get ( 'r' ) , self.s.get ( 'o' ) , self.s.get ( 't' ) , self.s.get ( 'j' ) , self.s.get ( 'l' ) , self.s.get ( 'r' )
        if self.l and self.j and self.i :
            self.r = max ( self.r , 3 + ( self.l - 1 ) / 2 ** 2 + ( self.j - 1 ) / 2 ** 2 + ( self.i - 1 ) / 2 ** 2 )
        print ( self.r , self.o )
    def g ( self ) :
        return self.s.get ( 'r' ) , self.s.get ( 'r' ) , self.s.get ( 'r' )
