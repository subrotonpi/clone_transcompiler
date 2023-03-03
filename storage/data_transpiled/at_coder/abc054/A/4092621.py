def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
        def execute ( self ) :
            if self.A == self.B :
                print ( "Draw" )
                return
            A = self.A == 1 and 14 or self.A
            B = self.B == 1 and 14 or self.B
            print ( "Alice" if A > B else "Bob" )
