def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h , w = sc.readline ( ).split ( )
        a = [ ]
        q = [ ]
        for i in range ( h ) :
            for j in range ( w ) :
                a.append ( [ int ( sc.readline ( ) ) ] )
                q.append ( ( i * w + j , a [ i ] [ j ] ) )
        q.sort ( )
        grd = [ ]
        for i in range ( h ) :
            for j in range ( w ) :
                grd [ i ] [ j ] = 1
        MOD = int ( 1e9 ) + 7
        dx = [ 0 , 1 , 0 , - 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        for p in q :
            for j in range ( 4 ) :
                x = p [ z ] % w
                y = p [ z ] / w
                nx = x + dx [ j ]
                ny = y + dy [ j ]
                if 0 <= nx < w and 0 <= ny < h and a [ ny ] [ nx ] < a [ y ] [ x ] :
                    grd [ ny ] [ nx ] = ( grd [ ny ] [ nx ] + grd [ y ] [ x ] ) % MOD
        ans = 0
        for i in range ( h ) :
            for j in range ( w ) :
                ans = ( ans + grd [ i ] [ j ] ) % MOD
        print ( ans )
class Point ( object ) :
    def __init__ ( self , z , val ) :
        self.z = z
        self.val = val
    def __lt__ ( self , other ) :
        self.z = self.z - other.val
    def __gt__ ( self , other ) :
        self.z = other.z - other.val
    def __ge__ ( self , other ) :
        self.z = other.z
