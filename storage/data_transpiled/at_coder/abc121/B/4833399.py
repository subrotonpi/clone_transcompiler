def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.code_num = sys.stdin.readline ( ).strip ( )
        self.featnum = sys.stdin.readline ( ).strip ( )
        self.c = sys.stdin.readline ( ).strip ( )
    def __init__ ( self ) :
        self.b = [ ]
        self.num = 0
        self.num2 = 0
        self.sum = 0
        self.count = 0
        for i in range ( self.featnum ) :
            self.b.append ( self.num )
        for i in range ( self.code_num ) :
            for j in range ( self.featnum ) :
                num = self.num [ j ]
                num2 = self.b [ j ] * num
                self.sum += num2
            if self.sum + self.c > 0 :
                self.count += 1
            self.sum = 0
        print ( self.count )
