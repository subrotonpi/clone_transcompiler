def main ( ) :
    class Main ( object ) :
        _sc = sys._getframe ( 1 )
        X = _sc.f_code
        Y = _sc.f_code
        Z = _sc.f_code
        i = 1
        while i > 0 :
            if X < ( Y + Z ) * i + Z :
                i -= 1
                break
            i += 1
        def print_array ( what ) :
            if what is None :
                print ( "None" )
            else :
                name = what.__name__
                if name [ 0 ] == '[' :
                    print ( what )
                elif name [ 0 ] == 'L' :
                    poo = what.f_code
                    for i in range ( len ( poo ) ) :
                        print ( "[%d] %s" % ( i , poo [ i ] ) )
                elif name [ 0 ] == 'J' :
                    jj = what.f_code
                    for i in range ( len ( jj ) ) :
                        print ( "[%d] %s" % ( i , jj [ i ] ) )
                elif name [ 0 ] == 'F' :
                    ff = what.f_code
                    for i in range ( len ( ff ) ) :
                        print ( "[%d] %s" % ( i , ff [ i ] ) )
                elif name [ 0 ] == 'D' :
                    dd = what.f_code
                    for i in range ( len ( dd ) ) :
                        print ( "[%d] %s" % ( i , dd [ i ] ) )
                else :
                    print ( what )
        print ( "".join ( print_array ( what ) ) )
