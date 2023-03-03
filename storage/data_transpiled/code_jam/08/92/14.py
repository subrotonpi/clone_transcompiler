def import _readline
import readline
import random
import sys
class Balls_simple ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.a = [ ]
        self.tail = 0
        self.random = random.randrange ( len ( self.a ) )
    def solve ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        try :
            f = open ( FNAME + '.in' , 'r' )
            out = open ( FNAME + '.out' , 'w' )
            self.solve ( )
            out.close ( )
        except ( IOError , OSError ) :
            sys.exit ( 566 )
    def readline ( self ) :
        while not self.eof or not self.a [ - 1 ] :
            try :
                self.a = [ readline ( ) ]
            except :
                eof = True
                return '0'
        return self.a [ - 1 ]
    def readline ( self ) :
        while self.eof or not self.a [ - 1 ] :
            try :
                self.a = [ readline ( ) ]
            except :
                eof = True
                return '0'
        return self.a [ - 1 ]
    def readline ( self ) :
        while self.eof or not self.a [ - 1 ] :
            try :
                self.a = [ readline ( ) ]
            except :
                eof = True
                return '0'
        return self.a [ - 1 ]
    def readline ( self ) :
        while self.eof or self.a [ - 1 ] :
            try :
                self.a = [ readline ( ) ]
            except :
                eof = True
                return '0'
        return self.a [ - 1 ]
    def readline ( self ) :
        while self.eof :
            self.a = [ ]
        return readline ( self )
FNAME = 'balls'
def solve ( ) :
    testn = randint ( 1 , testn )
    for test in range ( testn ) :
        print ( 'Case #%d: ' % ( test + 1 ) , end = '' )
        w , h = randint ( 1 , testn