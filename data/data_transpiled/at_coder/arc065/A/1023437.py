def import _raw_input
class Main ( object ) :
    def __init__ ( self ) :
        self.s = ''
        self.flag = True
        self.i = len ( self.s ) - 1
        while self.i >= 0 :
            for i in range ( 4 ) :
                flag = True
                for k in self.s [ i - 1 ] :
                    if self.i - k < 0 or self.s [ i - k ] != self.s [ i - 1 - k ] :
                        flag = False
                        break
                if flag :
                    self.i -= len ( self.s )
                    break
            if not self.flag :
                break
        print ( ( ( self.flag ) and 'YES' ) )
