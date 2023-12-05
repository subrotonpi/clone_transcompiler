def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.stu = [ [ ] for _ in range ( self.n ) ]
        self.cp = [ [ ] for _ in range ( self.m ) ]
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.stu = [ [ ] for _ in range ( self.n ) ]
        self.cp = [ [ ] for _ in range ( self.m ) ]
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.stu = [ [ ] for _ in range ( self.n ) ]
        self.cp = [ [ ] for _ in range ( self.m ) ]
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.stu = [ [ ] for _ in range ( self.n ) ]
        self.cp = [ [ ] for _ in range ( self.m ) ]
    def __init__ ( self , n , m ) :
        self.n = int ( n )
        self.m = int ( m )
        self.stu = [ [ ] for _ in range ( self.n ) ]
        self.cp = [ [ ] for _ in range ( self.m ) ]
    for i in range ( len ( self.stu ) ) :
        min = - 1
        d = 1000000000
        for j in range ( len ( self.cp ) ) :
            temp = abs ( self.stu [ i ] - self.cp [ j ] ) + abs ( self.stu [ i ] - self.cp [ j ] )
            if d > temp :
                min = j
                d = temp
        print ( min + 1 )
