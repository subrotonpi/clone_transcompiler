def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.h = int ( sys.stdin.read ( ) )
        self.ans = 0
        b = [ ]
        max_a = 0
        for i in range ( n ) :
            max_a = max ( max_a , sys.stdin.read ( ) )
            b.append ( sys.stdin.read ( ) )
        b.sort ( reverse = True )
        for i in range ( n ) :
            if b [ i ] > max_a :
                self.h -= b [ i ]
                self.ans += 1
            else :
                break
            if self.h <= 0 :
                print ( self.ans )
                return
        self.ans += self.h / self.max_a
        if self.h % self.max_a != 0 :
            self.ans += 1
        print ( self.ans )
