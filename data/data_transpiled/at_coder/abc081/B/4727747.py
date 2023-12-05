def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = [ ]
        self.stop = 0
        self.count = 0
        for i in range ( self.a ) :
            self.b.append ( i )
        while True :
            for x in range ( self.a ) :
                if self.b [ x ] % 2 == 0 :
                    self.b [ x ] = self.b [ x ] / 2
                else :
                    self.stop = 1
            if self.stop == 0 :
                self.count += 1
