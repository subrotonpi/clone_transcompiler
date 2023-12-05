def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.str1 = sys.stdin.readline ( ).strip ( )
            self.str2 = sys.stdin.readline ( ).strip ( )
            self.str3 = sys.stdin.readline ( ).strip ( )
            if self.str1 [ - 1 ] == self.str2 [ 0 ] and self.str2 [ - 1 ] == self.str3 [ 0 ] :
                self.print ( "YES" )
            else :
                self.print ( "NO" )
