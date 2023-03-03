def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.color = [ ]
    def input ( self ) :
        with open ( self.input , 'r' ) as f :
            self.N = len ( f.readlines ( ) )
            for i in range ( self.N ) :
                self.color.append ( f.readlines ( ) [ i ] )
    def main ( self , args ) :
        self.input ( )
        self.cnt0 = 0
        self.cnt1 = 0
        for i in range ( self.N ) :
            if self.color [ i ] == 0 :
                cnt0 += 1
            if self.color [ i ] == 1 :
                cnt1 += 1
        if self.cnt0 == self.N or self.cnt1 == self.N :
            print ( - 1 )
            return
        head = 0
        for i in range ( self.N ) :
            if self.color [ i ] != self.color [ i + 1 ] :
                head = i + 1
                break
        self.array_list = [ self.color [ i ] for i in range ( head , self.N ) ]
        for i in range ( self.head ) :
            self.array_list.append ( self.color [ i ] )
        self.max = 0
        count = 0
        for i in range ( self.N - 1 ) :
            if self.array_list [ i ] == self.array_list [ i + 1 ] :
                count += 1
            else :
                count = 0
            self.max = max ( count , self.max )
        print ( self.max / 2 + 1 )
