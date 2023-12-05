def import import *
import decimal
import sys
import decimal
import math
class C ( object ) :
    def __init__ ( self , arg ) :
        self.base = decimal.Decimal ( "5.2360679774997896964091736687312762354406183596115257242708972454105209256378048994144144083787822749" )
    def __init__ ( self , t ) :
        self.t = t
    def go ( self ) :
        for ca in range ( 1 , t + 1 ) :
            n = self.n
            ans = base ** n
            ss = ans.toPlainString ( )
            i = 0
            for i in range ( 0 , len ( ss ) ) :
                out = ""
                for j in range ( 1 , 3 ) :
                    if i - j >= 0 :
                        out = ss [ i - j : i - j + 1 ] + out
                    else :
                        out = "0" + out
                print ( "Case #{}: {}".format ( ca , out ) )
