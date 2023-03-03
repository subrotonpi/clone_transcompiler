def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.k = int ( self.k )
            self.a = [ ]
            for i in range ( self.n ) :
                self.a.append ( self.a [ i ] )
    count = 0
    for _ in range ( 1 , k + 1 ) :
        x = 0
        for count in range ( 1 , k + 1 ) :
            tmp = x + ( 1 << count )
            if tmp > k :
                continue
            t = u = 0
            for l in a :
                t += l ^ tmp
                u += l ^ x
            if t >= u :
                x = tmp
        ans = 0
        for l in a :
            ans += l ^ x
        print ( ans )
