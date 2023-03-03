def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sys.stdout.write ( '\n' )
        sys.stdout.write ( '\n' )
        s = sys.stdin.read ( )
        t = int ( sys.stdin.read ( ) )
        x = 0
        y = 0
        questions = 0
        for char in s :
            if char == 'L' :
                x -= 1
            elif char == 'R' :
                x += 1
            elif char == 'U' :
                y += 1
            elif char == 'D' :
                y -= 1
            elif char == '?' :
                questions += 1
    def __init__ ( self ) :
        self.x = 0
        self.y = 0
        self.questions = 0
    def run ( self ) :
        self.x = 0
        self.y = 0
        self.questions = 0
        for char in s :
            if char == 'L' :
                self.x -= 1
            elif char == 'R' :
                self.x += 1
            elif char == 'U' :
                self.y += 1
            elif char == 'D' :
                self.y -= 1
            elif char == '?' :
                self.questions += 1
        self.distance = abs ( self.x ) + abs ( self.y )
        if t == 1 :
            print ( self.distance + self.questions )
        else :
            if self.questions <= self.distance :
                print ( self.distance - self.questions )
            else :
                print ( ( self.questions - self.distance ) % 2 )
