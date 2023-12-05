def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.APrice = sys.stdin.read ( )
            self.BPrice = sys.stdin.read ( )
            self.ABPrice = sys.stdin.read ( )
            self.ATarget = sys.stdin.read ( )
            self.BTarget = sys.stdin.read ( )
            self.answer = 0
            if self.APrice + self.BPrice >= 2 * self.ABPrice :
                if self.ATarget > self.BTarget :
                    self.answer = 2 * self.ABPrice * self.BTarget
                    self.ATarget -= self.BTarget
                    if self.APrice >= self.ABPrice * 2 :
                        self.answer += self.ABPrice * 2 * self.ATarget
                    else :
                        self.answer += self.APrice * self.ATarget
                else :
                    self.answer = 2 * self.ABPrice * self.ATarget
                    self.BTarget -= self.ATarget
                    if self.BPrice >= self.ABPrice * 2 :
                        self.answer += self.ABPrice * 2 * self.BTarget
                    else :
                        self.answer += self.BPrice * self.BTarget
        else :
            self.answer = self.APrice * self.ATarget + self.BPrice * self.BTarget
        print ( self.answer )
