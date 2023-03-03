def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.a = - 1
        self.b = - 1
        self.c = - 1
        self.turn = 'a'
        self.ans = ''
        while True :
            if self.turn == 'a' :
                a += 1
                if a == len ( self.a ) :
                    ans = 'A'
                    break
                self.turn = self.a [ a ]
            elif self.turn == 'b' :
                b += 1
                if b == len ( self.b ) :
                    ans = 'B'
                    break
                self.turn = self.b [ b ]
            elif self.turn == 'c' :
                c += 1
                if c == len ( self.c ) :
                    ans = 'C'
                    break
                self.turn = self.c [ c ]
        print ( self.ans )
