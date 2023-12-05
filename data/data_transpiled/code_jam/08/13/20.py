def _ ( ) : return
import decimal
import sys
import decimal
import decimal
import decimal
import decimal.Decimal as decimal
import decimal.Decimal as decimal
import decimal.Decimal as decimal
class C ( decimal.Decimal ) :
    def __init__ ( self ) :
        decimal.Decimal = decimal.Decimal
    def __repr__ ( self ) :
        return repr ( self )
    rep = 1000
    def run ( self ) :
        r5 = root ( decimal.Decimal ( 5 ) )
        d = decimal.Decimal ( 3 ) + r5
        with decimal.Scanner ( ) as sc :
            on = sc.next ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , end = "" )
                n = sc.next ( )
                print ( f ( d ** n ).toPlainString ( ) )
    def f ( s ) :
        s = s.split ( "." ) [ 0 ]
        if s [ - 3 : ] == "0" :
            s = s [ : - 3 ]
        while len ( s ) < 3 :
            s = "0" + s
        return s
    def root ( d ) :
        left , right = 0 , d
        two = decimal.Decimal ( 2 )
        for i in range ( rep ) :
            mid = left + right // two
            if mid * mid > d :
                right = mid
            else :
                left = mid
        return left
    def debug ( self , * os ) :
        print ( * deeprepr ( os ) , file = sys.stderr )
