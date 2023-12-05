def _import ( ) : return _import ( )
import sys
import io
import itertools
import string
import string
import sys
import io
import readline
import readline
import readline
import readline
import readline
import readline
import string
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
        self.out = sys.stdout
        self.debug = False
    def solve ( self ) :
        n = ir.randint ( 0 , 1 )
        a = ir.next_longlist ( n )
        res = 0
        while len ( [ a.max ( ) [ 0 ] for a in self.a ] ) >= n :
            for i in range ( n ) :
                div = a [ i ] / n
                res += div
                a [ i ] %= n
                for j in range ( n ) :
                    if i != j :
                        a [ j ] += div
        self.out.write ( res )
    def read ( self , n ) :
        ir = readline
        self.out = sys.stdout
        self.solve ( )
        self.out.flush ( )
    class Main ( object ) :
        def __init__ ( self ) :
            self.out = sys.stdout
            self.out = sys.stdout
            self.err = sys.stderr
            self.err = sys.stderr
            self.err.flush ( )
    def readline ( self ) :
        if self.out == sys.stdout :
            raise EOFError
        else :
            return self.out
    def write ( self , data ) :
        if self.out == sys.stdout :
            return data
        else :
            return self.out
    def read ( self , n ) :
        if self.out == sys.stdin :
            return self.out
        else :
            return self.out
    def write ( self , data ) :
        if self.out == sys.stdout :
            return data
        else :
            return self.out
    