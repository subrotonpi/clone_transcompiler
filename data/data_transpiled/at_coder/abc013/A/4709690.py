def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            c = self.sc.readline ( )
            if c == 'A' :
                self.print ( 1 )
            elif c == 'B' :
                self.print ( 2 )
            elif c == 'C' :
                self.print ( 3 )
            elif c == 'D' :
                self.print ( 4 )
            elif c == 'E' :
                self.print ( 5 )
