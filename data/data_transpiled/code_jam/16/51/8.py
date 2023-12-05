def import import sys
import time
import os
import sys
class Assistant ( object ) :
    def solve ( self ) :
        s = sys.stdin.readline ( )
        stack = [ ]
        size = 0
        for c in s :
            if size and c == stack [ - 1 ] :
                size -= 1
            else :
                stack.append ( c )
        self.out.write ( 5 * ( size / 2 ) + 10 * ( len ( s ) - size ) / 2 )
    def run ( self ) :
        try :
            self.stdin = sys.stdin.readline ( )
            self.stdout = sys.stdout.write
            self.tests = self.stdin.readline ( ).rstrip ( )
            for i in range ( 1 , tests + 1 ) :
                time = time.time ( )
                self.out.write ( 'Case #%d: ' % i )
                self.solve ( )
                sys.stderr.write ( 'Solved case #%d in %d ms\n' % ( i , time.time ( ) - time.time ( ) ) )
            self.out.close ( )
        except FileNotFoundError :
            pass
    def read ( self , fname ) :
        try :
            f = open ( fname , "r" )
        except FileNotFoundError :
            pass
        else :
            f.readline ( ).rstrip ( )
        return f.readline ( )
    def readline ( self ) :
        while not self.stdin.readline ( ) or not self.stdin.readline ( ) :
            try :
                f.readline ( ).rstrip ( )
            except FileNotFoundError :
                pass
        return self.stdin.readline ( )
    def read ( self , fname ) :
        while not self.stdin.readline ( ) or not self.stdout.readline ( ) :
            try :
                f.readline ( ).rstrip ( )
            except FileNotFoundError :
                pass
        return self.stdin.readline ( )
    def readline ( self ) :
        return self.stdin.readline ( )
