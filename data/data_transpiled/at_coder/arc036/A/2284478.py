def import sys , string , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.k = int ( sys.stdin.readline ( ) )
        self.temp0 , self.temp1 , self.temp2 = string.split ( self.temp0 )
        self.sum = self.temp0 + self.temp1 + self.temp2
        if self.sum < self.k :
            print ( 3 )
            self.traceback.print_stack ( )
            return
        for i in range ( 4 , self.n + 1 ) :
            self.sum -= self.temp0
            self.temp0 , self.temp1 , self.temp2 = self.temp1 , self.temp2
            self.sum += self.temp2
            if self.sum < self.k :
                print ( self.i )
                self.traceback.print_stack ( )
                return
        print ( - 1 )
        self.traceback.print_stack ( )
