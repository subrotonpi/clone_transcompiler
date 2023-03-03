def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.w = [ ]
            self.h = [ ]
            self.w.append ( 0 )
            self.h.append ( 0 )
        def select ( self , x , y , a ) :
            self.w.append ( x )
            self.h.append ( y )
        def select ( self , x , y , a ) :
            self.n = [ ]
            for x , y , a in self.select ( x , y , a ) :
                if a == 1 :
                    if self.w [ 0 ] < x :
                        self.w [ 0 ] = x
                elif a == 2 :
                    if self.x < self.w [ 1 ] :
                        self.w [ 1 ] = x
                elif a == 3 :
                    if self.h [ 0 ] < y :
                        self.h [ 0 ] = y
                elif a == 4 :
                    if self.y < self.h [ 1 ] :
                        self.h [ 1 ] = y
                else :
                    pass
    sys.stdout.write ( "\n" )
    if self.w [ 1 ] > self.w [ 0 ] and self.h [ 1 ] > self.h [ 0 ] :
        print ( ( self.w [ 1 ] - self.w [ 0 ] ) * ( self.h [ 1 ] - self.h [ 0 ] ) )
    else :
        print ( 0 )
