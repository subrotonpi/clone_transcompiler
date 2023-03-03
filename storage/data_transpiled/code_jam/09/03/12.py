def import _main
class Welcome ( object ) :
    def __init__ ( self , current ) :
        self.current = [ ]
    def inc ( self , index ) :
        self.current.append ( ( self.current [ index ] + 1 ) % 10000 )
    def move ( self , index ) :
        self.current.append ( ( self.current [ index ] + self.current [ index + 1 ] ) % 10000 )
    def solve ( self , line ) :
        wel = "welcome to code jam"
        length = len ( wel )
        self.current = [ ]
        for c in line :
            for j in range ( length ) :
                if c == self.wel [ j ] :
                    if j > 0 :
                        move ( j - 1 )
                    else :
                        inc ( j )
        return self.current [ length - 1 ]
    def main ( self , args ) :
        with open ( "src/C-large.in" , "r" ) as f :
            with open ( "output" , "w" ) as f :
                n = int ( f.readline ( ) )
        for i in range ( n ) :
            line = f.readline ( )
            result = solve ( line )
            f.write ( "Case #%d: " % ( i + 1 ) )
            if result < 1000 :
                f.write ( "0" )
            if result < 100 :
                f.write ( "0" )
            if result < 10 :
                f.write ( "0" )
            f.write ( "%.8f" % result )
            f.write ( "\n" )
