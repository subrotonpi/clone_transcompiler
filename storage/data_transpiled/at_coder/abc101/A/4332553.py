def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        s = self.sc.readline ( ).split ( '' )
        count = 0
        for i in s :
            if '+' in i :
                count += 1
                continue
            count -= 1
        print ( count )
