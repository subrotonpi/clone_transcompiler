def bribetheprisoners ( ) :
    import os
    import sys
    import struct
    import json
    class Main ( Base ) :
        P , Q = struct.unpack ( '>i' , [ 'P' , 'Q' ] )
        free = [ ]
        bribe = [ ]
        def __init__ ( self ) :
            self.m = Main ( )
            self.m.run ( 'C' , 'large' )
        def load ( self ) :
            s = self.br.readline ( ).split ( )
            P , Q = int ( s [ 0 ] ) , int ( s [ 1 ] )
            free = [ 0 ] * Q + [ P + 1 ]
            s = self.br.readline ( ).split ( )
            for i in range ( Q ) :
                free [ i + 1 ] = int ( s [ i ] )
            free = [ int ( s [ i ] ) for i in free ]
            bribe = [ ]
        def compute ( self , i , j ) :
            if i == j :
                bribe [ i ] [ j ] = 0
                return
            best = - 1
            for k in range ( i + 1 , j ) :
                cur = bribe [ i ] [ k ] + bribe [ k ] [ j ] + ( free [ j ] - free [ i ] - 2 )
                if best == - 1 or cur <= best : best = cur
            if best == - 1 : best = 0
            bribe [ i ] [ j ] = best
        def solve ( self ) :
            for iv in range ( len ( self.free ) ) :
                for i in range ( len ( self.free ) ) :
                    j = self.free [ i ] + iv
                    if j >= len ( self.free ) :
                        break
                    compute ( self , i , j )
            print_result ( '%d' % bribe [ 0 ] [ Q + 1 ] )
