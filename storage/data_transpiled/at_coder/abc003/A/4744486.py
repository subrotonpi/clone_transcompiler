def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = float ( )
        def __call__ ( self , * args ) :
            return self.a
    a = Main ( )
    sum = 0
    for i in range ( 1 , a + 1 ) :
        sum += i * 10000 / a
    print ( sum )
