def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
        def call ( self , a , b , c ) :
            count = 1
            if b != a :
                count += 1
            if c != b and c != a :
                count += 1
            print ( count )
    return Main
