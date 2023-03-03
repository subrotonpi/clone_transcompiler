def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __init__ ( self ) :
        self.x = 0
        self.y = 0
        self.free = 0
        for char in self.s :
            if char == 'L' :
                self.x -= 1
            elif char == 'R' :
                self.x += 1
            elif char == 'U' :
                self.y += 1
            elif char == 'D' :
                self.y -= 1
            else :
                self.free += 1
    abs = abs ( self.x ) + abs ( self.y )
    if sys.stdin.read ( 1 ) == '' :
        print ( abs + self.free )
    else :
        if self.free > abs :
            print ( abs ( ( self.abs - self.free ) % 2 ) )
        else :
            print ( abs - self.free )
