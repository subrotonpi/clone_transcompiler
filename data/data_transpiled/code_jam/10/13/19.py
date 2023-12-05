def import import _sys , sys , StringIO , sys , text
class CS ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.stdin = sys.stdin
        self.fmt = '%.000000000'
    def __init__ ( self ) :
        try :
            TCase , cc = struct.unpack ( '>i' , struct.pack ( '>i' , 0 ) )
        except :
            TCase = 0
        for cc in range ( 1 , TCase + 1 ) :
            Amin , Amax , Bmin , Bmax = struct.unpack ( '>i' , struct.pack ( '>i' , 0 ) )
            res = 0
            for A in range ( Amin , Amax + 1 ) :
                for B in range ( Bmin , Bmax + 1 ) :
                    res += sim ( A , B )
            print ( 'Case #%d: %d' % ( cc , res ) , file = sys.stderr )
    def sim ( A , B ) :
        if A == B : return 0
        if A < B : return sim ( B , A )
        if A >= 2 * B : return 1
        return 1 - sim ( B , A - B )
    def main ( self ) :
        start_time = time.time ( )
        ( CS ( ) , sys.stdout , sys.stderr ) = ( sys.stdout , sys.stderr )
        end_time = time.time ( )
        ms = end_time - start_time
        sec = ms / 1000
        ms = ms % 1000
        min , sec = sec / 60 , sec % 60
        sys.stderr.write ( 'Time Spent: %d minute(s) %d second(s) %d (ms)\n' % ( min , sec , ms ) )
