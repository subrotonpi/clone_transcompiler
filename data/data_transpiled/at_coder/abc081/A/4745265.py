def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.num = 0
        def __call__ ( self , * args ) :
            self.cnt = 0
            a = num > 99
            if a :
                self.cnt += 1
                num = num - 100
            b = num > 9
            if b :
                num = num - 10
                self.cnt += 1
            c = num == 1
            if c :
                self.cnt += 1
            print ( self.cnt )
    return Main ( )
