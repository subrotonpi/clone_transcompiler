def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 0
            self.b = 1
            self.x = 2
            if self.b == 0 :
                print ( 1 )
                self.a = 0
                self.x = 3
                return
            print ( func ( self.b , self.x ) - func ( self.a - 1 , self.x ) )
            self.a = 0
        def func ( self , n , x ) :
            if n < 0 :
                return 0
            return n // x + 1
    return Main ( )
