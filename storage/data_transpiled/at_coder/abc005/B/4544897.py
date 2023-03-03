def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.num = 0
            self.min = 101
            for i in range ( self.num ) :
                self.min = min ( self.min , self.min )
            print ( self.min )
