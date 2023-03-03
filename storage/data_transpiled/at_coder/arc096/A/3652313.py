def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.maxint
            self.b = sys.maxint
            self.c = sys.maxint
            self.x = sys.maxint
            self.y = sys.maxint
            self.result = None
            h = False
            if self.a + self.b > 2 * self.c :
                h = True
            else :
                h = False
            low = min ( self.x , self.y )
            high = max ( self.x , self.y )
            sub = high - low
            if h :
                if low == self.x :
                    if self.b > 2 * self.c :
                        self.result = 2 * high * self.c
                    else :
                        self.result = 2 * low * self.c + sub * b
                elif low == self.y :
                    if self.a > 2 * self.c :
                        self.result = 2 * high * self.c
                    else :
                        self.result = 2 * low * self.c + sub * a
            else :
                self.result = a * self.x + b * self.y
            print ( self.result )
            self.result = None
    return Main
