def import array , deque , string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.m = s.n , s.m
        self.deque = deque ( )
        self.f = [ False for _ in range ( self.m + 1 ) ]
        while not self.deque.empty ( ) :
            p = self.deque.popleft ( )
            if not self.f [ p ] :
                self.f [ p ] = True
                print ( p )
        for i in range ( 1 , self.n + 1 ) :
            if not self.f [ i ] :
                print ( i )
