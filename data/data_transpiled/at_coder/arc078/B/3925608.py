def _import ( ) : return 33
import StringIO
import StringIO
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self.args = args
    def read ( ) :
        sc = FastScanner ( )
        N = sc.randint ( 0 , 2 )
        self.visited = [ ]
        self.length = [ ]
        self.F = 0
        self.S = 0
        self.list = [ ]
        for i in range ( N ) :
            self.list.append ( [ ] )
        for i in range ( N - 1 ) :
            a = sc.randint ( 0 , 1 )
            b = sc.randint ( 0 , 1 )
            self.list [ a ].append ( b )
            self.list [ b ].append ( a )
        self.search ( 0 , 0 , 0 )
        self.search ( N - 1 , 0 , 1 )
        for i in range ( N ) :
            if self.length [ i ] [ 0 ] <= self.length [ i ] [ 1 ] :
                self.F += 1
            else :
                self.S += 1
        if self.F > self.S :
            print ( "Fennec" )
        else :
            print ( "Snuke" )
    def search ( i , j , k ) :
        if self.visited [ i ] [ k ] == 1 :
            return i
        else :
            self.visited [ i ] [ k ] = 1
            self.length [ i ] [ k ] = j
            for p in self.list [ i ] :
                search ( p , j + 1 , k )
    class FastScanner ( object ) :
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = sys.stdin
            self.stream = stream
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try : self.buflen = stream.read ( self.ptr )
                    except AttributeError : pass
                    if self.buflen <= 0 :
                        return False
        