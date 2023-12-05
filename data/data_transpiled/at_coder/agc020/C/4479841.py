def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ [ ] for i in range ( 201 ) ]
        self.grid = [ [ ] for i in range ( 201 ) ]
    def __init__ ( self ) :
        sc = _main.raw_input ( )
        self.n = sc.n
        self.arr = [ ]
        self.sum = 0
        for i in range ( self.n ) :
            self.arr.append ( sc.__next__ ( ) )
            self.sum += self.arr [ i ]
        bs = [ self.sum + 1 ]
        for i in range ( self.n ) :
            curr = bs [ self.arr [ i ] : self.sum + 1 ]
            bs.append ( curr )
        start = 0
        if self.sum % 2 == 0 :
            start = self.sum / 2
        else :
            start = ( self.sum + 1 ) / 2
        for i in range ( start , self.sum + 1 ) :
            if self.bs [ i ] :
                print ( i )
                break
def print_dist_sum ( self , arr , n ) :
    self.sum = 0
    for i in range ( self.n ) :
        self.sum += arr [ i ]
    dp = [ [ True for i in range ( 0 , n + 1 ) ] for i in range ( 1 , n + 1 ) ]
    for i in range ( 0 , self.n ) :
        dp [ i ] [ 0 ] = True
        for i in range ( 1 , self.n ) :
            dp [ i ] [ self.arr [ i - 1 ] ] = True
            for j in range ( 1 , self.sum + 1 ) :
                if dp [ i - 1 ] [ j ] == True :
                    dp [ i ] [ j ] = True
                    dp [ i ] [ j + self.arr [ i - 1 ] ] = True
        for j in range ( 0 , self.sum + 1 ) :
            if dp [ self.n ] [ j ] == True :
                print ( j , end = ' ' )
