def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.W = 1
            self.B = 2
        def __call__ ( self , * args ) :
            sc = sys.stdin
            self.H = sc.__next__ ( )
            self.W = sc.__next__ ( )
            self.field = [ [ 0 ] * self.W for _ in range ( self.H ) ]
    for y , s in enumerate ( sys.stdin ) :
        for x in range ( self.W ) :
            if self.field [ y ] [ x ] == '#' :
                ans = False
                break
        if not ans :
            print ( 'possible' )
            for y , x in enumerate ( sys.stdin ) :
                if self.field [ y ] [ x ] == '.' :
                    self.before [ y ] [ x ] = '.' if self.field [ y ] [ x ] == '#' else '#'
        else :
            print ( 'impossible' )
