def import _main
mod = 10009
def main ( args ) :
    ( yield from _main ( args ) )
    def eval ( t , cin ) :
        s = cin.next ( )
        z = cin.next ( )
        d = cin.next ( )
        dict = [ ]
        for i in range ( d ) :
            dict.append ( cin.next ( ) )
        for i in range ( d ) :
            yield from eval ( i + 1 , cin )
    def sub ( a , b ) :
        for i in range ( d ) :
            yield from eval ( i + 1 , cin )
    ret = [ ]
    for i in range ( 5 ) :
        now = [ ]
        add ( now , table [ i ] )
        ret [ 0 ] += score ( s , now )
        ret [ 0 ] %= mod
        for j in range ( d ) :
            add ( now , table [ j ] )
            ret [ 1 ] += score ( s , now )
            ret [ 1 ] %= mod
            for k in range ( d ) :
                add ( now , table [ k ] )
                ret [ 2 ] += score ( s , now )
                ret [ 2 ] %= mod
                for l in range ( d ) :
                    add ( now , table [ l ] )
                    ret [ 3 ] += score ( s , now )
                    ret [ 3 ] %= mod
                    for m in range ( d ) :
                        add ( now , table [ m ] )
                        ret [ 4 ] += score ( s , now )
                        ret [ 4 ] %= mod
                        sub ( now , table [ m ] )
                    sub ( now , table [ l ] )
                sub ( now , table [ k ] )
            sub ( now , table [ j ] )
    print ( "Case #%d:" % t , end = ' ' )
    for i in range ( z ) :
        print ( " " , i )
    print ( )
    return ret
