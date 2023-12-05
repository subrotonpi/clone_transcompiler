def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        if self.s == 4 or self.s == 2 or self.s == 1 :
            print ( 4 )
            return
        input = self.s
        output = 0
        i = 1
        while True :
            i += 1
            if self.input % 2 == 0 :
                output = self.input // 2
            else :
                output = self.input * 3 + 1
            if output == 4 :
                print ( i + 3 )
                return
            input = output
