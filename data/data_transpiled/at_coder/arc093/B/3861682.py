def _import ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self.args = args
    def read ( self ) :
        sc = FastScanner ( )
        A = sc.read ( )
        B = sc.read ( )
        table = [ ]
        for i in range ( 50 ) :
            for j in range ( 100 ) :
                table [ i ].append ( '.' )
        for i in range ( 50 ) :
            for j in range ( 100 ) :
                table [ i ].append ( '#' )
        pos1 = 0
        pos2 = 9999
        for i in range ( 1 , B ) :
            x , y = pos1 // 100 , pos1 % 100
            table [ x ].append ( '#' )
        pos1 += 2
        if pos1 % 100 == 0 :
            pos1 += 100
        for i in range ( 1 , A ) :
            x , y = pos2 // 100 , pos2 % 100
            table [ x ].append ( '.' )
        pos2 -= 2
        if pos2 % 100 == 1 :
            pos2 -= 100
    print ( 100 , 100 )
    for i in range ( 100 ) :
        for j in range ( 100 ) :
            print ( table [ i ] [ j ] , end = '' )
        print ( )
class Pair ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __eq__ ( self , other ) :
        O = other.a
        if O.a == self.a and O.b == self.b :
            return True
        else :
            return False
    def __hash__ ( self ) :
        return hash ( self.a )
class SampleComparator ( object ) :
    def __init__ ( self , P , Q ) :
        temp = Q.a - P.a
        if temp == 0 :
            return self.b
