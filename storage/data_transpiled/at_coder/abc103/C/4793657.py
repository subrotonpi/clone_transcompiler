def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.number = int ( self.number )
        self.answer = 0
        self.max = 0
        self.allsum = 0
        self.a = [ ]
        for i in range ( self.number ) :
            self.a.append ( i )
            if self.a [ i ] > self.max :
                self.max = self.a [ i ]
            self.allsum += self.a [ i ]
        self.max -= 1
        for i in range ( self.number ) :
            self.answer += self.a [ i ] % self.max
        sys.stdout.write ( self.allsum - self.number )
