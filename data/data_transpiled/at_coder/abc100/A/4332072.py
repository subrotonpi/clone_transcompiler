def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            if self.a <= 8 and self.b <= 8 :
                print ( "Yay!" )
                return
            print ( ":(" )
    return Main ( )
