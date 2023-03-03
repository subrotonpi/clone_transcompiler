def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.q = int ( self.q )
        L = [ ]
        R = [ ]
        map = { }
        for i in range ( self.m ) :
            L.append ( _sys.maxint )
            R.append ( _sys.maxint )
            map [ L [ i ] ] [ R [ i ] ] += 1
        sum = [ [ 0 ] * ( n + 1 ) for i in range ( 1 , self.n + 1 ) ]
        for i in range ( self.n + 1 ) :
            for j in range ( self.n + 1 , self.n + 1 ) :
                sum [ i ] [ j ] = sum [ i ] [ j - 1 ] + map [ i ] [ j ]
        P = [ _sys.maxint ] * ( q + 1 )
        Q = [ _sys.maxint ] * ( q + 1 )
        for i in range ( self.q ) :
            P.append ( _sys.maxint )
            Q.append ( _sys.maxint )
            ans = 0
            for j in range ( self.P [ i ] , self.Q [ i ] + 1 ) :
                ans += sum [ j ] [ Q [ i ] ] - sum [ j ] [ P [ i ] - 1 ]
            print ( ans )
class Pair ( object ) :
    def __init__ ( self ) :
        self.from = None
        self.end = None
        self.num = None
        self.bango = None
    def __eq__ ( self , other ) :
        otherpair = other
        return self.from == other.num
    def __ne__ ( self , other ) :
        otherpair = other
        return self.to == other.num
