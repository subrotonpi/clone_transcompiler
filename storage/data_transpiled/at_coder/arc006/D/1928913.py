def import _solve
import os
import sys
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve_d = True
    def solve_d ( self ) :
        f = open ( self.main.path )
        tokens = f.readline ( ).split ( )
        H = int ( tokens [ 0 ] )
        W = int ( tokens [ 1 ] )
        diff = [ - W - 1 , - W , - W + 1 , - 1 , 1 , W - 1 , W , W + 1 ]
        map = { }
        def search ( rc ) :
            for r , line in enumerate ( f ) :
                for c in range ( W ) :
                    if line [ c ] == 'o' :
                        map [ r * W + c ] = 1
            ans = [ ]
            for r in range ( H ) :
                for c in range ( W ) :
                    if map [ r * W + c ] :
                        ans.append ( judge ( search ( r * W + c ) ) )
            print ( ans [ 0 ] , ans [ 1 ] , ans [ 2 ] )
        def judge ( size ) :
            for zoom in range ( 1 , 150 ) :
                if size % 12 == 0 and size / 12 == zoom * zoom :
                    return 0
                if size % 16 == 0 and size / 16 == zoom * zoom :
                    return 1
                if size % 11 == 0 and size / 11 == zoom * zoom :
                    return 2
            return - 1
        def search ( rc ) :
            sum = 1
            map [ rc ] = False
            for dir in range ( 8 ) :
                if map [ rc + dir ] :
                    sum += search ( rc + dir )
            return sum
return Main
