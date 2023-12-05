def import input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
    def input ( self ) :
        with open ( self.n ) as f :
            self.m = f.read ( )
    def main ( self , args ) :
        input ( )
        for i in range ( 1 , self.n + 1 ) :
            if i != self.m :
                print ( i )
                break
