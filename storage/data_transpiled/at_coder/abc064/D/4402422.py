def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( _main.args )
        self.S = _main.args [ 0 ]
        self.right_c = 0
        self.left_c = 0
        new_S = self.S
        old = ""
        for i in range ( self.N ) :
            if self.S [ i ] == "(" :
                self.left_c += 1
            elif self.S [ i ] == ")" :
                if self.left_c == 0 :
                    self.right_c += 1
                else :
                    self.left_c -= 1
        for i in range ( self.right_c ) :
            new_S = "(" + new_S
        for i in range ( self.left_c ) :
            new_S = new_S + ")"
        print ( new_S )
