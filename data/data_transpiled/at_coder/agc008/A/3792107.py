def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.ans1 = 0
        self.ans2 = 0
        self.ans3 = 0
        self.ans4 = 0
        self.x1 = self.x
        self.x2 = - 1 * self.x
        self.y1 = self.y
        self.y2 = - 1 * self.y
        if self.x1 <= y1 :
            ans1 = y1 - self.x1
        else :
            ans1 = sys.maxint
        if self.x2 <= y1 :
            ans2 = y1 - self.x2 + 1
        else :
            ans2 = sys.maxint
        if self.x1 <= y2 :
            ans3 = y2 - self.x1 + 1
        else :
            ans3 = sys.maxint
        if self.x2 <= y2 :
            ans4 = y2 - self.x2 + 2
        else :
            ans4 = sys.maxint
        ans = min ( [ self.ans1 , self.ans2 , self.ans3 , self.ans4 ] )
        print ( ans )
