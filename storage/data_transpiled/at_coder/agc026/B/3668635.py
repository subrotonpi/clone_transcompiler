def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self._main = _main
    def main ( self ) :
        for t in range ( self._main.time ) :
            a , b , c , d = self._main.get ( t )
            if a < b or d < b :
                self.pl ( "No" )
                continue
            if c >= b :
                self.pl ( "Yes" )
                continue
            g = gcd ( b , d )
            a %= b
            max = g * ( ( b - a ) / g ) + a
            if max >= b :
                max -= g
            if max > c :
                self.pl ( "No" )
            else :
                self.pl ( "Yes" )
    def pl ( self ) :
        print ( self )
    def gcd ( a , b ) :
        if a < b :
            b %= a
        while b :
            a %= b
            if not a :
                return b
            b %= a
        return a
