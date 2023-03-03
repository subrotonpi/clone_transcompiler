def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.r = 0
            self.b = 1
            self.g = 1
            self.s = 100 * self.r + 10 * self.b + self.g
            if self.s % 4 == 0 :
                print ( "YES" , end = "" )
            else :
                print ( "NO" , end = "" )
