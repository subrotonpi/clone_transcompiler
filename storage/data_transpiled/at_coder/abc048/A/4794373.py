def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def __call__ ( self , x ) :
            self.B = x
    x = Main ( )
    print ( "A" , x , "C" )
