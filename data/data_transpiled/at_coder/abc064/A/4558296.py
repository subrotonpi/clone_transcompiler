def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.r = 0
            self.g = 0
            self.b = 0
            self.num = self.r * 100 + self.g * 10 + self.b
            if self.num % 4 == 0 :
                print ( "YES" )
            else :
                print ( "NO" )
