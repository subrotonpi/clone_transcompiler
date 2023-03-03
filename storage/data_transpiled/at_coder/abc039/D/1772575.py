def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = self.h , self.w
        s = [ s.split ( '' ) [ 0 ] for s in self.s ]
        a = [ [ 1 ] for s in [ s.split ( '' ) [ 0 ] for s in self.a ] ]
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if s [ i ] [ j ] == '.' :
                    for dx in [ - 1 , 1 ] :
                        for dy in [ - 1 , 1 ] :
                            x = i + dx
                            y = j + dy
                            if x >= 0 and x < self.h and y >= 0 and y < self.w :
                                a [ x ] [ y ] = 0
    b = [ [ '.' ] for s in [ s.split ( '' ) [ 0 ] for s in self.b ] ]
    for i in range ( self.h ) :
        if a [ i ] [ j ] == 1 :
            for dx in [ - 1 , 1 ] :
                for dy in [ - 1 , 1 ] :
                    x = i + dx
                    y = j + dy
                    if x >= 0 and x < self.h and y >= 0 and y < self.w :
                        b [ x ] [ y ] = '#'
    for i in range ( self.h ) :
        if not s [ i ] == [ '.' ] :
            print ( 'impossible' )
            return
        print ( 'possible' )
        for i in range ( self.h ) :
            r = [ '#' if a [ i ] [ j ] == 1 else '.' ]
            print ( ''.join ( r ) )
