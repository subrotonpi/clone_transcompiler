def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = sys.stdin.readline ( ).strip ( )
        self.lhs = sys.stdin.readline ( ).strip ( )
        self.rhs = sys.stdin.readline ( ).strip ( )
        self.balls = [ ]
        for ix in range ( self.count ) :
            self.balls.append ( sys.stdin.readline ( ).strip ( ) )
        self.answer = 0
        for ix in range ( self.balls.length ) :
            self.answer += min ( self.balls [ ix ] , rhs - self.balls [ ix ] )
        print ( self.answer * 2 )
