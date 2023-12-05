def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.NG1 , self.NG2 , self.NG3 = _main ( )
    def main ( self ) :
        self.N = self.N
        self.NG1 = self.NG1
        self.NG2 = self.NG2
        self.NG3 = self.NG3
        if self.N == self.NG1 or self.N == self.NG2 or self.N == self.NG3 :
            self.N = 400
        for j in range ( 100 ) :
            for i in range ( 3 , 0 , - 1 ) :
                if self.N - i not in [ self.NG1 , self.NG2 , self.NG3 ] :
                    self.N -= i
                    self.N = 0
        if self.N < 1 :
            self.ans = "YES"
        print ( self.ans )
