def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.code = sys.stdin.read ( )
        self.code2 = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.b = [ ]
        num = num2 = sum = 0
        count = 0
        for i in range ( self.code2 ) :
            self.b.append ( i )
        for i in range ( self.code ) :
            for j in range ( self.code2 ) :
                num = i * num
                num2 = b [ j ] * num
                sum += num2
            if sum + self.c > 0 :
                count += 1
            sum = 0
        print ( count )
