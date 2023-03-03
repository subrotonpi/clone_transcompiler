def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
        self.points = [ ]
        left = right = 0
        for point in self.points :
            point = self.points.pop ( point )
            if point < self.x :
                left += 1
            else :
                right += 1
        print ( min ( left , right ) )
