def import import sys , string , recwarn
from os import urandom
from random import randint
class D ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.out = sys.stdout
    def solve ( self ) :
        n , l = select.select ( [ sys.stdin.readline ( ) ] , [ ] , [ ] , 0 )
        s = [ s [ i ] for i in range ( l ) ]
        bad = sys.stdin.read ( n )
        b = bad.split ( '' )
        for i in range ( n ) :
            if bad == s [ i ] :
                self.out.write ( 'IMPOSSIBLE' )
                return
        for i in range ( len ( b ) - 1 ) :
            self.out.write ( 1 )
        self.out.write ( 0 )
        self.out.write ( '' )
        for i in range ( len ( b ) ) :
            self.out.write ( '0?' )
        self.out.write ( '\n' )
    def run ( self ) :
        with open ( 'a.in' , 'r' ) as f :
            f.write ( '' )
            f.write ( '' )
        self.tn = randint ( 1 , 4 )
        for i in range ( tn ) :
            sys.stderr.write ( i )
            sys.stderr.write ( 'Case #%d: ' % ( i + 1 ) )
            self.solve ( )
        f.close ( )
class D ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.st = recwarn
    def readline ( self ) :
        while not self.st or not self.st :
            try :
                self.st = recwarn
            except EOFError :
                pass
        return self.st
    def eval ( self , arg ) :
        if arg == sys.stdin.readline ( ) :
            self.out.write ( '\n' )
D.eval ( )
