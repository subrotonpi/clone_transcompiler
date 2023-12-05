def _import ( ) :
    from itertools import count , repeat
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.h , self.w , self.t , self.s , self.g , self.l , self.r = args
            c = [ ]
            def __int__ ( self ) :
                for i in range ( self.h ) :
                    for j in range ( self.w ) :
                        if c [ i ] [ j ] == 'S' : s = i * self.w + j
                        if c [ i ] [ j ] == 'G' : g = i * self.w + j
            while self.r - self.l > 1 :
                mid = ( self.l + self.r ) // 2
                gragh = [ [ 0 if i == j else 0x7fffffffffffffff , 0 if i == j else 1 for i in range ( self.h * self.w ) ] for j in range ( self.w ) ]
                for i in range ( self.h ) :
                    for j in range ( self.w ) :
                        for k in range ( 4 ) :
                            nx = i + ( [ 1 , - 1 , 0 , 0 ] ) [ k ]
                            ny = j + ( [ 0 , 0 , 1 , - 1 ] ) [ k ]
                            if 0 <= nx < self.h <= self.w <= self.h <= self.w :
                                gragh [ i * self.w + j , nx * self.w + ny ] = mid if self.h [ j ] [ k ] == '#' else 1
    count ( 1 )
