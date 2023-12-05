def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.s = self.s.split ( '+' , 0 )
        self.count = 0
        for i in self.s :
            if '0' not in i :
                self.count += 1
        print ( self.count )
