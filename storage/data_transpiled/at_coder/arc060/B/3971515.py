def _import ( ) : return _import ( "" )
class Main ( object ) :
    def __init__ ( self , args ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        S = sc.__next__ ( )
        ans = 1000000000
        ans *= 10
        ank = ans
        if N < S :
            print ( - 1 )
        elif N == S :
            print ( N + 1 )
        else :
            for i in range ( 1 , N - S + 1 ) :
                if ( N - S ) % i == 0 :
                    if judge ( i + 1 , N , S ) :
                        ans = min ( ans , i + 1 )
                    if judge ( ( ( N - S ) / i ) + 1 , N , S ) :
                        ans = min ( ans , ( N - S ) / i + 1 )
            if ans == ank :
                print ( - 1 )
            else :
                print ( ans )
    def judge ( i , n , s ) :
        while n > 0 :
            s -= n % i
            n /= i
        if s == 0 :
            return True
        else :
            return False
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        self.buflen = self.buffer.__next__ ( )
                    except StopIteration :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __next__ ( ) :
                if not self.hasNext ( ) :
                    raise StopIteration
                yield self.ptr
    def __next__ ( ) :
        if not self.hasNext ( ) :
            raise StopIteration
return Main ( )
