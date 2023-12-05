def import _sys , StringIO , deque , int , N
class Main ( object ) :
    def __init__ ( self ) :
        self.K = 0
        self.N = 0
    def dec ( self ) :
        if self.N == 1 : self.N = self.N
        else :
            self.N = self.N - 1
            while len ( self ) < N : self.N += 1
    def main ( self ) :
        with open ( "/proc/self/" , "r" ) as f :
            K = self.K
            N = self.N
            ans = deque ( )
            if K % 2 == 0 :
                ans.append ( K // 2 )
                while N > 1 : ans.append ( K )
        else :
            for i in range ( N ) : ans.append ( ( K + 1 ) // 2 )
            for i in range ( ( N // 2 ) ) :
                dec ( ans )
        f.write ( "\n" )
        s = ''.join ( [ str ( i ) for i in ans if i != 0 ] )
        print ( s , file = sys.stdout )
