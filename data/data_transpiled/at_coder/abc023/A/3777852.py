def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            return self.a
    a = Main ( )
    b1 , b2 = a // 10 , a % 10
    print ( b1 + b2 )
