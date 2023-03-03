def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            n = self.sc.recv ( 32 )
            if n == 0 or n == 1111 | n == 2222 or n == 3333 or n == 4444 or n == 5555 or n == 6666 or n == 7777 or n == 8888 or n == 9999 :
                self.out = 'SAME'
            else :
                self.out = 'DIFFERENT'
    return Main
