def _ ( ) : return 0
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 5
        self.DP_NUM = 0x1 << self.N * self.N
        self.MOD = 1000000007
    def __call__ ( self , x , y ) :
        sc = open ( "/proc/" , "r" )
        f = [ [ ] for _ in range ( self.N ) ]
        for x in range ( self.N ) :
            f [ y ] [ x ] = sc.read ( )
        sc.close ( )
        dp = [ 1 ] * self.DP_NUM
        for m in range ( self.DP_NUM - 1 ) :
            if dp [ m ] == 0 : continue
            n = sum ( [ m ] ) + 1
            for i in range ( self.N ** 2 ) :
                if m & 0x1 << i : continue
                y , x = i // self.N , i % self.N
                if f [ y ] [ x ] != 0 and f [ y ] [ x ] != n : continue
                if self.check ( y , x , m ) :
                    nm = m | 0x1 << i
                    dp [ nm ] = ( dp [ nm ] + dp [ m ] ) % MOD
        print ( dp [ self.DP_NUM - 1 ] )
    def check ( self , y , x , m ) :
        lx , rx = x - 1 , x + 1
        uy , dy = y - 1 , y + 1
        if lx >= 0 and rx < self.N :
            ltmp = 0x1 << ( lx + y * self.N )
            rtmp = 0x1 << ( rx + y * self.N )
            if ( m & ltmp ) == 0 and ( m & rtmp ) > 0 or ( m & ltmp ) > 0 and ( m & rtmp ) == 0 : return False
        if uy >= 0 and dy < self.N :
            utmp = 0x1 << ( x + uy * self.N )
            dtmp = 0x1 << ( x + dy * self.N )
            if ( m & utmp ) == 0 and ( m & dtmp ) > 0 or ( m & utmp ) > 0 and ( m & dtmp ) == 0 : return False
        return