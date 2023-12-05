def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = self.N
            self.H = self.H
            self.A = self.A
            self.B = self.B
            self.C = self.C
            self.D = self.D
            self.E = self.E
            cost = float ( "inf" )
            for i in range ( 0 , N ) :
                niti = ( - H - i * B + N * E - i * E )
                if niti < 0 :
                    niti = 0
                else :
                    niti = niti / ( D + E ) + 1
                cost = min ( cost , i * A + niti * C )
            print ( cost )
