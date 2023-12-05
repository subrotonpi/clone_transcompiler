def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
    def main ( ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if self.a < self.b :
            min = self.a
        else :
            min = self.b
        for i in range ( min , 1 , - 1 ) :
            if self.a % i == 0 and self.b % i == 0 :
                count += 1
                if self.count == c :
                    self.result = i
                    break
        print ( self.result )
