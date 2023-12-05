def _import ( ) : return sys.stdin.read ( )
import math
import io
import sys
import list
class Main ( object ) :
    def __init__ ( self , stream ) :
        try :
            sys.stdin = open ( 'b.in' , 'r' )
            sys.stdout = open ( 'b.out' , 'w' )
        except :
            sys.stdin.close ( )
    def interface ( self , test_number , stream ) :
        self.count = [ ]
        for i in range ( 0 , len ( self.count ) ) :
            self.count.append ( i )
        self.ends = [ ]
        for i in range ( 0 , len ( self.ends ) ) :
            if self.count [ i ] < self.count [ i + 1 ] :
                for j in range ( 0 , self.count [ i + 1 ] - self.count [ i ] ) :
                    self.ends.append ( i )
        answer = sum ( self.count )
        for i in range ( 0 , len ( self.ends ) ) :
            answer = min ( answer , self.count [ i ] - self.count [ i ] )
        if answer == sum ( self.count ) :
            answer = 0
        print ( 'Case #%d: %d' % ( self.test_number , answer ) )
    class Base ( object ) :
        def __init__ ( self ) :
            self.finished = False
        def read ( self ) :
            c = self.read ( )
            while is_space_char ( c ) :
                c = self.read ( )
            sgn = 1
            if c == '-' :
                sgn = - 1
                c = self.read ( )
            res = 0
            while True :
                if c < '0' or c > '9' :
                    raise InputError ( )
                res *= 10
                res += c - '0'
                c = self.read ( )
            return res * sgn
        def read ( self ) :
            c = self.read ( )
            while not is_space_char ( c ) :
                c = self.read ( )
            return res
    return Base ( )
