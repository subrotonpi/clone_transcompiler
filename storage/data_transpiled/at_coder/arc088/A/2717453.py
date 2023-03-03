def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
            self.count = 1
            tmp_x = self.X
            while True :
                if tmp_x * 2 > self.Y :
                    break
                else :
                    tmp_x = tmp_x * 2
                    self.count += 1
            print ( self.count )
    return Main ( )
