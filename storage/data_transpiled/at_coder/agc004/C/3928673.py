def _import ( ) : return sys.stdin.read ( )
import math
import string
import tokenize
import tokenize
import function
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.H , self.W = args
    def __init__ ( self , * args ) :
        self.H = int ( self.H )
        self.W = int ( self.W )
        self.A = [ ]
        for a in args :
            self.A.append ( next ( a ) )
    def write ( self , * args ) :
        self.B = [ ]
        for arg in args :
            if isinstance ( arg , int ) :
                self.A.append ( next ( arg ) )
            elif isinstance ( arg , float ) :
                self.A.append ( next ( arg ) )
            else :
                self.A.append ( next ( arg ) )
        self.solve ( )
        self.write ( self.A )
    def write ( self , * args ) :
        self.B = [ ]
        for h in range ( self.H ) :
            self.R.append ( '#' )
            self.R [ h ] [ - 1 ] = '.'
            self.B.append ( '#' )
        for h in range ( self.H ) :
            for w in range ( 1 , self.W - 1 ) :
                self.R [ h ] [ w ] = '#' if h % 2 == 0 else '.'
                self.B [ h ] [ w ] = '#' if w % 2 == 1 else '.'
        for h in range ( self.H ) :
            for w in range ( self.W ) :
                if self.A [ h ] [ w ] == '#' :
                    self.R [ h ] [ w ] = '#'
                    self.B [ h ] [ w ] = '#'
