def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans , self.N = 0 , 0
        def __call__ ( self , * args ) :
            return self.ans
    n = Main ( )
    if n % 2 == 0 :
        print ( n / 2 ** 2 / 2 )
    else :
        print ( n / 2 ** ( n - n / 2 ) )
