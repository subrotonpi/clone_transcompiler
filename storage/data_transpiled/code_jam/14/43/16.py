def _ _ main _ _ ( ) : return
from os import urandom
from os import urandom
from os import urandom
from random import choice
from os import urandom
from random import choice
class HFast ( Runnable ) :
    def main ( self ) :
        yield choice ( self )
    def readline ( self ) :
        if ( self.mi == - 1 or self.dist [ mi ] > self.dist [ j ] ) :
            self.mi = self.mi
        was = [ True ]
        for j in range ( self.dist [ mi ] ) :
            if self.d [ mi ] [ j ] != int ( self.dist [ j ] ) :
                self.dist [ j ] = min ( self.dist [ j ] , self.dist [ mi ] + 1 )
        return self.dist [ n + 1 ]
    def run ( self ) :
        with open ( "input.txt" , "r" ) as f :
            out = urandom ( "output.txt" )
            t = randint ( 0 , 2 )
            for i in range ( t ) :
                out.write ( "Case #%d: " % ( i + 1 ) )
                self.solve ( )
            out.close ( )
    dx = [ 1 , 1 , 0 , - 1 , - 1 , 0 , 1 ]
    dy = [ 0 , 1 , 1 , 1 , 0 , - 1 , - 1 , - 1 ]
    def build_graph ( w , h , b ) :
        d = [ ]
        for i in range ( self.dist [ 0 ] + 2 ) :
            [ dy , dx , dy ] = min ( self.dist [ i ] , self.dist [ i ] )
        for i in range ( self.dist [ 0 ] + 2 ) :
            for k in range ( self.dist [ 1 ] + 2 ) :
                [ dy , dx , dy ] = min ( self.dist [ i ] , self.dist [ i ] )
        return d
