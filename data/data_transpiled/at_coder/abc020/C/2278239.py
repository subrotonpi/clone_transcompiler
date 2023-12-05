def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w , self.t = sys.argv [ 1 ]
        self.dx = [ 1 , - 1 , 0 , 0 ]
        self.dy = [ 0 , 0 , 1 , - 1 ]
        c = [ ]
        for i in range ( self.h ) :
            c.append ( i.split ( ' ' ) [ 0 ] )
        s , g = 0 , 0
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                if c [ i ] [ j ] == 'S' : s = i * self.w + j
                if c [ i ] [ j ] == 'G' : g = i * self.w + j
    l , r = 0 , t
    while r - l > 1 :
        mid = ( l + r ) // 2
        gragh = [ ]
        for i in range ( self.h * self.w ) :
            for j in range ( self.w ) :
                if i == j :
                    gragh.append ( 0 )
                else :
                    gragh.append ( long ( i / 10 ) )
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                for k in range ( 4 ) :
                    nx = i + self.dx [ k ]
                    ny = j + self.dy [ k ]
                    if 0 <= nx < self.h and 0 <= ny < self.w :
                        if c [ nx ] [ ny ] == '#' :
                            gragh [ i * self.w + j ] [ nx * self.w + ny ] = mid
                        else :
                            gragh [ i * self.w + j ] [ nx * self.w + ny ] = 1
        for k in range ( self.h * self.w ) :
            for i in range ( self.h ) :
                for j in range ( self.w ) :
                    if i == j :
                        gragh [ i * self.w + j ] = gragh [ i * self.w + j ]
        