def import _import_string
class Slam ( object ) :
    def __init__ ( self ) :
        self.basic = [ ]
    def basic ( self ) :
        self.basic.append ( 10 )
        for i in range ( 2 , 15 ) :
            if i % 2 == 0 :
                self.basic [ i ] = self.basic [ i - 1 ] + 2 * int ( math.pow ( 10 , i / 2 ) ) - 1
            else :
                self.basic [ i ] = self.basic [ i - 1 ] + int ( ( math.pow ( 10 , i / 2 ) ) + ( math.pow ( 10 , ( i + 1 ) / 2 ) ) - 1 )
    def allzero ( self , t ) :
        for ch in t :
            if ch != '0' : return False
        return True
    def f ( self , v ) :
        if v < 10 : return v
        L = len ( ( "%d" % v ) )
        right = ( "%d" % v ) [ L / 2 : L ]
        left = ( "%d" % v ) [ : L / 2 ]
        if allzero ( right ) : return 1 + f ( self , v - 1 )
        result = self.basic [ L - 1 ] + int ( right ) + int ( reversed ( left ) )
        result = min ( result , basic [ L - 1 ] + ( v - long ( math.pow ( 10 , L - 1 ) ) ) )
        return result
    def main ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            k = sc.read ( )
            for kk in range ( 1 , k + 1 ) : print ( "Case #%d: %s" % ( kk , f ( sc.read ( ) ) ) )
