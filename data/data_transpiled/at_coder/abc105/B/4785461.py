def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.max = self.a // 4 + 2
        self.flag = 0
        self.total = 0
        for i in range ( self.max ) :
            for j in range ( self.max ) :
                self.total = self.total = self.total * 4 + self.total * 7
                if self.total == self.a :
                    self.flag = 1
                    break
        if self.flag == 1 :
            sys.stdout.write ( 'Yes' )
        else :
            sys.stdout.write ( 'No' )
