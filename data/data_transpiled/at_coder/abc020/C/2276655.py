def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w , self.t , self.s , self.g = self.s , self.t , self.s , self.g
        self.dx = [ 0 , 0 , - 1 , 1 ]
        self.dy = [ 1 , - 1 , 0 , 0 ]
    def __init__ ( self ) :
        sc = _main ( )
        self.h , self.w , self.t = sc.h , sc.w , sc.t
        self.c = [ ]
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if self.c [ i ] [ j ] == 'S' :
                    self.s = i * self.w + j
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if self.c [ i ] [ j ] == 'G' :
                    self.g = i * self.w + j
    self.l , self.r = 0 , t + 1
    while self.r - self.l > 1 :
        mid = ( self.l + self.r ) / 2
        gragh = [ ]
        for i in range ( self.h * self.w ) :
            for j in range ( self.h * self.w ) :
                if i == j :
                    gragh.append ( 0 )
                else :
                    gragh.append ( int ( g / 10 ) )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                for k in range ( 4 ) :
                    x = i + self.dx [ k ]
                    y = j + self.dy [ k ]
                    if 0 <= x < self.h and 0 <= y < self.w :
                        gragh [ i * self.w + j , x * self.w + y ] = mid if self.c [ x ] [ y ] == '#' else 1
return Main
