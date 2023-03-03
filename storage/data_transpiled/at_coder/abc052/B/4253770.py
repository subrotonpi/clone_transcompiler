def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.str = sys.stdin.readline ( )
        self.x = 0
        self.nums = [ ]
        strs = self.str.split ( '' )
        for s in strs :
            if s == 'I' :
                self.x += 1
                self.nums.append ( self.x )
            elif s == 'D' :
                self.x -= 1
                self.nums.append ( self.x )
        self.max = max ( self.nums )
