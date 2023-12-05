def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = self.N
            self.T = self.T
            self.sum = 0
            self.s = self.s
            self.g = self.s + self.T
            for i in range ( 1 , N ) :
                tmp = self.s
                if tmp > self.g :
                    self.sum += self.g - s
                    self.s = tmp
                    self.g = self.s + self.T
                elif tmp <= self.g :
                    self.g = self.s + self.T
            self.sum += self.g - self.s
            print ( self.sum )
