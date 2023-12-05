def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.L = 0
        self.b = [ ]
        self.a = [ ]
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            self.L = f.read ( )
            self.b = [ ]
            self.a = [ ]
            for i in range ( self.L ) :
                self.b.append ( f.read ( ) )
    def main ( self , args ) :
        self.input ( )
        flag = True
        xor = self.b [ 0 ] ^ self.b [ 1 ]
        for i in range ( 2 , self.L - 1 ) :
            xor = xor ^ self.b [ i ]
        if self.L == 2 and self.b [ 0 ] != self.b [ 1 ] :
            print ( - 1 )
            flag = False
        if self.L != 2 and self.b [ - 1 ] != xor :
            print ( - 1 )
            flag = False
        if flag :
            self.a [ 0 ] = 0
            print ( self.a [ 0 ] )
            for i in range ( 1 , self.L ) :
                self.a [ i ] = self.a [ i - 1 ] ^ self.b [ i - 1 ]
                print ( self.a [ i ] )
