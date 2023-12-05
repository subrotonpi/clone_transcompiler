def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.i = self.sc.__next__ ( )
            mod = 0
            if self.i == 1 :
                print ( "1" )
            else :
                mod = self.i % 2
                self.i = self.i // 2
                print ( mod , self.i )
