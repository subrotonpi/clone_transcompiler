def facebook ( ) :
    import sys
    sys.stdout = sys.__stdout__
    T = read_int ( )
    for ind in range ( 1 , T + 1 ) :
        sys.stdout.write ( 'Case #' + ind + ':' )
        sen = read_int_arr ( )
        count = 0
        for i in range ( N ) :
            count += len ( sen [ i ] )
        sys.stdout.write ( ''.join ( [ '%s%s' % ( i , j ) for j in range ( N ) ] ) )
    sys.stdout.write ( '\n' )
    class Qual ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdin.close ( )
        def read_float ( self ) :
            try :
                return float ( self.stdin.readline ( ) )
            except ValueError :
                pass
        def read_int_arr ( self ) :
            ret = None
            try :
                data = self.stdin.readline ( )
                tmp = data.split ( )
                ret = [ int ( i ) for i in tmp ]
            except ValueError :
                pass
            return ret
    def find ( arr , N , count ) :
        ret = ''
        if count < 3 :
            for i in range ( N ) :
                if arr [ i ] > 0 :
                    ret += unichr ( ord ( 'A' ) + i )
            return ret
        r = ( count + 1 ) // 2
        for i in range ( N ) :
            if arr [ i ] > r :
                ret += unichr ( ord ( 'A' ) + i )
            if arr [ i ] > r :
                ret += unichr ( ord ( 'A' ) + i )
        if ret :
            return ret
        ind = 0
        for i in range ( 1 , N ) :
            if arr [ i ] > r :
                ind = i
        if ind < N :
            return ind
    sys.stdout.write ( '\n' )
