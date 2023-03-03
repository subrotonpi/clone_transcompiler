def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.data = sys.stdin.read ( )
            self.a = sys.stdin.read ( )
            self.count = 0
            for b in self.data [ 1 : ] :
                if a != b :
                    self.count += 1
                a = sys.stdin.read ( )
            print ( self.count )
