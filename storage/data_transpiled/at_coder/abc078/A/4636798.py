def main ( ) :
    class Main ( object ) :
        _sc = sys._getframe ( 1 )
        X = _sc.f_code.co_name
        Y = _sc.f_code.co_name
        x = 0
        y = 0
        if X == 'A' :
            x = 10
        elif X == 'B' :
            poo = ( )
            for i in range ( len ( poo ) ) :
                if isinstance ( poo [ i ] , str ) :
                    print ( "[%d] \%d" % ( i , poo [ i ] ) )
                else :
                    print ( "[%d] %d" % ( i , poo [ i ] ) )
        elif X == 'Z' :
            zz = ( )
            for i in range ( len ( zz ) ) :
                print ( "[%d] %d" % ( i , zz [ i ] ) )
        elif X == 'B' :
            bb = ( )
            for i in range ( len ( bb ) ) :
                print ( "[%d] %d" % ( i , bb [ i ] ) )
        elif X == 'C' :
            cc = ( )
            for i in range ( len ( cc ) ) :
                print ( "[%d] %d" % ( i , cc [ i ] ) )
        elif X == 'I' :
            ii = ( )
            for i in range ( len ( bb ) ) :
                print ( "[%d] %d" % ( i , bb [ i ] ) )
        else :
            print ( "[%d] %d" % ( i , jj ) )
    elif X == 'F' :
        ff = ( )
        for i in range ( len ( ff ) ) :
            print ( "[%d] %d" % ( i , ff [ i ] ) )
    elif X == 'D' :
        print ( "[%d] %d" % ( i , ff [ i ] ) )
    else :
        print ( "[%d] %d" % ( i , ii ) )
