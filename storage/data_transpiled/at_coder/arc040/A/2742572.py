def _ _ new _ _ ( ) : return next ( )
def char ( ) : return next ( )
def Int ( ) : return int ( next ( ) )
def Long ( ) : return long ( next ( ) )
def Double ( ) : return double ( next ( ) )
class Main ( ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
class IO ( ) :
    def __init__ ( self , * args ) :
        self.IO = IO
        self.out = sys.stdout
        INF = sys.maxsize // 2
        def stream ( self ) :
            self.solve ( )
            self.out.flush ( )
        def solve ( self ) :
            N = self.IO.Int ( )
            S = self.IO.StringArr ( N )
            r_cnt = 0
            b_cnt = 0
            for i in range ( N ) :
                for c in S [ i ] :
                    if c == 'R' :
                        r_cnt += 1
                    if c == 'B' :
                        b_cnt += 1
            ans = 'TAKAHASHI' if r_cnt > b_cnt else 'AOKI' if r_cnt < b_cnt else 'DRAW'
            self.out.write ( ans )
        def FOR ( self , a , b , act ) :
            for i in range ( a , b ) :
                act ( i )
        def REP ( self , a , act ) :
            FOR ( 0 , a , act )
    class IO ( ) :
        def __init__ ( self , * args ) :
            self.IO = IO
            self.buffer = [ ]
            self.ptr , self.buff_len = 0 , 0
        def has_next_byte ( self ) :
            if self.ptr < self.buff_len : return True
            ptr = 0
            try :
                buff_len = self.buffer.read ( 1 << 12 )
            except AttributeError :
                pass
            return buff_len
        def readByte ( self ) : return self.ptr if self.ptr else - 1
        def is_printable_char ( char ) : return 33 <= char <= 126
        def skip_unprintable ( self ) :
            while self.has_next_byte ( ) and not is_printable_@@