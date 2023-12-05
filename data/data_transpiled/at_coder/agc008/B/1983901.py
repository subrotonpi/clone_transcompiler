def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.argv [ 1 ] )
        self.k = int ( sys.argv [ 2 ] )
    def __init__ ( self ) :
        self.n = int ( sys.argv [ 1 ] )
        self.k = int ( sys.argv [ 3 ] )
        a = [ ]
        for i in range ( self.n ) :
            a.append ( self.n )
    def __init__ ( self ) :
        self.a = [ ]
    def ans1 ( self ) :
        self.ans2 ( )
        self.max = - 1000000000000000
        self.max2 = - 1000000000000000
        self.min = 1000000000000000
        self.posmax = 0
        self.posmin = 0
        l1 = s1 = 0
        for j in range ( self.k ) :
            if a [ j ] > 0 :
                l1 += a [ j ]
            if a [ j ] < 0 :
                s1 += a [ j ]
        if s1 > max :
            self.max = s1
            self.posmax = 0
        if l1 < min :
            self.min = l1
            self.posmin = 0
        for i in range ( 1 , self.n + 1 - k ) :
            l = l1
            if a [ i - 1 ] > 0 :
                l -= a [ i - 1 ]
            if a [ i - 1 + k ] > 0 :
                l += a [ i - 1 + k ]
            s = s1
            if a [ i - 1 ] < 0 :
                s -= a [ i - 1 ]
            if a [ i - 1 + k ] < 0 :
                s += a [ i - 1 + k ]
            if s > max :
                self.max = s
                self.posmax = i
            if l < min :
                self.min = l
                self.posmin = i
            l1 = l
            s1 = s
        for i in range ( self.n ) :
            if ( i < posmin or i > posmin + k - 1 ) and a [ i ] > 0 :
                self.ans1 += a [ i ]
        self.ans@@