def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 = sys.stdin.read ( )
            self.y1 = sys.stdin.read ( )
            self.x2 = sys.stdin.read ( )
            self.y2 = sys.stdin.read ( )
            self.subx = self.x1 - self.x2
            self.suby = self.y1 - self.y2
            print ( ( self.x2 + self.suby , self.y2 - self.subx , self.x1 + self.suby , self.y1 - self.subx ) )
