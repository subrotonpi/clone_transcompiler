def _import ( ) : return _import ( )
import math
import termios
import sys
class TaskC ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'input.txt' )
        self.stdout = open ( 'output.txt' )
    def read ( self ) :
        with self.stdin :
            try :
                self.stdin.seek ( 0 )
                self.stdout.seek ( 0 )
            except IOError :
                raise EOFError
    def readline ( self ) :
        try :
            self.stdin.seek ( 0 )
        except IOError :
            raise EOFError
    def readchar ( self ) :
        c = self.stdin.read ( 1 )
        while isSpaceChar ( c ) :
            c = self.stdin.read ( 1 )
        return c
    def readdouble ( self ) :
        c = self.stdin.read ( 1 )
        while isSpaceChar ( c ) :
            c = self.stdin.read ( 1 )
        if not isSpaceChar ( c ) :
            raise EOFError
        res *= 10
        c = self.stdin.read ( 1 )
        while isSpaceChar ( c ) :
            c = self.stdin.read ( 1 )
        res = 0
        while not isSpaceChar ( c ) and c != '.' :
            if c < '0' or c > '9' :
                raise EOFError
            res += c - '0'
            c = self.stdin.read ( 1 )
        return res * sgn
    def read ( self ) :
        s = self.stdin.read ( 1 )
        for test_number in range ( self.num_tests ) :
            self.stdout.write ( 'Case #%d: ' % ( test_number + 1 ) )
            k = self.stdin.read ( 1 )
            c = self.stdin.read ( 1 )
        return s
    def read ( self ) :
        return self.stdin.read ( 1 )
    def readchar ( self ) :
        c = self.stdin.read ( 1 )
        while isSpaceChar ( c ) :
            c = self.stdin.read ( 1 )
        return c
    def readchar ( self ) :
        return ' '
        