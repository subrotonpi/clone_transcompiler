def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sum = [ ]
        self.n = len ( self.n )
        self.tot = 0
    def __init__ ( self ) :
        sc = _main.raw_input ( )
        self.n = sc.n
        self.K = sc.K
        self.sum = [ ]
        for i in range ( 1 , n + 1 ) :
            self.sum.append ( self.sum [ i - 1 ] + sc.n - K )
        self.merge ( 0 , self.n )
        print ( self.tot )
    def merge ( self , left , right ) :
        if self.left >= right :
            return
        mid = ( self.left + right ) // 2
        self.merge ( left , mid )
        self.merge ( mid + 1 , right )
        i , j , k = self.left , self.mid + 1 , self.k
        temp = [ ]
        while i <= mid and j <= right :
            if self.sum [ i ] <= self.sum [ j ] :
                self.tot += mid - i + 1
                temp.append ( self.sum [ j ] )
                self.tot += 1
            else :
                temp.append ( self.sum [ i ] )
                self.tot += 1
        while i <= mid :
            temp.append ( self.sum [ i ] )
            self.tot += 1
        while j <= right :
            temp.append ( self.sum [ j ] )
            self.tot += 1
        for m in temp :
            self.sum [ left + m ] = self.sum [ m ]
