def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 1
        def __call__ ( self , * args ) :
            self.N = self.N
    a = Main ( )
    b = Main ( )
    n = Main ( )
    for i in range ( n ) :
        m = Main ( )
        if m < a :
            print ( a - m )
        if a <= m <= b :
            print ( 0 )
        if m > b :
            print ( - 1 )
