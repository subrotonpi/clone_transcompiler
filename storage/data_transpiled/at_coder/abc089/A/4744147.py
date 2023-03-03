def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.count = 0
            while self.a >= 3 :
                self.a -= 3
                self.count += 1
            print ( self.count )
    return Main
