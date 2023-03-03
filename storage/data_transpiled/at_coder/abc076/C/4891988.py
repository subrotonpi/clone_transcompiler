def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        SS , TT = sc.readline ( ).split ( ' ' )
        S = SS [ : - 1 ]
        T = TT [ : - 1 ]
        if len ( S ) < len ( T ) :
            print ( "UNRESTORABLE" )
            return
        for i in range ( len ( S ) - len ( T ) , - 1 , - 1 ) :
            flag = True
            for j in range ( len ( T ) ) :
                if S [ i + j ] == '?' :
                    continue
                if S [ i + j ] != T [ j ] :
                    flag = False
            if flag :
                for j in range ( len ( T ) ) :
                    S [ i + j ] = T [ j ]
                for j in range ( len ( S ) ) :
                    if S [ j ] == '?' :
                        S [ j ] = 'a'
                    print ( S )
                    return
        print ( "UNRESTORABLE" )
