def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.a = 0
            self.b = 0
            for i in range ( 3 ) :
                value = self.input.read ( )
                if value == 5 :
                    self.a += 1
                elif value == 7 :
                    self.b += 1
            if self.a == 2 and self.b == 1 :
                self.print ( "YES" )
            else :
                self.print ( "NO" )
