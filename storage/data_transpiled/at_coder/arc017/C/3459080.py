def power ( n , x ) :
    from math import pow
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = n
            self.x = x
            self.n = n
            self.x = x
            self.n = n
            self.x = x
            self.n = n
            self.x = x
            self.n = n
            self.n = n
            self.x = x
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.n = n
            self.a = self.n
            self.b = n - a
            self.lena = power ( 2 , a )
            self.lenb = power ( 2 , b )
            paca = [ ]
            pacb = [ ]
            for i in range ( pow ( 2 , a ) ) :
                for j in range ( a ) :
                    if ( 1 & i >> j ) == 1 :
                        paca.append ( self.n [ j ] )
            for i in range ( pow ( 2 , b ) ) :
                for j in range ( b ) :
                    if ( 1 & i >> j ) == 1 :
                        pacb.append ( self.n [ a + j ] )
            pacb.append ( - 1 )
            paca.sort ( )
            pacb.sort ( )
            ans = 0
            r = self.lenb
            l = r
            for i in range ( self.n ) :
                if paca [ i ] > x :
                    break
                elif i >= 1 and paca [ i ] == paca [ i - 1 ] :
                    ans += r - l
                else :
                    r = l
                    while pacb [ r ] > x - paca [ i ] :
                        r -=