def import import sys , StringIO , getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin.close ( )
    def add ( self , x , y ) :
        self.x += y
        return x >= mod
    def mul ( self , x , y ) :
        return int ( ( x * 1 ** y ) % mod )
    def solve ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.mod = int ( self.k )
        c = [ [ ] for _ in range ( 1 , n + 1 ) ]
        c.append ( [ 1 ] )
        for i in range ( 1 , len ( c ) ) :
            c [ i ] [ 0 ] = 1
            for j in range ( 1 , len ( c [ i ] ) ) :
                c [ i ] [ j ] = add ( c [ i - 1 ] [ j - 1 ] , c [ i - 1 ] [ j ] )
        dp = [ [ 1 ] * ( n + 1 ) ]
        for cur_len in range ( 1 , n + 1 ) :
            for pos in range ( cur_len ) :
                sum = 0
                for next_value in range ( k , - 1 , - 1 ) :
                    dp [ cur_len ] [ next_value ] = add ( dp [ cur_len ] [ next_value ] , mul ( sum , mul ( c [ cur_len - 1 ] [ pos ] , dp [ cur_len - pos - 1 ] [ next_value ] ) ) )
                    sum = add ( sum , dp [ pos ] [ next_value ] )
        return dp
    def run ( self ) :
        try :
            self.stdin = open ( "Main.in" , "r" )
            self.stdout = open ( "Main.out" , "w" )
            self.solve ( )
            self.stdout.close ( )
        except IOError :
            pass
    def runIO ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.solve ( )
        self.stdout = open ( "Main.out" , "r" )
