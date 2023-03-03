def import import sys
class a :
    def __init__ ( self ) :
        self.a = a
    def go ( self ) :
        numc = self.numc
        for cnum in range ( numc ) :
            a , b = self.a , self.b
            p = [ ]
            for i in range ( a ) :
                p.append ( self.p [ i ] )
            pp = [ 1 ]
            for i in range ( 1 , a + 1 ) :
                pp.append ( pp [ i - 1 ] * p [ i - 1 ] )
            min = 2 + b
            for i in range ( 0 , a ) :
                pcor = pp [ a - i ]
                min = min ( min , pcor * ( i + i + b - a + 1 ) + ( 1 - pcor ) * ( i + i + b - a + 1 + b + 1 ) )
            print ( "Case #%d: %.7f\n" % ( cnum + 1 , min ) )
