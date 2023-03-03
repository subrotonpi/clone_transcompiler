def import _main
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = Main ( )
        self.m.answer ( )
    def scan ( self ) :
        N = int ( self.m.w )
        self.boxes = [ ]
        for i in range ( N ) :
            w , h = int ( self.m.h )
            self.boxes.append ( Box ( w , h ) )
        self.dp = [ ]
        self.scan.close ( )
    def answer ( self ) :
        bit = BinaryIndexedTree ( 100001 )
        for i in range ( N ) :
            dp [ i ] = bit.query ( self.boxes [ i ].w - 1 ) + 1
            bit.update ( self.boxes [ i ].w , dp [ i ] )
        ans = 0
        for i in range ( N ) :
            if self.dp [ i ] > ans : ans = self.dp [ i ]
        print ( ans )
class BinaryIndexedTree ( object ) :
    def __init__ ( self , n ) :
        self.bit = BinaryIndexedTree ( n )
    def update ( self , a ) :
        for x in range ( self.n , self.n + 1 , - self.q ) :
            self.set ( x , max ( self.get ( x ) , a ) )
    def query ( self ) :
        max = 0
        for x in self.q :
            tmp = self.get ( x )
            if tmp > max : max = tmp
        return max
    def set ( self , x ) :
        self.bit [ x - 1 ] = x
    def get ( self ) :
        return self.bit [ x - 1 ]
class Box ( object ) :
    def __init__ ( self ) :
        self.w = w
        self.h = h
    def answer ( self ) :
        self.answer ( )
