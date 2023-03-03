def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.nums = [ ]
        for i in range ( self.n ) :
            self.nums.append ( i )
            if self.nums [ i ] == 0 :
                print ( self.n )
                return
    def syakutori ( self ) :
        self.begin_index = 0
        self.end_index = 0
        self.output = 0
        try :
            while True :
                if self.syakutori <= self.k or self.begin_index == self.end_index :
                    if self.syakutori <= self.k and self.output < self.end_index - self.begin_index + 1 :
                        self.output = self.end_index - self.begin_index + 1
                    self.end_index += 1
                    self.syakutori *= self.nums [ self.end_index ]
                else :
                    self.syakutori /= self.nums [ self.begin_index ]
                    self.begin_index += 1
        except IndexError :
            print ( self.output )
