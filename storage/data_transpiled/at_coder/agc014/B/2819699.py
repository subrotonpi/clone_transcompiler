def import _readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.readline ( )
        self.M = sys.stdin.readline ( )
        self.E = [ ( sys.stdin.readline ( ) [ - 1 ] , sys.stdin.readline ( ) [ - 1 ] ) for i in range ( M ) ]
        print ( 'YES' if self.solve ( ) else 'NO' )
    def __init__ ( self ) :
        self.a = 0
        self.b = 0
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def solve ( ) :
        T = [ 0 ] * N
        for e in self.E :
            T [ e.a ] += 1
            T [ e.b ] += 1
        for t in T :
            if t % 2 == 1 :
                return False
        return True
    @ property
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                self.stdin.readline ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                return readline ( self.stdin.readline ( ) )
            except EOFError :
                self.stdin.readline ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                return readline ( self.stdin.readline ( ) )
            except EOFError :
                self.stdin.readline ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                return readline ( self.stdin.readline ( ) )
            except EOFError :
                self.stdin.readline ( )
        return self.stdin.readline ( )
