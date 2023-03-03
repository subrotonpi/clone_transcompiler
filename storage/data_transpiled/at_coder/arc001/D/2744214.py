def _ ( ) : return
import sys
import os
def main ( ) :
    def run ( ) :
        with open ( '/dev/tty' , 'r' ) as sc :
            H , W = 8 , 8
            field = [ ]
            for i in range ( H ) :
                field.append ( sc.read ( ) )
            if dfs ( 0 , 8 , field ) :
                output ( field )
            else :
                pln ( 'No Answer' )
    def dfs ( pos , nokori , field ) :
        if nokori == 0 :
            return True
        if pos == 64 :
            return False
        y = pos // 8
        x = pos % 8
        if field [ y ] [ x ] == 'Q' :
            if can_put ( y , x , field ) :
                if dfs ( pos + 1 , nokori - 1 , field ) :
                    return True
        else :
            if can_put ( y , x , field ) :
                field [ y ] [ x ] = 'Q'
                if dfs ( pos + 1 , nokori - 1 , field ) :
                    return True
        if dfs ( pos + 1 , nokori , field ) :
            return True
        return False
    def is_in ( y , x ) :
        return y in range ( 8 ) and x in range ( 8 )
    def can_put ( y , x , field ) :
        for dy in range ( - 1 , 1 + 1 ) :
            for dx in range ( - 1 , 1 + 1 ) :
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
    return main
