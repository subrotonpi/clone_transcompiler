def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.b , self.q = sys.stdin.read ( ).split ( '\n' )
    def __init__ ( self ) :
        self.s , self.q = sorted ( [ s.pop ( ) for i in range ( a ) ] )
    def __init__ ( self ) :
        self.s = sorted ( [ s.pop ( ) for i in range ( b ) ] )
    def __init__ ( self ) :
        self.s = sorted ( [ s.pop ( ) for i in range ( a ) ] )
    def __init__ ( self ) :
        self.s = sorted ( [ s.pop ( ) for i in range ( b ) ] )
    def __init__ ( self ) :
        self.q = q
    def start ( self ) :
        self.a = 0
        self.b = 0
        self.q = 0
        self.t = sorted ( [ ] )
        self.s = sorted ( [ ] )
        for i in range ( self.q ) :
            pos = self.s [ i ]
            tl , tr , sl , sr = self.t [ i ] , self.t [ i ] , self.s [ i ] , self.s [ i ]
            if not isinstance ( tl , int ) :
                tl = - 1 << 60
            if not isinstance ( tr , int ) :
                tr = 1 << 60
            if not isinstance ( sl , int ) :
                sl = - 1 << 60
            if not isinstance ( sr , int ) :
                sr = 1 << 60
            self.min = min ( max ( pos - tl , pos - sl ) , max ( tr - pos , sr - pos ) )
            self.min = min ( min ( pos - tl , sr - pos ) , min ( ( pos - tl , sr - pos ) , ( pos - tl , sr - pos ) ) )
            self.min = min ( min ( pos - tr , ( pos - sl , sr - pos ) ) , min ( ( pos - tr , pos - pos ) , ( pos - sl , sr - pos ) ) )
