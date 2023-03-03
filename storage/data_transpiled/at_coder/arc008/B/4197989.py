def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.m
        self.m = self.n
        self.name = self.name
        self.kit = self.kit
        self.names = [ ]
        self.kits = [ ]
        for c in self.name :
            self.names.append ( c - 'A' )
        for c in self.kit :
            self.kits.append ( c - 'A' )
        self.max = 1
        for x , y in zip ( self.names , self.kits ) :
            if x == 0 :
                continue
            if y == 0 :
                print ( - 1 )
                return
            if x > y :
                v = ( x + y - 1 ) / y
                if self.max < v :
                    self.max = v
        print ( self.max )
