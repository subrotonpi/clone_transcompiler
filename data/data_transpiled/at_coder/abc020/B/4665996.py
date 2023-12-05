def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s1 = sys.stdin.readline ( ).strip ( )
            self.s2 = sys.stdin.readline ( ).strip ( )
            self.s3 = int ( self.s1 + self.s2 )
            print ( self.s3 * 2 )
