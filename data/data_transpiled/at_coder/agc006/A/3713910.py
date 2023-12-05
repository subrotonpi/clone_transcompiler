def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = self.N
            self.s = self.s
            self.t = self.t
            self.tmp = ""
            self.ngs = 11451419
            self.tmp = self.s [ 0 ] + self.t [ 0 ]
            if self.tmp [ 0 : N ] == self.s and self.tmp [ - N : ] == self.t :
                self.ngs = min ( self.tmp , self.ngs )
        for i in range ( 1 , N + 1 ) :
            self.tmp = self.s [ 0 : - i + 1 ] + self.t [ i ]
            if self.tmp >= self.N :
                if self.tmp [ 0 : N ] == self.s and self.tmp [ - N : ] == self.t :
                    self.ngs = min ( self.tmp , self.ngs )
            self.tmp = self.s [ 0 : - i ] + self.t [ i - 1 ]
            if self.tmp >= self.N :
                if self.tmp [ 0 : N ] == self.s and self.tmp [ - N : ] == self.t :
                    self.ngs = min ( self.tmp , self.ngs )
            self.tmp = self.s [ 0 : - i ] + self.t [ i ]
            if self.tmp >= self.N :
                if self.tmp [ 0 : N ] == self.s and self.tmp [ - N : ] == self.t :
                    self.ngs = min ( self.tmp , self.ngs )
        self.print ( self.ngs )
