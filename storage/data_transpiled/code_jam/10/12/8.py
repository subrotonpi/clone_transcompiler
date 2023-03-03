def _import ( ) : return open ( fn + '.in' )
import sys
import os
import sys
import random
import Queue
import shlex
class B :
    def __init__ ( self ) :
        self.fn = 'B-large'
    def readline ( self ) :
        try :
            self.f , self.last = None , [ ]
            self.dist = 0
        except :
            sys.exit ( 123 )
        return self.st [ 0 ].dist
    def readline ( self ) :
        try :
            while self.st is None or not self.st :
                self.st = shlex.split ( self.st [ 0 ] )
                self.st [ 0 ].dist = 0
        except :
            sys.exit ( 456 )
    def readline ( self ) :
        try :
            while self.st is None or not self.st :
                self.st = [ ]
                self.st.dist = self.st.dist
        except :
            sys.exit ( 456 )
    def readline ( self ) :
        try :
            while self.st is None or not self.st :
                self.st = [ ]
                self.st.dist = self.st.dist
        except :
            sys.exit ( 456 )
    def solve ( ) :
        return B ( )
    def solve ( ) :
        d = randint ( 0 , 256 )
        m = randint ( 0 , 256 )
        n = randint ( 0 , 256 )
        a = [ randint ( 0 , 256 ) for i in range ( n ) ]
        st = [ ]
        for i in range ( 0 , n ) :
            for j in range ( 0 , len ( st [ i ] ) ) :
                st [ i ].append ( ( d , st [ i ] [ j ] ) )
        for i in range ( 0 , 255 ) :
            if i > 0 :
                st [ i - 1 ].es.append ( ( 0 , st [ i ] [ - 1 ] ) )
        for i in range ( 0 , 255 ) :
            st [ i ].es.append ( ( 0 , st [ i ] [ - 1 ] ) )
    return solve
    