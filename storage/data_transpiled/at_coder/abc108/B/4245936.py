def main ( srgs ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , srgs ) :
            self.srgs = srgs
            self.a = self.srgs [ 0 ]
            self.b = self.srgs [ 1 ]
            self.c = self.srgs [ 2 ]
            self.d = self.srgs [ 3 ]
            self.h = self.d - self.b
            self.w = self.c - self.a
            print ( ( self.c - self.h ) , ( self.d + self.w ) , ( self.a - self.h ) , ( self.b + self.w ) )
    return Main
