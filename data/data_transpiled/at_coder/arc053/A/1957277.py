def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.h , self.w = self.h , self.w
            self.ans = None
            self.ans += ( self.w - 1 ) * self.h
            self.ans += ( self.h - 1 ) * self.w
            print ( self.ans )
    return Main
