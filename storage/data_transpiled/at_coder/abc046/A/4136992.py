def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
            if self.a == self.b and self.b == self.c :
                self.a = 1
            elif self.a == self.b or self.b == self.c or self.c == self.a :
                self.a = 2
            else :
                self.a = 3
