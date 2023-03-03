def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.line = self.s.split ( '' , 10 )
        count = 0
        max = 0
        for i in range ( len ( self.line ) ) :
            for j in range ( len ( self.line ) ) :
                if self.line [ j ] in [ 'A' , 'T' , 'G' , 'C' ] :
                    count += 1
                    if count > max :
                        max = count
                else :
                    count = 0
            count = 0
        print ( max )
