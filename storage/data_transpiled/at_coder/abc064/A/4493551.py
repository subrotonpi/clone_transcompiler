def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
        def __call__ ( self , * args ) :
            m = 100 * a + 10 * b + c
            if m % 4 == 0 :
                print ( "YES" , end = ' ' )
            else :
                print ( "NO" , end = ' ' )
