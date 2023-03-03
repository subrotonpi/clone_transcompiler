def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            H , W = sc.split ( ' ' )
            self.data = [ ]
            S = [ ]
            for i in range ( H ) :
                for j in range ( W ) :
                    ss = self.data [ i ]
                    S.append ( ss )
            for i in range ( H ) :
                for j in range ( W ) :
                    if S [ i ] [ j ] == '#' :
                        if painting ( i , j , S ) == True :
                            continue
                        else :
                            print ( 'No' )
                            sys.exit ( )
            print ( 'Yes' )
        def painting ( self , h , w , S ) :
            isOK = False
            if h - 1 >= 0 and S [ h - 1 ] [ w ] == '#' :
                isOK = True
            elif h + 1 < len ( S ) and S [ h + 1 ] [ w ] == '#' :
                isOK = True
            elif w - 1 >= 0 and S [ h ] [ w - 1 ] == '#' :
                isOK = True
            elif w + 1 < len ( S [ 0 ] ) and S [ h ] [ w + 1 ] == '#' :
                isOK = True
            return isOK
    Main ( )
