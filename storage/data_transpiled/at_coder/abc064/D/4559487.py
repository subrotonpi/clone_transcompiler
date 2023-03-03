def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.s = sys.stdin.read ( )
            self.ans = ""
            self.cnt = 0
            self.kari = ""
            for i , c in enumerate ( self.s ) :
                if c == ")" :
                    if self.cnt == 0 :
                        self.ans = "(" + self.ans + ")"
                    else :
                        self.kari = self.kari + ")"
                        self.cnt -= 1
                        if self.cnt == 0 :
                            self.ans = self.ans + self.kari
                            self.kari = ""
            else :
                self.cnt += 1
                self.kari = self.kari + "("
            if i == self.n - 1 :
                self.ans += self.kari
                tmp = ""
                for i in range ( self.cnt ) :
                    tmp = tmp + ")"
                self.ans = self.ans + tmp
    print ( ans )
    sys.exit ( )
