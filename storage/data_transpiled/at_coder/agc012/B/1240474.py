def _import ( ) : return sys.stdin.read ( 2048 )
import io
import sys
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.N , M , Q = randint ( 0 , 256 ) , randint ( 0 , 256 ) , randint ( 0 , 256 )
        self.a = [ ]
        self.b = [ ]
        for i in range ( M ) :
            self.a.append ( randint ( - 1 , 1 ) )
            self.b.append ( randint ( - 1 , 1 ) )
        for i in range ( N ) :
            self.a.append ( i )
            self.b.append ( i )
        self.Q = randint ( 0 , Q )
        self.v = [ ]
        self.d = [ ]
        self.c = [ ]
        dp = [ [ ] for i in range ( Q ) ]
        for i in range ( 10 , 1 , - 1 ) :
            for j in range ( M + N ) :
                self.dp [ i - 1 ] [ b [ j ] ] = max ( self.dp [ i - 1 ] [ b [ j ] ] , self.dp [ i ] [ a [ j ] ] )
                self.dp [ i - 1 ] [ a [ j ] ] = max ( self.dp [ i - 1 ] [ a [ j ] ] , self.dp [ i ] [ b [ j ] ] )
        for i in range ( N ) :
            self.out.write ( self.c [ dp [ 0 ] [ i ] ] )
    def main ( self ) :
        sys.stdout.flush ( )
        with io.open ( self.out , 'w' ) as f :
            buffer = f.read ( 2048 )
            self.p = 0
            self.buflen = 0
