def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.H = self.H
            self.W = self.W
            self.b_c = self.b_c
            self.b_c += 1
        self.muki *= - 1
    print ( b_c )
    for i in range ( H ) :
        for j in range ( W ) :
            self.masu [ i ] [ j ] = self.sc.read ( )
    muki = 1
    for i in range ( H ) :
        for j in range ( W - 1 ) :
            if muki == 1 :
                if self.masu [ i ] [ j ] % 2 == 1 :
                    self.masu [ i ] [ j + 1 ] += 1
                    self.masu [ i ] [ j ] -= 1
                    self.buri [ b_c ] [ 0 ] = i + 1
                    self.buri [ b_c ] [ 1 ] = j + 1
                    self.buri [ b_c ] [ 2 ] = i + 1
                    self.buri [ b_c ] [ 3 ] = j + 2
                    self.b_c += 1
                else :
                    pass
            elif muki == - 1 :
                if self.masu [ i ] [ W - 1 - j ] % 2 == 1 :
                    self.masu [ i ] [ W - j - 2 ] += 1
                    self.masu [ i ] [ W - j - 1 ] -= 1
                    self.buri [ b_c ] [ 0 ] = i + 1
                    self.buri [ b_c ] [ 1 ] = W - j
                    self.buri [ b_c ] [ 2 ] = i + 1
                    self.buri [ b_c ] [ 3 ] = W - j - 1
                    self.b_c += 1
                else :
                    pass
        if i < H - 1 and muki == 1 :
            if self.masu [ i ] [ W - 1 ] % 2 == 1 :
                self.masu [ i ] [ W - 1 ] -= 1
                self.masu [ i + 1 ] [ W - 1 ] += 1
                self.buri [ i ] [ 0 ] =