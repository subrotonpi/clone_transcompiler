def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
    crash = 0
    browser = 1
    for char in S :
        if char == '+' :
            browser += 1
            if browser > L :
                crash += 1
                browser = 1
        elif char == '-' :
            browser -= 1
    print ( crash )
