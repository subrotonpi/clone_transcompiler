def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = [ ]
            for i in range ( 4 ) :
                self.n.append ( i )
        def __init__ ( self ) :
            self.c = [ ]
        def s ( self ) :
            self.a = 0
            error = True
            for i in range ( self.n [ 1 ] ) :
                aa = self.n [ i ]
                if self.n [ 0 ] <= self.n [ 2 ] :
                    self.n [ 0 ] += self.n [ 3 ]
                if aa > self.n [ 0 ] :
                    error = False
                    self.a = i + 1
                    break
                self.n [ 0 ] -= aa
            print ( ( "complete" , a ) )
