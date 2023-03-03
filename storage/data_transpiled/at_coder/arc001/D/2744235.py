def _ ( ) : return
import sys
import os
def main ( ) :
    def run ( ) :
        with open ( '/proc/stdout' , 'r' ) as sc :
            H , W = 8 , 8
            field = [ ]
            for i in range ( H ) :
                field.append ( sc.read ( ) )
        if dfs ( 0 , field ) :
            output ( field )
        else :
            pln ( 'No Answer' )
    def dfs ( y , field ) :
        if y == 8 :
            return True
        target = - 1
        for x in range ( 8 ) :
            if field [ y ] [ x ] == 'Q' :
                if target != - 1 :
                    return False
                target = x
        if target != - 1 :
            if can_put ( y , target , field ) :
                if dfs ( y + 1 , field ) :
                    return True
        else :
            for x in range ( 8 ) :
                if can_put ( y , x , field ) :
                    field [ y ] [ x ] = 'Q'
                    if dfs ( y + 1 , field ) :
                        return True
                field [ y ] [ x ] = '.'
        return False
    def is_in ( y , x ) :
        return y in range ( 8 ) and x in range ( 8 )
    def can_put ( y , x , field ) :
        for dy in range ( - 1 , 1 ) :
            for dx in range ( - 1 , 1 ) :
                if dy == 0 and dx == 0 :
                    continue
                ty = y
                tx = x
                while True :
                    ty += dy
                    tx += dx
                    if not is_in ( ty , tx ) :
                        break
                    if field [ ty ] [ tx ] == 'Q' :
                        return False
        return True
    return False
