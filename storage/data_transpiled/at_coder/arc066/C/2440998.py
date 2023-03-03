def import import sys , string , symbols , Dummy , Sum , Fraction , Sum
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.sum = [ ]
        self.a = [ ]
        self.abssum = [ ]
        self.minusindex = [ ]
        for i in range ( N ) :
            if i == 0 :
                self.a.append ( sys.maxint )
                self.sum.append ( self.a [ i ] )
            else :
                minus = ( sys.stdin.read ( 1 ) == '-' )
                self.a.append ( sys.stdin.read ( 1 ) )
                self.sum.append ( self.sum [ i - 1 ] + self.a [ i ] * ( minus ) )
                if minus :
                    minusindex.append ( i - 1 )
        for i in range ( N - 1 , - 1 , - 1 ) :
            self.abssum.append ( self.abssum [ i + 1 ] + self.a [ i ] )
    def f ( self ) :
        return sum [ N - 1 ]
    def g ( self ) :
        return sum [ N - 1 ]
    def f ( self ) :
        return sum [ N - 1 ]
