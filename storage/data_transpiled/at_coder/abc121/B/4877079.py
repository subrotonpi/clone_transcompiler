def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.M , self.C , self.correct = self.N , self.M , self.C , 0
            B = [ self.N , self.C ]
            for i in range ( self.M ) :
                value = self.C
                for j in range ( self.M ) :
                    value += self.N * B [ j ]
                if value > 0 :
                    correct += 1
            print ( correct )
