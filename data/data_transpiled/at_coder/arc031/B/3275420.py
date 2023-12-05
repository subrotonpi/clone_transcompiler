def _ ( ) : return
import sys
import os
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        map = [ ]
        area = 0
        def __init__ ( self ) :
            for i in range ( 10 ) :
                map.append ( sc.read ( ).decode ( 'utf-8' ) )
                for j in range ( 10 ) :
                    if map [ i ] [ j ] == 'o' : area += 1
        self.dx = [ 0 , 1 , 0 , - 1 ]
        self.dy = [ - 1 , 0 , 1 , 0 ]
        F = False
        loop :
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                land_num = 0
                if map [ i ] [ j ] == 'x' :
                    for k in range ( 4 ) :
                        y = i + dy [ k ]
                        x = j + dx [ k ]
                        if y < 0 or x < 0 or y > 9 or x > 9 : continue
                        if map [ y ] [ x ] == 'o' : land_num += 1
                if land_num >= 2 :
                    memo = [ ]
                    self.dfs ( i , j , 0 , memo )
                    area_num = 0
                    for k in range ( 10 ) :
                        for l in range ( 10 ) :
                            if memo [ k ] [ l ] : area_num += 1
                    if area_num == area + 1 :
                        F = True
                        break loop
        self.out.write ( 'YES' if F else 'NO' )
    def dfs ( self , sy , sx , n , memo ) :
        if sy < 0 or sx < 0 or sy > 9 or sx > 9 : return
        if n != 0 and map [ sy ] [ sx ] == 'x' : return
        if memo [ sy ] [ sx ] : return
        memo [ sy ] [ sx ] = True
        self.dfs ( sy - 1 , sx , n + 1 , memo )
