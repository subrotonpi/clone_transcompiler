def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m , a , r , c , h = 0 , 0 , 0 , 0 , 0
        for s in sc.readlines ( ) :
            if s == 'M' :
                m += 1
            elif s == 'A' :
                a += 1
            elif s == 'R' :
                r += 1
            elif s == 'C' :
                c += 1
            elif s == 'H' :
                h += 1
        print ( m ** 2 * r + m ** 2 * c + m ** 2 * h + m * r ** 2 + m * r ** 2 + m * r ** 2 + m * r ** 2 + m * r ** 2 + r * r ** 2 + a * r ** 2 + r * r ** 2 + r * r ** 2 + r * r ** 2 + c * h )
