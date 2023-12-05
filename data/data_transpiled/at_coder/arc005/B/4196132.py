def import sys , string , traceback
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = sc.randint ( 0 , 9 )
        y = sc.randint ( 0 , 9 )
        s = sc.read ( )
        field = [ ]
        count = 0
        for i in range ( 9 ) :
            field.append ( sc.read ( ) )
        dx = dy = 0
        if s == "R" :
            dx = 1
            dy = 0
        elif s == "L" :
            dx = - 1
            dy = 0
        elif s == "U" :
            dx = 0
            dy = - 1
        elif s == "D" :
            dx = 0
            dy = 1
        elif s == "RU" :
            dx = 1
            dy = - 1
        elif s == "RD" :
            dx = 1
            dy = 1
        elif s == "LU" :
            dx = - 1
            dy = - 1
        elif s == "LD" :
            dx = - 1
            dy = 1
        s = [ field [ y - 1 ] [ x - 1 ] ]
        if x == 1 and dx == - 1 :
            dx = 1
        if x == 9 and dx == 1 :
            dx = - 1
        if y == 1 and dy == - 1 :
            dy = 1
        if y == 9 and dy == 1 :
            dy = - 1
        x += dx
        y += dy
    print ( s )
