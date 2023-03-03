def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.H , self.W , self.N = self.N , self.N
    def snake ( self , n , x ) :
        h , w = self.H // self.W , self.N
        if h % 2 == 1 :
            w = self.W - w - 1
        self.ans [ h , w ] = x + 1
    def main ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            self.H , self.W , self.N = sc.read ( ).split ( )
    def snake ( self , n ) :
        self.ans = [ ]
        for a in range ( self.N ) :
            for i in range ( a ) :
                self.ans.append ( i )
        self.ans = [ ]
        for n in self.nums :
            snake ( n , n )
        for i in range ( self.H ) :
            print ( self.ans [ i ] [ 0 ] , end = '' )
            for j in range ( 1 , self.W ) :
                print ( " " , self.ans [ i ] [ j ] , end = '' )
            print ( '\n' , end = '' )
