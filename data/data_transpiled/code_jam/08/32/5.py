def _import ( ) : return 'No'
class Olymp ( ) :
    INPUT_NAME = 'input.txt'
    OUTPUT_NAME = 'output.txt'
    eps = 1e-10
    def prln ( st ) :
        print ( st )
    def input ( ) :
        with open ( INPUT_NAME , 'r' ) as sc :
            with open ( OUTPUT_NAME , 'w' ) as f :
                kol_c = sc.read ( )
                for i in range ( kol_c ) :
                    print ( )
                    print ( 'New case %d' % ( i + 1 ) )
                    st = sc.read ( )
                    print ( solve ( ) , solve_true ( ) )
                    print ( 'Case #%d: %s' % ( i + 1 , solve_true ( ) ) , file = f )
    def plus ( k ) :
        pos [ k ] += 1
        if pos [ k ] == 3 :
            pos [ k ] = 0
            plus ( k - 1 )
    def can ( ) :
        val = 0
        a = st [ 0 ] - '0'
        zn = 0
        for i in range ( 1 , len ( st ) ) :
            if pos [ i ] == 1 :
                if zn == 0 :
                    val += a
                    a = 0
                elif zn == 1 :
                    val -= a
                    a = 0
                zn = 0
            elif zn == 2 :
                if zn == 0 :
                    val += a
                    a = 0
                elif zn == 1 :
                    val -= a
                    a = 0
                zn = 1
        a = a * 10 + st [ i ] - '0'
    if zn == 0 :
        val += a
        a = 0
    elif zn == 1 :
        val -= a
        a = 0
    if val % 2 == 0 or val % 3 == 0 or val % 5 == 0 or val % 7 == 0 :
        return ''
    else :
        return ''
