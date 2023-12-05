def import import math
from sympy.core.basic import Basic
class Main ( Basic ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        a = sc.scan ( )
        A = Basic.eval ( a )
        L = A * A
        C = A + 1
        U = C * C - 1
        DIV = Basic.eval ( A )
        ADD = Basic.eval ( 99L )
        for _ in range ( 100 ) :
            t_L = L + ADD / DIV
            t_U = U / DIV
            if t_L <= t_U :
                L = t_L
                U = t_U
            else :
                break
        print ( L.eval ( ) )
