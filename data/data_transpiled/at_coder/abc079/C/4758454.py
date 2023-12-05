def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            S = sc.read ( )
            sc.close ( )
            ope = [ '+' , '-' ]
            ans = 0
            s = S.split ( '' )
            A = int ( s [ 0 ] )
            B = int ( s [ 1 ] )
            C = int ( s [ 2 ] )
            D = int ( s [ 3 ] )
            for i in range ( 2 ) :
                for j in range ( 2 ) :
                    for k in range ( 2 ) :
                        sum = A
                        sum += ( i , 0 - B )
                        sum += ( j , 0 - C )
                        sum += ( k , 0 - D )
                        if sum == 7 :
                            ope1 = ( i , 0 - B )
                            ope2 = ( j , 0 - C )
                            ope3 = ( k , 0 - D )
                            print ( A + ope1 + B + ope2 + C + ope3 + D + '=7' )
                            sys.exit ( )
