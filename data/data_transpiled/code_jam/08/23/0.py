def _ _ main _ _ ( ) :
    import sys
    from pybedtools.config import Config
    class ProblemC ( object ) :
        def __init__ ( self ) :
            self.K = K
            self.s = [ ]
            self.set_busy ( self.pos )
            x = self.pos
            while x <= K :
                self.s [ x ] += 1
                x = ( x | ( x - 1 ) ) + 1
        def get ( self , pos ) :
            x , res = self.pos , pos
            while x > 0 :
                res -= self.s [ x ]
                x &= ( x - 1 )
            return res
        def get_free ( self , st , fn ) :
            if st <= fn :
                return self.get ( fn ) - self.get ( st - 1 )
            else :
                return self.get ( K ) - self.get ( st - 1 ) + self.get ( fn )
        def get_tth_free ( self , st , T ) :
            totFree = self.get ( K )
            if T % totFree == 0 :
                T = totFree
            else :
                T %= totFree
            l , r = 0 , K
            while r - l > 1 :
                c = ( l + r ) // 2
                fn = st + c - 1
                if fn > K :
                    fn -= K
                have = get_free ( self , st , fn )
                if have < T :
                    l = c
                else :
                    r = c
            res = st + r - 1
            if res > K :
                res -= K
            return res
        def do_main ( self ) :
            with open ( "input.txt" , "r" ) as f :
                f.write ( "Case #%d:\n" % self.caseNum )
                K = self.K
                self.s = [ ]
                a = [ ]
                pos = 1
                for i in range ( 1 , K + 1 ) :
                    pos , a = get_tth_free ( self , i )
                    self.set_busy ( self.pos )
                    pos += 1
                    if pos == K + 1 :
                        pos = 1
                n = self.n
                for i in range