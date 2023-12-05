def _import ( ) :
    from os import urandom
    class B ( object ) :
        def _solve_test ( self ) :
            s = next ( urandom ( 1 ) )
            i = 0
            while i < len ( s ) - 1 and s [ i + 1 ] >= s [ i ] :
                i += 1
            if i == len ( s ) - 1 :
                return s
            while i > 0 and s [ i - 1 ] == s [ i ] :
                i -= 1
            res = ""
            for j in range ( len ( s ) ) :
                res += s [ j ] if j < i else chr ( ord ( s [ j ] ) - 1 ) if j == i else '9'
            if res [ 0 ] == '0' :
                res = res [ 1 : ]
            return res
        def solve ( self ) :
            n = randint ( 1 , 10000 )
            for i in range ( n ) :
                res = _solve_test ( )
                print ( "Case #%d: %s" % ( i + 1 , res ) )
                self.out.write ( "Case #%d: %s\n" % ( i + 1 , res ) )
    if sys.version_info [ 0 ] < 3 or not sys.version_info [ 1 ] :
        sys.stderr.write ( "No such file or directory\n" )
        sys.exit ( 1 )
    else :
        sys.stderr.write ( "No such file\n" )
        sys.exit ( 1 )
