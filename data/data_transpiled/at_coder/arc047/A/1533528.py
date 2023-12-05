def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
    crash = 0
    count = 1
    for ch in S :
        if ch == '+' :
            count += 1
        if ch == '-' :
            count -= 1
            if count == 0 :
                count = 1
        if count > L :
            crash += 1
            count = 1
    print ( crash )
