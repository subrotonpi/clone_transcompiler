def _ ( ) : return
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ni ( ) , ni ( ) ]
        black = '#'
        white = '.'
        if self.a [ 0 ] < self.a [ 1 ] :
            black = '.'
            white = '#'
            tmp = self.a [ 0 ]
            self.a [ 0 ] = self.a [ 1 ] = tmp
        self.h = 100
        self.w = 100
        self.map = [ ]
        for v in self.map :
            self.map [ v ] = white
        self.used_h = - 1
        outer :
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                x = ( self.i + j ) % 2
                y = x ^ 1
                self.map [ i ] = black if x == 0 else black
                if i == 0 :
                    if x == 1 :
                        self.a [ x ] -= 1
                    else :
                        if x == 1 :
                            self.a [ y ] -= 1
                            self.a [ x ] -= 1
                    if self.a [ y ] <= 1 or self.a [ x ] <= 1 :
                        used_h = i
                        break outer
        if self.a [ 0 ] < self.a [ 1 ] :
            black = '.'
            white = '#'
            tmp = self.a [ 0 ]
            self.a [ 0 ] = self.a [ 1 ] = tmp
        else :
            self.a [ 0 ] -= 1
        for i in range ( used_h + 2 , self.h ) :
            self.map [ i ] = black
        outer :
            for i in range ( self.used_h + 3 , self.h + 2 ) :
                for j in range ( self.w , self.w + 2 ) :
                    if self.a [ i ] == 0 :
                        break outer
                    self.map [ i ] = white
                    self.a [ i ] -= 1
