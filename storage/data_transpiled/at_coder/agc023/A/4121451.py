def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.sum = 0
        self.dict = { None : 1 }
        for i in range ( n ) :
            self.sum += self.sum
            x = self.dict.get ( self.sum )
            if x is None :
                x = 0
            self.dict [ self.sum ] = x + 1
    count = 0
    for x in self.dict.values ( ) :
        if x >= 2 :
            count += long ( x ) * long ( x - 1 ) / long ( 2 )
    sys.stdout.write ( count )
