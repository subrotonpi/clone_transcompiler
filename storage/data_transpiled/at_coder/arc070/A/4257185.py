def main ( srgs ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , srgs ) :
            self.srgs = srgs
            self.a = self.srgs [ 0 ]
            self.c = 0
            for i in range ( 1 ) :
                self.c += i
                if self.c >= self.a :
                    print ( i )
                    break
    return Main
