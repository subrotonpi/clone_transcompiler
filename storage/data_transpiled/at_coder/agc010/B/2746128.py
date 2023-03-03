def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = [ ]
        sum = 0
        for i in range ( self.n ) :
            a.append ( self.a [ i ] )
            sum += a [ i ]
        onetime = self.n
        onetime *= self.n + 1
        onetime /= 2
        if sum % onetime != 0 :
            end ( )
        times = int ( sum / onetime )
        for i in range ( self.n ) :
            d = a [ ( i + 1 ) % self.n ] - a [ i ] - times
            if d > 0 or d % self.n != 0 :
                end ( )
        print ( "YES" )
    def end ( self ) :
        print ( "NO" )
        sys.exit ( )
    def main ( self ) :
        with open ( "/dev/null" , "r" ) as f :
            f.write ( "\n" )
