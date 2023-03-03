def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.str1 = sys.stdin.read ( )
            self.str2 = sys.stdin.read ( )
            for i in range ( len ( self.str1 ) ) :
                if not self.str1 [ i ] == self.str2 [ 2 - i ] :
                    self.print ( 'NO' )
                    return
            self.print ( 'YES' )
    return Main ( )
