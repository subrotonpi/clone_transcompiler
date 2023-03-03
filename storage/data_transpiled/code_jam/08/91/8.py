def import Scanner , solve
import os
import sys
import sys
class Main ( Scanner ) :
    def __init__ ( self ) :
        Scanner ( self ).__init__ ( )
    def solve ( self ) :
        n = len ( self.input )
        x = [ ]
        y = [ ]
        z = [ ]
        M = 10000
        for i in range ( n ) :
            x.append ( self.input [ i ] )
            y.append ( self.input [ i ] )
            z.append ( self.input [ i ] )
        k = [ 0 ] * ( M + 2 )
        best = 0
        for u in range ( 0 , M ) :
            [ k ] = 0
            for i in range ( n ) :
                if x [ i ] <= u :
                    if y [ i ] <= M - u - z [ i ] + 1 :
                        k [ y [ i ] ] += 1
                        k [ M - u - z [ i ] + 1 ] -= 1
                bb = 0
                b = 0
                for i in range ( 0 , M ) :
                    bb += k [ i ]
                    if b < bb :
                        b = bb
                if best < b :
                    best = b
        self.output = file ( self.input , "w" )
    def run ( self ) :
        Scanner ( self ).run ( )
        out = file ( self.output , "w" )
        _ = Scanner ( self.input , "r" ).run ( )
        for __ in range ( _ ) :
            out.write ( "Case #%d: " % ( __ + 1 ) )
            self.solve ( )
