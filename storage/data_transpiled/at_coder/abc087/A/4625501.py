def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            X , A , B = self.scn.read ( ) , self.scn.read ( ) , self.scn.read ( )
            X -= A
            X %= B
            print ( X )
    return Main
