def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.nums = [ ]
        people = 0
        for i in range ( self.n ) :
            self.nums.append ( self.nums [ i ] )
            people += self.nums [ i ]
        if people % self.n != 0 :
            print ( - 1 )
            return
        people /= self.n
        sum = 0
        output = self.n
        for i in range ( self.n ) :
            sum += self.nums [ i ]
            if sum == people * ( i + 1 ) :
                output -= 1
        print ( output )
