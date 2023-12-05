def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.str = self.stdin.read ( )
            print ( self.str.replace ( 'Left' , '<' ).replace ( 'Right' , '>' ).replace ( 'AtCoder' , 'A' ) )
