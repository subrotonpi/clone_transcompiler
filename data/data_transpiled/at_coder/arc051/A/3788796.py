def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 = sys.stdin.readline ( ).strip ( )
            self.y1 = sys.stdin.readline ( ).strip ( )
            self.r = sys.stdin.readline ( ).strip ( )
            self.x2 = sys.stdin.readline ( ).strip ( )
            self.y2 = sys.stdin.readline ( ).strip ( )
            self.x3 = sys.stdin.readline ( ).strip ( )
            self.y3 = sys.stdin.readline ( ).strip ( )
            if self.x1 + self.r <= x3 and self.x1 - self.r >= x2 and self.y1 + self.r <= y3 and y1 - self.r >= y2 :
                self.print ( 'NO' )
                self.print ( 'YES' )
            elif ( self.x2 - self.x1 ) ** 2 + self.y2 - self.y1 <= r ** 2 :
                self.print ( 'NO' )
                self.print ( 'YES' )
            else :
                self.print ( 'YES' )
                self.print ( 'YES' )
