def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
        def __call__ ( self , * args ) :
            self.n = self.n
        def __getitem__ ( self , i ) :
            self.n = self.n
        def __call__ ( self , * args ) :
            self.n = self.n
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    tmp = 0
    cnt = 0
    ans = 0
    for i in range ( n ) :
        if tmp < a [ i ] :
            cnt += 1
        else :
            ans += ( cnt * ( cnt + 1 ) ) / 2
            cnt = 1
        tmp = a [ i ]
        if i == n - 1 :
            ans += ( cnt * ( cnt + 1 ) ) / 2
    sys.exit ( ans )
