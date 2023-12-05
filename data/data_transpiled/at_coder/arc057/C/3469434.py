def import import math
from sympy.core.basic import Basic
class Main ( Basic ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        a = sc.scanner.next ( )
        A = Basic.__new__ ( Basic , a )
        L = A * A
        C = A + 1
        U = C * C
        DIV = Basic.__new__ ( Basic , A )
        ADD = Basic.__new__ ( Basic , 99L )
        for _ in range ( 100 ) :
            t_L = L + ADD / DIV
            t_U = U + ADD / DIV
            if t_L < t_U :
                L = t_L
                U = t_U
            else :
                break
        print ( L.__hash__ ( ) )
