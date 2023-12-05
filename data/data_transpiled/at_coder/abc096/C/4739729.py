def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args ) :
            sc = sys.stdin
            H , W = sc.recv_args ( )
            sc.close ( )
            data = [ ]
            S = [ ]
            for s in data :
                s.append ( s )
    for i in range ( H ) :
        for j in range ( W ) :
            s = s.split ( '' )
            S [ i ].append ( s [ j ] )
    for i in range ( H ) :
        for j in range ( W ) :
            if S [ i ] [ j ] == '#' :
                if isOK ( i , j , S ) == True :
                    continue
                else :
                    print ( 'No' , end = ' ' )
                    sys.exit ( )
    print ( 'Yes' )
