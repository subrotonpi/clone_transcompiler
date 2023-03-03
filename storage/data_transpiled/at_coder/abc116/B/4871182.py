def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = 1
        def __call__ ( self , * args ) :
            if self.s == 1 or self.s == 2 :
                print ( 4 )
                return
            cnt = 0
            while self.s != 1 :
                if self.s % 2 == 0 :
                    self.s /= 2
                else :
                    self.s = self.s * 3 + 1
                cnt += 1
            print ( cnt + 2 )
