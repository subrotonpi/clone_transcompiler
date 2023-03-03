def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.count = 0
        for i in range ( self.a , self.b + 1 ) :
            tt = i // 10000
            fi = i % 10
            th = i // 1000 % 10
            te = i // 10 % 10
            if tt == fi and th == te :
                self.count += 1
        print ( self.count )
