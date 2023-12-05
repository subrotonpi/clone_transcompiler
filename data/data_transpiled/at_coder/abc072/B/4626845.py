def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.sys.argv = [ ]
    def __call__ ( self , * args , ** kwargs ) :
        with open ( self.sys.argv [ 1 ] , 'r' ) as f :
            line = f.read ( )
        yield line
        for ix , char in enumerate ( line ) :
            if ix % 2 == 0 :
                yield char
        print ( '\n'.join ( line ) )
