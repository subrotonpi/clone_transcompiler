def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
    def __init__ ( self ) :
        self.h , self.w = self.h , self.w
    def __repr__ ( self ) :
        return '<%s>' % repr ( self.h )
    def __call__ ( self ) :
        return '<%s>' % repr ( self.w )
    def __init__ ( self ) :
        self.c = [ ]
        for i in range ( self.h + 2 ) :
            if i in [ 0 , 1 ] :
                for j in range ( self.w + 2 ) :
                    self.c.append ( [ '#' ] * ( self.w + j ) )
            else :
                s = self.s
                self.c.append ( [ '#' ] * ( self.w + 1 ) )
                for j in range ( 1 , self.w + 1 ) :
                    self.c [ i ].append ( s [ j - 1 ] )
        for i in self.c :
            for j in i :
                print ( j , end = ' ' )
            print ( )
