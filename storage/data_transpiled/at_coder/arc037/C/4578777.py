def _import ( ) :
    import sys
    import os
    import os
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.N = self.N
            self.K = self.K
            self.yoko = [ ]
            for i in range ( self.N ) :
                self.yoko.append ( sc.randint ( self.N ) )
            self.tate = [ ]
            self.yoko.append ( self.yoko )
            self.tate.append ( self.tate )
            self.min = self.yoko [ 0 ] * self.tate [ 0 ]
            self.max = self.yoko [ N - 1 ] * self.tate [ N - 1 ]
            while self.max - self.min > 1 :
                mid = ( self.max + self.min ) / 2
                sum = 0
                for i in range ( self.N ) :
                    tmp = _lower_bound ( self.yoko , mid // self.tate [ i ] + 1 )
                    if tmp == - 1 :
                        sum += N
                    else :
                        sum += tmp
                if sum >= K :
                    self.max = mid
                else :
                    self.min = mid
            res = self.min
            tmpans = 0
            for i in range ( self.N ) :
                tmp = _lower_bound ( self.yoko , min // self.tate [ i ] + 1 )
                if tmp == - 1 :
                    tmpans += N
                else :
                    tmpans += tmp
            if tmpans >= K :
                self.pl ( res )
            else :
                self.pl ( max )
    class SC ( object ) :
        def __init__ ( self ) :
            self.reader = None
            self.tokenizer = None
        def __call__ ( self , * args ) :
            if not self.tokenizer or not self.tokenizer :
                try :
                    self.tokenizer = self.tokenizer
                except AttributeError :
                    raise __builtin__
    return SC ( )
