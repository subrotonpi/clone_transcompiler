def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def main ( self ) :
        self.n = sys.stdin.read ( )
    count = 0
    for i in range ( 105 , n + 1 , 2 ) :
        y = 0
        for j in range ( 1 , n + 1 ) :
            if i % j == 0 :
                y += 1
        if y == 8 :
            count += 1
    print ( count )
