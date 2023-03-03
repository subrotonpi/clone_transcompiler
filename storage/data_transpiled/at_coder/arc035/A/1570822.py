def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self.s = ''
        self.size = len ( self.s )
        for i in range ( self.size // 2 ) :
            start = self.s [ i ]
            end = self.s [ self.size - 1 - i ]
            if start == '*' or end == '*' :
                continue
            elif start == end :
                continue
            elif start != end :
                self.s [ i ] = 'NO'
                return
        self.s [ i ] = 'YES'
