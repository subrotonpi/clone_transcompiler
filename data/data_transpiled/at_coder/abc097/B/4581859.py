def main ( ) :
    import sys
    import random
    import numpy
    from numpy.testing.utils import get_seed
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = random.randint ( 1 , 2 )
            self.a = 1
            self.i = 2
            if self.X in [ 1 , 2 , 3 ] :
                print ( 1 )
            else :
                self.array = [ 0 ] * 1000
                self.array.append ( self.array )
                index = 0
                while True :
                    a = self.i * self.i
                    if a > self.X :
                        break
                    for j in range ( a , self.X , self.i ) :
                        self.array [ index ] = j
                        index += 1
                    self.i += 1
                self.array.sort ( )
                ans = self.array [ 999 ]
                print ( ans )
