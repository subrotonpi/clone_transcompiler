def _import ( ) : return
import sys
import os
import sys
import random
import sys
class B ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.x = [ random.randint ( 0 , 10000 ) for i in range ( n ) ]
        self.v = [ random.randint ( 0 , 10000 ) for i in range ( n ) ]
        self.ans = 0
        while True :
            if self.k == 0 :
                self.stdout.write ( ans )
                return
            if self.n == 0 :
                self.stdout.write ( 'IMPOSSIBLE' )
                return
            self.n -= 1
            if self.b - self.x [ self.n ] <= self.v [ self.n ] * t :
                self.k -= 1
            else :
                self.ans += k
    def solve ( ) :
        tests = random.randint ( 1 , 10000 )
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % test , end = '' )
            self.solve_test ( )
    def main ( ) :
        sys.stdout.write ( 'Enter filename: ' )
        sys.stdout.flush ( )
        filename = sys.stdin.readline ( )
        f = open ( filename + '.in' , 'r' )
        f.write ( '' )
        f.close ( )
        f.close ( )
    def next ( self ) :
        while not self.stdin or not self.stdout :
            self.stdin = sys.stdin.readline ( )
        return self.stdin
    def next ( self ) :
        while self.stdin or not self.stdout :
            self.stdin = sys.stdin.readline ( )
        return next ( self.stdin )
