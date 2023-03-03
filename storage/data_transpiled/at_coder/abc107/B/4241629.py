def import java.util.regex
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h , w = sc.recv_args ( )
        map = [ sc.decode ( 'ascii' ) for i in range ( h ) ]
        for i in range ( h ) :
            F = True
            for j in range ( w ) :
                if map [ i ] [ j ] == '#' :
                    F = False
                    break
            if F == True :
                for j in range ( w ) :
                    map [ i ] [ j ] = 'x'
        for i in range ( w ) :
            F = True
            for j in range ( h ) :
                if map [ i ] [ j ] == '#' :
                    F = False
                    break
            if F == True :
                for j in range ( h ) :
                    map [ i ] [ j ] = 'x'
        for i in range ( h ) :
            list = [ '' ]
            F = True
            for j in range ( w ) :
                if map [ i ] [ j ] != 'x' :
                    list.append ( map [ i ] [ j ] )
            if not F == True :
                print ( list )
