def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.D = [ ]
        self.J = [ ]
    def input ( self ) :
        with open ( self.D , 'r' ) as f :
            for i in range ( 7 ) :
                self.D.append ( f.read ( ) )
        for i in range ( 7 ) :
            self.J.append ( f.read ( ) )
    def main ( self , args ) :
        self.input ( )
        ans = 0
        for i in range ( 7 ) :
            if self.D [ i ] >= self.J [ i ] :
                ans += self.D [ i ]
            else :
                ans += self.J [ i ]
        print ( ans )
