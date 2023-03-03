def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
    def __init__ ( self ) :
        self.h , self.w = self.h , self.w
    def __repr__ ( self ) :
        return "#%s\n" % self.__name__
    def __call__ ( self ) :
        tmp = "".join ( [ "#%s" % i for i in range ( self.h + 2 ) ] )
        sys.stdout.write ( tmp )
        sys.stdout.write ( "\n".join ( [ "#%s" % i for i in range ( self.h ) ] ) )
