def import _B_MakeItSmooth
class B_MakeItSmooth ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'test/B-large.in' , 'rb' )
        self.stdout = open ( 'test/B-large.out' , 'wb' , encoding = 'ISO-8859-1' )
        f = sys.stdin.readlines ( )
        for c , T in enumerate ( map ( int , f.split ( '\n' ) ) ) :
            w = f.strip ( ).split ( ' +' )
            D , I , M , N = map ( int , w [ 0 ].split ( '' ) )
            w = f.strip ( ).split ( ' +' )
            for i in range ( N ) :
                m [ i ] = int ( w [ i ] )
            for i in range ( 0 , N ) :
                for s in range ( 0 , X ) :
                    if i == 0 :
                        mins [ i ] [ s ] = None
                    else :
                        MIN = float ( 'inf' )
                        if mins [ i - 1 ] [ s ] != float ( 'inf' ) :
                            MIN = D + mins [ i - 1 ] [ s ]
                        for v in range ( X ) :
                            if mins [ i - 1 ] [ v ] != float ( 'inf' ) :
                                if M > 0 :
                                    MIN = min ( MIN , abs ( m [ i - 1 ] [ v ] ) + ( v == s or s == X ) ) + mins [ i - 1 ] [ v ]
                                elif v == s or s == X :
                                    MIN = min ( MIN , abs ( m [ i - 1 ] [ v ] ) + 0 + mins [ i - 1 ] [ v ] )
                        mins [ i ] [ s ] = MIN
            print ( 'Case #%d: %.4f\n' % ( c + 1 , mins [ N ] [ X ] ) , end = '' )
    return B_MakeItSmooth
