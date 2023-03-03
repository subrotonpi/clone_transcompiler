def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.K = sys.stdin.read ( )
        def execute ( self ) :
            ret = 0
            if self.K % 2 == 0 :
                ret = A - B
            else :
                ret = B - A
            print ( ret )
    return Main ( )
