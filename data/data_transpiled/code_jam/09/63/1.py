def _ import _ , os , sys , imp , code , compile , code , compile , code , sys ) :
    import os , sys , imp
    import os , sys , imp
    code = compile ( code , [ ] , [ ] , [ ] , code )
    mod = 10007
    def genall ( n , c ) :
        if n > 0 :
            for cc in [ c , 'z' ] :
                cur [ - n ] = cc
                genall ( n - 1 , cc )
        else :
            for i in range ( len ( cur ) ) :
                cur [ - n ] = cur [ - 1 ]
        return cur [ : - n ]
    def sol ( ) :
        try :
            a = imp.load_source ( 'input.txt' , file = sys.stdout )
        except Exception as E :
            raise SystemExit ( E )
    def loe ( a , b ) :
        for i in range ( len ( a ) ) :
            if a [ i ] < b [ i ] :
                return True
            if a [ i ] > b [ i ] :
                return False
        return True
    def search ( u ) :
        l = 0
        r = num
        while r - l > 1 :
            x = ( r + l ) >> 1
            if loe ( z [ x ] , u ) :
                l = x
            else :
                r = x
        return l
    def sol ( ) :
        m , n = code.regs [ 0 ]
        num = 0
        cur = [ ]
        z = [ genall ( n , 'a' ) ]
        s = [ ]
        for i in range ( m ) :
            s.append ( f.read ( ) )
        for j in range ( n - 1 , - 1 , - 1 ) :
            u [ j ] = z [ e ] [ j ]
    for i in range ( n ) :
        l = l + 1
        ne = [ 0 ]
        ol.append ( 1 )
        u = [ ]
        for i in range ( n ) :
            for e in range ( n ) :
                if s [ i ] != '.' and s [ i ] != z [ e ] [ j ] :