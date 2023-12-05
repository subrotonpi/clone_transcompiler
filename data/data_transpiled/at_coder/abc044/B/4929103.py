def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __init__ ( self ) :
        self.chars = [ 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' ]
        self.str = self.sc.next ( )
        for i in range ( 26 ) :
            if ( len ( self.str ) - len ( self.str.rstrip ( chars [ i ] ) ) ) % 2 == 1 :
                self.print ( 'No' )
                return
        self.print ( 'Yes' )
